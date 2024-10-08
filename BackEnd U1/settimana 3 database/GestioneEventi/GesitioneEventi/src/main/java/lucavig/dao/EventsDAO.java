package lucavig.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import lucavig.entities.Eventi;
import lucavig.exceptions.NotFoundException;

public class EventsDAO {

    private final EntityManager entityManager;

    public EventsDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void saveEvent (Eventi newEventi){

        // CHIEDERE A entityManager DI CREARE UNA NUOVA TRANSACTION:
        EntityTransaction transaction = entityManager.getTransaction();

        // AVVIARE LA TRANSACTION:
        transaction.begin();

        // ISTRUZIONI PER AGGIUNGERE UN NUOVO EVENTO:
        entityManager.persist(newEventi);

        // FARE COMMIT E INVIARE AL DB
        transaction.commit();

        System.out.println("L'evento " + newEventi.getTitolo() + "è stato salvato correttamente");
    }

    public Eventi getById(long eventId) {
        Eventi eventoTrovato = entityManager.find(Eventi.class, eventId);
        if (eventoTrovato == null) throw new NotFoundException(eventId);
        return eventoTrovato;
    }

    public void deleteEvent(long eventId){

        Eventi eventoDaCancellare = this.getById(eventId);

        // CHIEDERE A entityManager DI CREARE UNA NUOVA TRANSACTION:
        EntityTransaction transaction = entityManager.getTransaction();

        // AVVIARE LA TRANSACTION:
        transaction.begin();

        // ISTRUZIONI PER AGGIUNGERE UN NUOVO EVENTO:
        entityManager.remove(eventoDaCancellare);

        // FARE COMMIT E INVIARE AL DB
        transaction.commit();

        System.out.println("L'evento " + eventoDaCancellare.getTitolo() + "è stato eliminato correttamente");
    }


}
