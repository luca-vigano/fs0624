package lucavig.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Partecipazione")

public class Partecipazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Persona", nullable = false)
    private String persona;

    @Column(name = "Evento", nullable = false)
    private String evento;

    @Column(name = "Stato presenza", nullable = false)
    private Presenza presenza;


    public Partecipazione() {
    }

    public long getId() {
        return id;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public Presenza getPresenza() {
        return presenza;
    }

    public void setPresenza(Presenza presenza) {
        this.presenza = presenza;
    }

    @Override
    public String toString() {
        return "Partecipazione{" +
                "id=" + id +
                ", persona='" + persona + '\'' +
                ", evento='" + evento + '\'' +
                ", presenza=" + presenza +
                '}';
    }
}
