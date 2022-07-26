package aston.slowspring.services;

import aston.slowspring.entity.Preference;
import aston.slowspring.repository.PreferenceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreferenceService {
    @Autowired
    private PreferenceRepo preferenceRepo;
    public List<Preference> findAll() {

        return this.preferenceRepo.findAll();
    }

    public List<Preference> findByKilometrageEtapeMoyenne(String kilometrageEtapeMoyenne) {

        return null;
    }

    public Preference create(Preference newPreference) {

        return newPreference;
    }

    public Preference update(Preference preference) {

        return preference;
    }

    public Preference delete(Long preference_id) {

        return null;
    }
}
