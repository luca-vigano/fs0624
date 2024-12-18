package luca.vigano.securityJWT.services;

import luca.vigano.securityJWT.entities.Viaggio;
import luca.vigano.securityJWT.enums.Stati;
import luca.vigano.securityJWT.exception.BadRequestException;
import luca.vigano.securityJWT.exception.NotFoundException;
import luca.vigano.securityJWT.payloads.ViaggioDTO;
import luca.vigano.securityJWT.repository.ViaggioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.UUID;

@Service
public class ViaggioService {

    @Autowired
    private ViaggioRepository viaggioRepository;

    public Viaggio save(ViaggioDTO body){

        if(body.data_viaggio().isBefore(LocalDate.now())){
            throw new BadRequestException("la data inserita è già passata");
        }
        Viaggio newViaggio = new Viaggio(body.destinazione(), body.data_viaggio());

        return viaggioRepository.save(newViaggio);
    }

    public Page<Viaggio> findAll(int page, int size, String sortBy){
        if (size > 100) size = 100;
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return this.viaggioRepository.findAll(pageable);
    }

    public Viaggio findById(UUID viaggioId){
        return this.viaggioRepository.findById(viaggioId).orElseThrow(() -> new NotFoundException(viaggioId));
    }

    public Viaggio findByIdAndUpdate (UUID viaggioId, ViaggioDTO body){

        if(body.data_viaggio().isBefore(LocalDate.now())){
            throw new BadRequestException("la data inserita è già passata");
        }

        Viaggio viaggioFound = this.findById(viaggioId);
        viaggioFound.setDataviaggio(body.data_viaggio());
        viaggioFound.setDestinazione(body.destinazione());

        return this.viaggioRepository.save(viaggioFound);
    }

    public Viaggio findByIdAndChangeStatus (UUID viaggioId){
        Viaggio viaggioFound = this.findById(viaggioId);
        if(viaggioFound.getStato() == Stati.IN_PROGRAMMA){
            viaggioFound.setStato(Stati.COMPLETATO);
        } else {
            viaggioFound.setStato(Stati.IN_PROGRAMMA);
        }

        return this.viaggioRepository.save(viaggioFound);
    }

    public void findByIdAndDelete (UUID viaggioId){
        Viaggio viaggioFound = this.findById(viaggioId);
        this.viaggioRepository.delete(viaggioFound);
    }
}
