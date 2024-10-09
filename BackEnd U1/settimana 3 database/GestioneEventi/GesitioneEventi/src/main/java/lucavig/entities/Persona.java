package lucavig.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;


@Entity
@Table(name="Persona")

public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Nome", nullable = false)
    private String nome;

    @Column(name = "Cognome", nullable = false)
    private String cognome;

    @Column(name = "Email", nullable = false)
    private String email;

    @Column(name = "Data di nascita", nullable = false)
    private Date date;

    @Column(name = "Sesso", nullable = false)
    private Genre genre;

    @Column(name = "Lista partecipazioni")
    private List<Partecipazione> partecipazioniList;


    public Persona() {
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

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public List<Partecipazione> getPartecipazioniList() {
        return partecipazioniList;
    }

    public void setPartecipazioniList(List<Partecipazione> partecipazioniList) {
        this.partecipazioniList = partecipazioniList;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", date=" + date +
                ", genre=" + genre +
                ", partecipazioniList=" + partecipazioniList +
                '}';
    }
}
