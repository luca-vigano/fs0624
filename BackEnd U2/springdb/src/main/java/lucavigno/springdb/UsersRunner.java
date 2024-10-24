package lucavigno.springdb;

import lucavigno.springdb.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class UsersRunner implements CommandLineRunner {
    @Autowired
    private UsersService usersService;

    @Override
    public void run(String... args) throws Exception {

    }

}
