package aston.slowspring.repository;

import aston.slowspring.entity.Preference;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PreferenceRepo extends JpaRepository<Preference,Long> {

    List<Preference> findByKilometrageEtapeMoyenne(String kilometrageEtapemoyenne);


}
