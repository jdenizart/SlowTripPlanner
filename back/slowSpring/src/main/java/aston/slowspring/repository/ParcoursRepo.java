package aston.slowspring.repository;

import aston.slowspring.entity.Parcours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParcoursRepo extends JpaRepository<Parcours,Long> {
}
