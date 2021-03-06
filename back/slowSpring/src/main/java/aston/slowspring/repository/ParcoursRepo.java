package aston.slowspring.repository;

import aston.slowspring.entity.Parcours;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ParcoursRepo extends JpaRepository<Parcours,Long> {

    List<Parcours> findByNomParcours(String nomParcours);

    List<Parcours> findByDescription(String description);
}
