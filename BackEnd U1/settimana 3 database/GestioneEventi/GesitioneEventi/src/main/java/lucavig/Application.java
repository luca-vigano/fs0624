package lucavig;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import lucavig.dao.EventsDAO;
import lucavig.entities.EventType;
import lucavig.entities.Eventi;
import lucavig.exceptions.NotFoundException;

import java.util.Date;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("eventidb");

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();

        EventsDAO event = new EventsDAO(em);

        Eventi e = new Eventi("EICMA 2024", new Date(), "fiera automobilistica", EventType.PUBBLICO,10000);

        event.saveEvent(e);


//        try {
//            Eventi fromDb = event.getById(2);
//            System.out.println(fromDb);
//
//            event.deleteEvent(1);
//
//        } catch (NotFoundException exception) {
//            System.out.println(exception.getMessage());
//        }

        em.close();
        emf.close();
    }
}
