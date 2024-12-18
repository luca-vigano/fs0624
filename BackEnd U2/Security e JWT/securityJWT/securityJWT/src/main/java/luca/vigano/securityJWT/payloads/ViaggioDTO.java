package luca.vigano.securityJWT.payloads;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


import java.time.LocalDate;

public record ViaggioDTO(

        @NotEmpty(message = "La destinazione è obbligatoria!")
        @Size(min = 2, max = 40, message = "La destinazione deve essere compreso tra 2 e 40 caratteri!")
        String destinazione,
        @NotNull(message = "La data del viaggio è obbligatoria!")
        LocalDate data_viaggio) {
}
