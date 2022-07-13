package aston.slowspring.services;

import aston.slowspring.entity.Balise;
import aston.slowspring.repository.BaliseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BaliseService {
    @Autowired
    private BaliseRepo baliseRepo;
    public List<Balise> findAll() {
        return this.baliseRepo.findAll();
    }

    public List<Balise> findByNomBalise(String nomBalise) {
        return this.baliseRepo.findByNomBalise(nomBalise);
    }

    public Balise create(Balise newBalise) {
        return this.baliseRepo.save(newBalise);
    }

    public Balise update(Balise balise) {
        if (! this.baliseRepo.existsById(balise.getBalise_id())) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE,
                    "impossible de trouver la balise a mettre à jour");
        }
        return this.baliseRepo.save(balise);
    }


    public Balise delete(Long balise_id) {
        return null;
    }
}
