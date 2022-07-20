package aston.slowspring.services;

import aston.slowspring.entity.Parcours;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParcoursService {
    public List<Parcours> findAll() {
        return null;
    }

    public List<Parcours> findByNomParcours(String nomParcours) {
        return null;
    }

    public Parcours create(Parcours newParcours) {
        return newParcours;
    }

    public Parcours update(Parcours parcours) {
        return parcours;
    }

    public Parcours delete(Long parcours_id) {
        return null;
    }
}
