package aston.slowspring.repository;

import aston.slowspring.entity.Locomotion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocomotionRepo extends JpaRepository<Locomotion,Long> {
}
