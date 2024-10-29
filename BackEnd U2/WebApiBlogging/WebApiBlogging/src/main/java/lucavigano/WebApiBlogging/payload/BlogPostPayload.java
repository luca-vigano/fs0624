package lucavigano.WebApiBlogging.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor

public class BlogPostPayload {

    private String categoria;
    private String titolo;
    private String contenuto;
    private int tempolettura;

}
