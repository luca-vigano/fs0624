package lucavig.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import lucavig.entities.Persona;
import lucavig.exceptions.NotFoundException;

public class PersonaDAO {

    private final EntityManager entityManager;

    public PersonaDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void savePersona (Persona newPersona){

        // CHIEDERE A entityManager DI CREARE UNA NUOVA TRANSACTION:
        EntityTransaction transaction = entityManager.getTransaction();

        // AVVIARE LA TRANSACTION:
        transaction.begin();

        // ISTRUZIONI PER AGGIUNGERE UN NUOVO EVENTO:
        entityManager.persist(newPersona);

        // FARE COMMIT E INVIARE AL DB
        transaction.commit();

        System.out.println("La persona " + newPersona.getNome() + " è stata salvata correttamente");
    }

    public Persona getById(long personaId) {
        Persona eventoTrovato = entityManager.find(Persona.class, personaId);
        if (eventoTrovato == null) throw new NotFoundException(personaId);
        return eventoTrovato;
    }

    public void deletePersona(long personaId){

        Persona personaDaCancellare = this.getById(personaId);

        // CHIEDERE A entityManager DI CREARE UNA NUOVA TRANSACTION:
        EntityTransaction transaction = entityManager.getTransaction();

        // AVVIARE LA TRANSACTION:
        transaction.begin();

        // ISTRUZIONI PER RIMUOVERE UN NUOVO EVENTO:
        entityManager.remove(personaDaCancellare);

        // FARE COMMIT E INVIARE AL DB
        transaction.commit();

        System.out.println("La persona " + personaDaCancellare.getNome() + " è stata eliminata correttamente");
    }
}
