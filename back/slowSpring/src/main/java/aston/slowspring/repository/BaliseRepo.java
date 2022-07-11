package aston.slowspring.repository;

import aston.slowspring.entity.Balise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BaliseRepo extends JpaRepository<Balise,Long> {

    List<Balise> findByNomBalise(String nombalise);

    List<Balise> findBydDateTime(String datetime);


}
