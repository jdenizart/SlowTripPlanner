package aston.slowspring.controller;



import aston.slowspring.entity.Preference;

import aston.slowspring.services.PreferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@RestController
@RequestMapping("/points")
@CrossOrigin("http://localhost:4200")

public class PreferenceController {

    @Autowired
    private PreferenceService preferenceService;


    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Preference> findAll(){
        return this.preferenceService.findAll();
    }

    @GetMapping("/kimometrage/{KiloMetrageEtapeMoyenne}")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Preference> findByKilometrageEtapeMoyenne(@PathVariable String kilometrageEtapeMoyenne){
        return this.preferenceService.findByKilometrageEtapeMoyenne(kilometrageEtapeMoyenne);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Preference create(@RequestBody Preference newPreference) {
        return this.preferenceService.create(newPreference);
    };

    @PostMapping("/{preference_id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Preference update(@RequestBody Preference preference,@PathVariable Long preference_id) {
        if (!preference_id.equals(preference.getPreference_id())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "mauvaise preference à mettre à jour");
        }
        return this.preferenceService.update(preference);
    }

    @DeleteMapping("/{preference_id}")
    @ResponseStatus(code=HttpStatus.ACCEPTED)
    public Preference delete(@PathVariable Long preference_id) {
        return this.preferenceService.delete(preference_id);
    }

}
