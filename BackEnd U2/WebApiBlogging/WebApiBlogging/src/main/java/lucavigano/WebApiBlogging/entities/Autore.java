package lucavigano.WebApiBlogging.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString

public class Autore {
    private int id;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate datadinascita;
    private String avatar;

    public Autore(String nome, String cognome, String email, LocalDate datadinascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.datadinascita = datadinascita;
        this.avatar = "https://ui-avatars.com/api/?name=" + nome + "+" + cognome;
    }
}
