package lucavig.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import lucavig.entities.Eventi;
import lucavig.entities.Partecipazione;
import lucavig.exceptions.NotFoundException;

public class PartecipazioneDAO {

    private final EntityManager entityManager;

    public PartecipazioneDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void savePartecipazione (Partecipazione newPartecipazione){

        // CHIEDERE A entityManager DI CREARE UNA NUOVA TRANSACTION:
        EntityTransaction transaction = entityManager.getTransaction();

        // AVVIARE LA TRANSACTION:
        transaction.begin();

        // ISTRUZIONI PER AGGIUNGERE UNA NUOVA PARTECIPAZIONE:
        entityManager.persist(newPartecipazione);

        // FARE COMMIT E INVIARE AL DB
        transaction.commit();

        System.out.println("La partecipazione " + newPartecipazione.getId()  + " è stata salvata correttamente");
    }

    public Partecipazione getById(long partecipazioneId) {
        Partecipazione partecipazioneTrovata = entityManager.find(Partecipazione.class, partecipazioneId);
        if (partecipazioneTrovata == null) throw new NotFoundException(partecipazioneId);
        return partecipazioneTrovata;
    }

    public void deletePartecipazione(long partecipazioneId){

        Partecipazione partecipazioneTrovata = this.getById(partecipazioneId);

        // CHIEDERE A entityManager DI CREARE UNA NUOVA TRANSACTION:
        EntityTransaction transaction = entityManager.getTransaction();

        // AVVIARE LA TRANSACTION:
        transaction.begin();

        // ISTRUZIONI PER RIMUOVERE UNA PARTECIPAZIONE  :
        entityManager.remove(partecipazioneTrovata);

        // FARE COMMIT E INVIARE AL DB
        transaction.commit();

        System.out.println("La partecipazione per l'evento " + partecipazioneTrovata.getEvento() + " è stata eliminata correttamente");
    }
}
