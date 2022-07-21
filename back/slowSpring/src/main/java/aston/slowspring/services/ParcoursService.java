package aston.slowspring.services;

import aston.slowspring.entity.Parcours;
import aston.slowspring.repository.ParcoursRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ParcoursService {
    @Autowired
    private ParcoursRepo parcoursRepo;
    public List<Parcours> findAll() {
        return null;
    }

    public List<Parcours> findByNomParcours(String nomParcours) {

        return this.parcoursRepo.findByNomParcours(nomParcours);
    }

    public Parcours create(Parcours newParcours) {
        return newParcours;
    }

    public Parcours update(Parcours parcours) {

        if (! this.parcoursRepo.existsById(parcours.getParcours_id())) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE,
                    "impossible de trouver lle parcours à mettre à jour");
        }
        return this.parcoursRepo.save(parcours);
    }

    public Parcours delete(Long parcours_id) {
        return null;
    }
}
