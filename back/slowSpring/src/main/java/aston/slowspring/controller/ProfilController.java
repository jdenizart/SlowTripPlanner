package aston.slowspring.controller;

import aston.slowspring.entity.Preference;
import aston.slowspring.entity.Profil;

import aston.slowspring.services.ProfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@RestController
@RequestMapping("/points")
@CrossOrigin("http://localhost:4200")
public class ProfilController {
    @Autowired
    private ProfilService profilService;


    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Profil> findAll(){
        return this.profilService.findAll();
    }

    @GetMapping("/pseudo/{pseudo}")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Profil> findByPseudo(@PathVariable String pseudo){
        return this.profilService.findByPseudo(pseudo);
    }

    @GetMapping("/devise/{devise}")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Profil> findByDevise(@PathVariable String devise){
        return this.profilService.findByPseudo(devise);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Profil create(@RequestBody Profil newProfil) {
        return this.profilService.create(newProfil);
    };

    @PostMapping("/{profil_id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Profil update(@RequestBody Profil profil,@PathVariable Long profil_id) {
        if (!profil_id.equals(profil.getProfil_id())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "mauvais profil à mettre à jour");
        }
        return this.profilService.update(profil);
    }

    @DeleteMapping("/{profil_id}")
    @ResponseStatus(code=HttpStatus.ACCEPTED)
    public Profil delete(@PathVariable Long profil_id) {
        return this.profilService.delete(profil_id);
    }

}
