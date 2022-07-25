package aston.slowspring.controller;

import aston.slowspring.entity.Parcours;

import aston.slowspring.services.ParcoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@RestController
@RequestMapping("/parcours")
@CrossOrigin("http://localhost:4200")
public class ParcoursController {

    @Autowired
    private ParcoursService parcoursService;


    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Parcours> findAll(){
        return this.parcoursService.findAll();
    }

    @GetMapping("/nomParcours/{nomParcours}")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Parcours> findByNomParcours(@PathVariable String nomParcours){
        return this.parcoursService.findByNomParcours(nomParcours);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Parcours create(@RequestBody Parcours newParcours) {
        return this.parcoursService.create(newParcours);
    };

    @PostMapping("/{parcours_id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Parcours update(@RequestBody Parcours parcours,@PathVariable Long parcours_id) {
        if (!parcours_id.equals(parcours.getParcours_id())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "mauvaise parcours à mettre à jour");
        }
        return this.parcoursService.update(parcours);
    }

    @DeleteMapping("/{parcours_id}")
    @ResponseStatus(code=HttpStatus.ACCEPTED)
    public Parcours delete(@PathVariable Long parcours_id) {
        return this.parcoursService.delete(parcours_id);
    }

}
