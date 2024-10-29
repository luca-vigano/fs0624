package lucavigano.WebApiBlogging.controllers;

import lucavigano.WebApiBlogging.entities.Autore;
import lucavigano.WebApiBlogging.payload.AutorePayload;
import lucavigano.WebApiBlogging.services.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autore")

public class AutoreController {


    @Autowired
    private AutoreService autoreService;

    @GetMapping
    public List<Autore> getAutore (){
        return this.autoreService.findAll();
    }

    @PostMapping
    public Autore addBlogPost (@RequestBody AutorePayload body){
        return this.autoreService.saveAutore(body);
    }

    @GetMapping("/{blogId}")
    public Autore findBlogPost (@PathVariable int blogId){
        return this.autoreService.findById(blogId);
    }

    @PutMapping("/{blogId}")
    public Autore findAndUpdate (@PathVariable int blogId,@RequestBody AutorePayload body){
        return this.autoreService.findByIdAndUpdate(blogId,body);
    }

    @DeleteMapping("/{blogId}")
    public void findAndDelete (@PathVariable int blogId){
        this.autoreService.findByIdAndDelete(blogId);
    }

}
