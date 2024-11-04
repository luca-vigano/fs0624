package luca.vigano.securityJWT.payloads;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record ErrorsResponseDTO(String message, LocalDateTime timestamp) {
}
