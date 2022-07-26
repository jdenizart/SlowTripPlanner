package aston.slowspring.services;

import aston.slowspring.entity.Profil;
import aston.slowspring.repository.ProfilRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfilService {
    @Autowired
    private ProfilRepo profilRepo;
    public List<Profil> findAll() {

        return this.profilRepo.findAll();
    }

    public List<Profil> findByPseudo(String pseudo) {
        return null;
    }

    public Profil create(Profil newProfil) {
        return this.profilRepo.save(newProfil);
    }

    public Profil update(Profil profil) {
        return null;
    }

    public Profil delete(Long profil_id) {
        return null;
    }
}
