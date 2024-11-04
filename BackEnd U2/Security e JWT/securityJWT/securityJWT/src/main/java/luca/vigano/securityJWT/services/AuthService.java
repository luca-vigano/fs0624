package luca.vigano.securityJWT.services;

import luca.vigano.securityJWT.entities.Dipendente;
import luca.vigano.securityJWT.exception.UnauthorizedException;
import luca.vigano.securityJWT.payloads.DipendenteLoginDTO;
import luca.vigano.securityJWT.tools.JWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private DipendenteService dipendenteService;
    @Autowired
    private JWT jwt;

    public String checkCredenzialiAndToken(DipendenteLoginDTO body){

        Dipendente dipendenteFound = this.dipendenteService.finByEmail(body.email());
        if (dipendenteFound.getPassword().equals(body.password())){
            String accessToken = jwt.createToken(dipendenteFound);
            return accessToken;
        }else {
            throw new UnauthorizedException("credenziali inserite errate");
        }
    }

}
