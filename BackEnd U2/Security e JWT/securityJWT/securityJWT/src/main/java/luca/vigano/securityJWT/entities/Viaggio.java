package luca.vigano.securityJWT.entities;

import jakarta.persistence.*;
import lombok.*;
import luca.vigano.securityJWT.enums.Stati;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "viaggi")
@Getter
@Setter
@ToString
@NoArgsConstructor

public class Viaggio {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;

    private String destinazione;
    private LocalDate dataviaggio;

    @Enumerated(EnumType.STRING)
    private Stati stato;


    public Viaggio(String destinazione, LocalDate dataviaggio) {
        this.destinazione = destinazione;
        this.dataviaggio = dataviaggio;
        this.stato = Stati.IN_PROGRAMMA;
    }
}
