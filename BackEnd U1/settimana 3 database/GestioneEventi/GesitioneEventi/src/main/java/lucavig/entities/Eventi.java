package lucavig.entities;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="Eventi")

public class Eventi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "titolo", nullable = false)
    private String titolo;

    @Column( name = "dataEvento", nullable = false)
    private Date dataEvento;

    @Column(name = "descrizione")
    private String descrizione;

     @Column(name = "tipoEvento", nullable = false)
     @Enumerated(EnumType.STRING)
    private EventType tipoEvento;

     @Column(name = "numero max partecipanti")
    private int numeroMassimoPartecipanti;

    public Eventi(String titolo, Date dataEvento, String descrizione, EventType tipoEvento, int numeroMassimoPartecipanti) {
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    public long getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Date getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public EventType getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(EventType tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }
}
