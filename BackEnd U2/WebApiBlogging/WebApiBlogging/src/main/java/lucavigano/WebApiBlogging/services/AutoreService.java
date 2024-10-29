package lucavigano.WebApiBlogging.services;

import lucavigano.WebApiBlogging.entities.Autore;
import lucavigano.WebApiBlogging.exceptions.NotFoundException;
import lucavigano.WebApiBlogging.payload.AutorePayload;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class AutoreService {

    private List<Autore> autoreList = new ArrayList<>();

    public List<Autore> findAll(){
        return this.autoreList;
    }

    public Autore saveAutore(AutorePayload body){
        Random random = new Random();
        Autore newAutore = new Autore(body.getNome(), body.getCognome(), body.getEmail(), body.getDatadinascita());
        newAutore.setId(random.nextInt(1,1000));
        newAutore.setAvatar("https://www.google.com/url?q=https://picsum.photos/200/300&sa=D&source=editors&ust=1730207921925655&usg=AOvVaw0ScKeAGe_jEoB4sY6s_vHv");
        autoreList.add(newAutore);
        return newAutore;
    }

    public Autore findById(int autoreId) {
        Autore autoreCercato = null;
        for (Autore autore : this.autoreList) {
            if (autore.getId() == autoreId) autoreCercato = autore;
        }
        if (autoreCercato == null) throw new NotFoundException(autoreId);
        return autoreCercato;
    }

    public Autore findByIdAndUpdate(int autoreId, AutorePayload body) {
        Autore autoreCercato = null;
        for (Autore autore : this.autoreList) {
            if (autore.getId() == autoreId) {
                autoreCercato = autore;
                autoreCercato.setNome(body.getNome());
                autoreCercato.setCognome(body.getCognome());
                autoreCercato.setEmail(body.getEmail());
                autoreCercato.setDatadinascita(body.getDatadinascita());
            }
        }
        if (autoreCercato == null) throw new NotFoundException(autoreId);
        return autoreCercato;
    }

    public void findByIdAndDelete(int autoreId) {
        Autore autoreCercato = null;
        for (Autore autore : this.autoreList) {
            if (autore.getId() == autoreId) autoreCercato = autore;
        }
        if (autoreCercato == null) throw new NotFoundException(autoreId);
        this.autoreList.remove(autoreCercato);
    }
}
