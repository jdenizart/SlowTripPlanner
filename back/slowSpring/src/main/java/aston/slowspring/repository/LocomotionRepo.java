package aston.slowspring.repository;

import aston.slowspring.entity.Locomotion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocomotionRepo extends JpaRepository<Locomotion,Long> {
    List<Locomotion> findByLibeleLoco(String libeleloco);
    // List<Locomotion> findByLibeleLoco(String libeleLoco);

    //List<Locomotion> findByDescriptionLoco(String descriptionLoco);
}
