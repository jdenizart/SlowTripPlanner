package aston.slowspring.controller;

import aston.slowspring.entity.Balise;
import aston.slowspring.services.BaliseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/balises")
@CrossOrigin("http://localhost:4200")
public class BaliseController {
    @Autowired
    private BaliseService baliseService;


    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Balise> findAll(){
      return this.baliseService.findAll();
    }

    @GetMapping("/nomBalise/{nomBalise}")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Balise> findByNomBalise(@PathVariable String nomBalise){
        return this.baliseService.findByNomBalise(nomBalise);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Balise create(@RequestBody Balise newBalise) {
        return this.baliseService.create(newBalise);
    };

    @PostMapping("/{balise_id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Balise update(@RequestBody Balise balise,@PathVariable Long balise_id) {
        if (!balise_id.equals(balise.getBalise_id())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "mauvaise Balise a mettre à jour");
        }
        return this.baliseService.update(balise);
    }

    @DeleteMapping("/{balise_id}")
    @ResponseStatus(code=HttpStatus.ACCEPTED)
    public Balise delete(@PathVariable Long balise_id) {
        return this.baliseService.delete(balise_id);
    }

}
