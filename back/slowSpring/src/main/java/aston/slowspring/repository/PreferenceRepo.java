package aston.slowspring.repository;

import aston.slowspring.entity.Preference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreferenceRepo extends JpaRepository<Preference,Long> {
}
