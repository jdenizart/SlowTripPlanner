package aston.slowspring.services;

import aston.slowspring.entity.Preference;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreferenceService {
    public List<Preference> findAll() {
        return null;
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
