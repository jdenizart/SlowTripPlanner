package aston.slowspring.config;

import aston.slowspring.repository.*;
import aston.slowspring.services.ParcoursService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDataBase {
    private static final Logger log = LoggerFactory.getLogger(LoadDataBase.class);

    @Bean
    CommandLineRunner initDatabase(BaliseRepo baliseRepo, ParcoursService parcoursService, LocomotionRepo locomotionRepo,
                                   PointRepo pointRepo, PreferenceRepo preferenceRepo, ProfilRepo profilRepo){


        return args -> {
            //System.out.println("test"+emploiTempsRepo.save(emploiTemps));
            //System.out.println("test"+feuilleEmargementRepo.save(feuilleEmargement));
            //System.out.println("test"+ baliseRepo.findAll());
            System.out.println("test"+ parcoursService.findAll());

        };

    }
}
