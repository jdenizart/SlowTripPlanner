package aston.slowspring.services;

import aston.slowspring.entity.Balise;
import aston.slowspring.entity.Locomotion;
import aston.slowspring.repository.LocomotionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class LocomotionService {
    @Autowired
    private LocomotionRepo locomotionRepo;
    public List<Locomotion> findAll() {

        return this.locomotionRepo.findAll();
    }

    public List<Locomotion> findByLibeleloco(String libeleloco) {

        return this.locomotionRepo.findByLibeleLoco(libeleloco);
    }

    public Locomotion create(Locomotion newLocomotion) {
        return this.locomotionRepo.save(newLocomotion);

    }

    public Locomotion update(Locomotion locomotion) {

        if (! this.locomotionRepo.existsById(locomotion.getLocomotion_id())) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE,
                    "impossible de trouver la locomotion à mettre à jour");
        }


        return this.locomotionRepo.save(locomotion);
    }

    public Locomotion delete(Long locomotion_id) {

        return null;
    }
}
