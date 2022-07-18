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

        return this.locomotionRepo.findByLibeleLoco(libeleloco);
    }

    public Locomotion create(Locomotion newLocomotion) {
        return this.locomotionRepo.save(newLocomotion);

    }

    public Locomotion update(Locomotion locomotion) {
        return this.locomotionRepo.save();
    }

    public Locomotion delete(Long locomotion_id) {
        return null;
    }
}
