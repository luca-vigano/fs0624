package luca.vigano.securityJWT.repository;

import luca.vigano.securityJWT.entities.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface DipenteRepository extends JpaRepository<Dipendente, UUID> {
    Optional<Dipendente> findByEmail(String email);

}
