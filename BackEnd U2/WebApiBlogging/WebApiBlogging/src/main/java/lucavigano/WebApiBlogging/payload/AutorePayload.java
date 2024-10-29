package lucavigano.WebApiBlogging.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class AutorePayload {

    private String nome;
    private String cognome;
    private String email;
    private int datadinascita;
}
