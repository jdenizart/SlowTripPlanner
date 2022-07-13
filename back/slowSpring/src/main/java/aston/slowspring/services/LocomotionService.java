package aston.slowspring.services;

import aston.slowspring.entity.Balise;
import aston.slowspring.entity.Locomotion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocomotionService {
    public List<Locomotion> findAll() {
        return null;
    }

    public List<Locomotion> findByLibeleloco(String libeleloco) {
        return null;
    }

    public Locomotion create(Locomotion newLocomotion) {
        return newLocomotion;
    }

    public Locomotion update(Locomotion locomotion) {
        return locomotion;
    }

    public Balise delete(Long balise_id) {
        return null;
    }
}
