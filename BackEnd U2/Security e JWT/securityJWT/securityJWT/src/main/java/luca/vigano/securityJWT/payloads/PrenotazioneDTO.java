package luca.vigano.securityJWT.payloads;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import luca.vigano.securityJWT.entities.Dipendente;
import luca.vigano.securityJWT.entities.Viaggio;

import java.time.LocalDate;
import java.util.UUID;

public record PrenotazioneDTO(

        @NotNull(message = "La data della richiesta è obbligatoria!")
        LocalDate dataRichiesta,
        @NotNull(message = "l' Id del viaggio è obbligatorio!")
        UUID viaggioId,
        @NotNull(message = "l'Id del dipendente è obbligatorio!")
        UUID dipendenteId,
        String note) {
}
