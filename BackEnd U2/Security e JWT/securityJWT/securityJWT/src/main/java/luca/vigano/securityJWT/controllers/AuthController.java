package luca.vigano.securityJWT.controllers;

import luca.vigano.securityJWT.entities.Dipendente;
import luca.vigano.securityJWT.exception.BadRequestException;
import luca.vigano.securityJWT.payloads.DipendenteDTO;
import luca.vigano.securityJWT.payloads.DipendenteLoginDTO;
import luca.vigano.securityJWT.payloads.DipendenteLoginResponseDTO;
import luca.vigano.securityJWT.services.AuthService;
import luca.vigano.securityJWT.services.DipendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;
    @Autowired
    private DipendenteService dipendenteService;

    @PostMapping("/login")
    public DipendenteLoginResponseDTO login(@RequestBody DipendenteLoginDTO body){
        return  new DipendenteLoginResponseDTO(this.authService.checkCredenzialiAndToken(body));
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public Dipendente save(@RequestBody @Validated DipendenteDTO body, BindingResult validationResult) {
        // @Validated serve per "attivare" le regole di validazione descritte nel DTO
        // BindingResult contiene l'esito della validazione, quindi sarà utile per capire se ci sono stati errori e quali essi siano
        if (validationResult.hasErrors()) {
            String message = validationResult.getAllErrors().stream().map(objectError -> objectError.getDefaultMessage())
                    .collect(Collectors.joining(". "));
            throw new BadRequestException("Ci sono stati errori nel payload! " + message);
        }

        return this.dipendenteService.save(body);
    }
}
