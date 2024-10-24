package lucavigno.springdb.services;


import lombok.extern.slf4j.Slf4j;
import lucavigno.springdb.entities.User;
import lucavigno.springdb.exception.ValidationException;
import lucavigno.springdb.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service //specializzazione del Component
//All'avvio dell'applicazione verrà creato un oggetto UsersServìce
// un Service è una classe che ci consente di aggiungere ulteriore logica custom
//nelle interazioni con il db tipo:
// controlli di sicurezza
//controllare e validare gli attributi che vengono passati
//aggiungere valori generati dal nostro codice prima di salvarlo nel db "Server-Generated"
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    // Es di controllo sulla save di un user
    public void saveUser(User newuser) {

        // 1. controllo che l'email non sia già presente
        // 2. Eseguo ulteriori controlli di validazione
        if (newuser.getName().length() < 2)
            throw new ValidationException("il nome non può essere più corto di 2 caratteri");
        // 3. Aggiungo ulteriori dati server generated
//        newuser.setProfileImg("URL");
        // 4. salvo l'utente
        usersRepository.save(newuser);
        // 5. log di avvenuto salvataggio
        log.info("l'utente " + newuser.getName() + " è stato salvato correttamente");
    }

    public void saveMany(List<User> newUsers) {
        for (User user : newUsers) {
            try {
                this.saveUser(user);
            } catch (ValidationException ex) {
                log.error(ex.getMessage());
            }
        }
    }

}
