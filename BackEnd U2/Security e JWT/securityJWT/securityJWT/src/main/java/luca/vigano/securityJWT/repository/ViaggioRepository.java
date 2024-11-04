package luca.vigano.securityJWT.repository;

import luca.vigano.securityJWT.entities.Viaggio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ViaggioRepository extends JpaRepository<Viaggio, UUID> {
}
