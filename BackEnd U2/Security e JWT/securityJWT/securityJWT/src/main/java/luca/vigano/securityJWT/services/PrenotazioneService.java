package luca.vigano.securityJWT.services;


import luca.vigano.securityJWT.entities.Dipendente;
import luca.vigano.securityJWT.entities.Prenotazione;
import luca.vigano.securityJWT.entities.Viaggio;
import luca.vigano.securityJWT.exception.BadRequestException;
import luca.vigano.securityJWT.exception.NotFoundException;
import luca.vigano.securityJWT.payloads.PrenotazioneDTO;
import luca.vigano.securityJWT.repository.PrenotazioneRepository;
import luca.vigano.securityJWT.repository.DipenteRepository;
import luca.vigano.securityJWT.repository.ViaggioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PrenotazioneService {
    @Autowired
    private PrenotazioneRepository prenotazioneRepository;
    @Autowired
    private DipenteRepository dipendenteRepository;
    @Autowired
    private ViaggioRepository viaggioRepository;

    public Prenotazione save(PrenotazioneDTO body){
        Dipendente dipendente = dipendenteRepository.findById(body.dipendenteId())
                .orElseThrow(() -> new NotFoundException(body.dipendenteId()));

        Viaggio viaggio = viaggioRepository.findById(body.viaggioId())
                .orElseThrow(() -> new NotFoundException(body.viaggioId()));

        List<Prenotazione> prenotazioniEsistenti = prenotazioneRepository.findByDipendente_EmailAndViaggio_Dataviaggio(dipendente.getEmail(), viaggio.getDataviaggio());

        if (!prenotazioniEsistenti.isEmpty()) {
            throw new BadRequestException("L'utente ha già una prenotazione per questa data!");
        }

        Prenotazione prenotazione = new Prenotazione();
        prenotazione.setDataRichiesta(body.dataRichiesta());
        prenotazione.setDipendente(dipendente);
        prenotazione.setViaggio(viaggio);
        prenotazione.setNote(body.note());

        return prenotazioneRepository.save(prenotazione);
    }

    public Page<Prenotazione> findAll(int page, int size, String sortBy){
        if (size > 100) size = 100;
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return this.prenotazioneRepository.findAll(pageable);
    }

    public Prenotazione findById(UUID prenotazioneId){
        return this.prenotazioneRepository.findById(prenotazioneId).orElseThrow(() -> new NotFoundException(prenotazioneId));
    }

    public Prenotazione findByIdAndUpdate(UUID prenotazioneId, PrenotazioneDTO prenotazioneDTO) {
        Prenotazione prenotazione = prenotazioneRepository.findById(prenotazioneId)
                .orElseThrow(() -> new NotFoundException(prenotazioneId));

        if (prenotazioneDTO.dipendenteId() != null) {
            Dipendente dipendente = dipendenteRepository.findById(prenotazioneDTO.dipendenteId())
                    .orElseThrow(() -> new NotFoundException(prenotazioneId));
            prenotazione.setDipendente(dipendente);
        }

        if (prenotazioneDTO.viaggioId() != null) {
            Viaggio viaggio = viaggioRepository.findById(prenotazioneDTO.viaggioId())
                    .orElseThrow(() -> new NotFoundException(prenotazioneId));
            prenotazione.setViaggio(viaggio);
        }

        if (prenotazioneDTO.note() != null) {
            prenotazione.setNote(prenotazioneDTO.note());
        }

        return prenotazioneRepository.save(prenotazione);
    }

    public void findByIdAndDelete (UUID prenotazioneId){
        Prenotazione viaggioFound = this.findById(prenotazioneId);
        this.prenotazioneRepository.delete(viaggioFound);
    }
}
