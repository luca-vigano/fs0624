package lucavig.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import lucavig.entities.Eventi;

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
}
