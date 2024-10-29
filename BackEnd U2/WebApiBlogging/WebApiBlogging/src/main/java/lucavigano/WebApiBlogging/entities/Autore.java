package lucavigano.WebApiBlogging.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Autore {
    private int id;
    private String nome;
    private String cognome;
    private String email;
    private int datadinascita;
    private String avatar;

    public Autore(String nome, String cognome, String email, int datadinascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.datadinascita = datadinascita;
        this.avatar = avatar;
    }
}
