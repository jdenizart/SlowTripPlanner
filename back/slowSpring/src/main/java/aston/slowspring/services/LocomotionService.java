package aston.slowspring.services;

import aston.slowspring.entity.Balise;
import aston.slowspring.entity.Locomotion;
import aston.slowspring.repository.LocomotionRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocomotionService {
    private LocomotionRepo locomotionRepo;
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

    public Locomotion delete(Long locomotion_id) {
        return null;
    }
}
