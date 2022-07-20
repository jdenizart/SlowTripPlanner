package aston.slowspring.services;

import aston.slowspring.entity.Profil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfilService {
    public List<Profil> findAll() {
        return null;
    }

    public List<Profil> findByPseudo(String pseudo) {
        return null;
    }

    public Profil create(Profil newProfil) {
        return newProfil;
    }

    public Profil update(Profil profil) {
        return null;
    }

    public Profil delete(Long profil_id) {
        return null;
    }
}
