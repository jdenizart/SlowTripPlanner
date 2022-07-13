package aston.slowspring.repository;

import aston.slowspring.entity.Profil;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfilRepo extends JpaRepository<Profil,Long> {
    List<Profil> findByPseudo(String pseudo);

    List<Profil> findByDevise(String devise);
}
