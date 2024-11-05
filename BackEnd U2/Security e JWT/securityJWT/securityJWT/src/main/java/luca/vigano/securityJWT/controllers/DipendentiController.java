package luca.vigano.securityJWT.controllers;

import luca.vigano.securityJWT.entities.Dipendente;
import luca.vigano.securityJWT.exception.BadRequestException;
import luca.vigano.securityJWT.payloads.DipendenteDTO;
import luca.vigano.securityJWT.services.DipendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/dipendenti")
public class DipendentiController {

    @Autowired
    private DipendenteService dipendenteService;

    //+++++++++++++++++++++ ADMIN++++++++++++++++++++++++++++++++++++++

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public Page<Dipendente> findAll(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size,
                                    @RequestParam(defaultValue = "id") String sortBy) {
        return this.dipendenteService.findAll(page, size, sortBy);
    }

    @GetMapping("/{dipendenteId}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public Dipendente findById(@PathVariable UUID dipendenteId) {
        return this.dipendenteService.findById(dipendenteId);
    }

    @PutMapping("/{dipendenteId}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public Dipendente findByIdAndUpdate(@PathVariable UUID dipendenteId, @RequestBody @Validated DipendenteDTO body, BindingResult validationResult) {
        if (validationResult.hasErrors()) {
            validationResult.getAllErrors().forEach(System.out::println);
            throw new BadRequestException("Errore nel payload!");
        }
        return this.dipendenteService.findByIdAndUpdate(dipendenteId, body);
    }

    @DeleteMapping("/{dipendenteId}")
    @PreAuthorize("hasAuthority('ADMIN')")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void findByIdAndDelete(@PathVariable UUID dipendenteId) {
        this.dipendenteService.findByIdAndDelete(dipendenteId);
    }


    //+++++++++++++++++++++++++++++++ /ME ++++++++++++++++++++++++++++++++++++++++++

    @GetMapping("/me")
    public Dipendente getProfile(@AuthenticationPrincipal Dipendente currentAuthenticatedUser) {
        return currentAuthenticatedUser;
    }

    @PutMapping("/me")
    public Dipendente updateProfile(@AuthenticationPrincipal Dipendente currentAuthenticatedUser, @RequestBody @Validated DipendenteDTO body) {
        return this.dipendenteService.findByIdAndUpdate(currentAuthenticatedUser.getId(), body);
    }

    @DeleteMapping("/me")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProfile(@AuthenticationPrincipal Dipendente currentAuthenticatedUser) {
        this.dipendenteService.findByIdAndDelete(currentAuthenticatedUser.getId());
    }

//    @PatchMapping("/{dipendenteId}/avatar")
//    public Dipendente uploadAvatar(@PathVariable UUID dipendenteId, @RequestParam("avatar")MultipartFile file){
//        return this.dipendenteService.uploadAvatar(dipendenteId,file);
//    }
}
