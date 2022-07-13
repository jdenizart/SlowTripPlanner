package aston.slowspring.controller;

import aston.slowspring.entity.Balise;
import aston.slowspring.entity.Locomotion;
import aston.slowspring.services.BaliseService;
import aston.slowspring.services.LocomotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@RestController
@RequestMapping("/locomotion")

public class LocomotionController {


        @Autowired
        private LocomotionService locomotionService;


        @GetMapping("")
        @ResponseStatus(code = HttpStatus.OK)
        public List<Locomotion> findAll(){
            return this.locomotionService.findAll();
        }

        @GetMapping("/libeleLoco/{libeleLoco}")
        @ResponseStatus(code = HttpStatus.OK)
        public List<Locomotion> findByLibeleloco(@PathVariable String libeleloco){
            return this.locomotionService.findByLibeleloco(libeleloco);
        }

        @PostMapping("")
        @ResponseStatus(code = HttpStatus.CREATED)
        public Locomotion create(@RequestBody Locomotion newLocomotion) {
            return this.locomotionService.create(newLocomotion);
        };

        @PostMapping("/{locomotion-id}")
        @ResponseStatus(code = HttpStatus.ACCEPTED)
        public Locomotion update(@RequestBody Locomotion locomotion,@PathVariable Long locomotion_id) {
            if (!locomotion_id.equals(locomotion.getLocomotion_id())) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "mauvaise Locomotion a mettre à jour");
            }
            return this.locomotionService.update(locomotion);
        }

        @DeleteMapping("/{balise_id}")
        @ResponseStatus(code=HttpStatus.ACCEPTED)
        public Balise delete(@PathVariable Long balise_id) {
            return this.locomotionService.delete(balise_id);
        }

    }
