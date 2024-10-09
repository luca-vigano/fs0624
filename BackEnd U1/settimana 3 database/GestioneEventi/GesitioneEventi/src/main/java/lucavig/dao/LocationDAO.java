package lucavig.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import lucavig.entities.Eventi;
import lucavig.entities.Location;
import lucavig.exceptions.NotFoundException;

public class LocationDAO {

    private final EntityManager entityManager;

    public LocationDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void saveLocation (Location newLocation){

        // CHIEDERE A entityManager DI CREARE UNA NUOVA TRANSACTION:
        EntityTransaction transaction = entityManager.getTransaction();

        // AVVIARE LA TRANSACTION:
        transaction.begin();

        // ISTRUZIONI PER AGGIUNGERE UN NUOVO EVENTO:
        entityManager.persist(newLocation);

        // FARE COMMIT E INVIARE AL DB
        transaction.commit();

        System.out.println("La location " + newLocation.getNome() + " è stata salvata correttamente");
    }

    public Location getById(long locationId) {
        Location locationTrovata = entityManager.find(Location.class, locationId);
        if (locationTrovata == null) throw new NotFoundException(locationId);
        return locationTrovata;
    }

    public void deleteLocation(long locationId){

        Location locationDaCancellare = this.getById(locationId);

        // CHIEDERE A entityManager DI CREARE UNA NUOVA TRANSACTION:
        EntityTransaction transaction = entityManager.getTransaction();

        // AVVIARE LA TRANSACTION:
        transaction.begin();

        // ISTRUZIONI PER RIMUOVERE UNA LOCATION:
        entityManager.remove(locationDaCancellare);

        // FARE COMMIT E INVIARE AL DB
        transaction.commit();

        System.out.println("L'evento " + locationDaCancellare.getNome() + " è stato eliminato correttamente");
    }

}
