package lucavig.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Location")

public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Nome", nullable = false)
    private String nome;

    @Column(name = "Città", nullable = false)
    private String citta;

    public Location() {
    }

    public long getId() {
        return id;
    }

     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", citta='" + citta + '\'' +
                '}';
    }
}
