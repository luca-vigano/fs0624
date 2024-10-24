package lucavig.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Partecipazione")

public class Partecipazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn (name = "Persona", nullable = false)
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "Evento", nullable = false)
    private Eventi evento;

    @Column(name = "Stato presenza", nullable = false)
    private Presenza presenza;


    public Partecipazione() {
    }

    public Partecipazione(Persona persona, Eventi evento, Presenza presenza) {
        this.persona = persona;
        this.evento = evento;
        this.presenza = presenza;
    }

    public long getId() {
        return id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Eventi getEvento() {
        return evento;
    }

    public void setEvento(Eventi evento) {
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
