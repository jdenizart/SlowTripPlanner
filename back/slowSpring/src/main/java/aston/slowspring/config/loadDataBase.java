package aston.slowspring.config;

import aston.slowspring.entity.Balise;
import aston.slowspring.entity.Parcours;
import aston.slowspring.repository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.List;

public class loadDataBase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(BaliseRepo baliseRepo, LocomotionRepo locomotionRepo, ParcoursRepo parcoursRepo, PointRepo pointRepo,
                                   PreferenceRepo preferenceRepo,ProfilRepo profilRepo) {
        return args -> {
            // preparation format date
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            // prearation de formateur et stagiaire
            Parcours AA = new Parcours()
            Balise A = new Balise( "SULTAN", sdf.parse("01/07/2015"), 3.3,true,Parcours.);
            Balise B = new Formateur(Civilite.M, "ROUTIER", "Benoit", "benoit@gmail.com",
                    sdf.parse("01/07/2011"), 15, true);
            Stagiaire romain = new Stagiaire(Civilite.M, "VASSEUR", "Romain", "romain@gmail.com",
                    sdf.parse("25/12/1983"));
            Stagiaire cyril = new Stagiaire(Civilite.M, "ROMANO", "Cyril", "cyril@gmail.com", sdf.parse("05/05/1982"));
            Stagiaire alex = new Stagiaire(Civilite.M, "WOLNY", "Alexandre", "alexandre@gmail.com",
                    sdf.parse("05/05/1985"));
            // ajout d'un formateur aux stagiaires
            romain.setFormateur(benoit);
            cyril.setFormateur(benoit);
            alex.setFormateur(benoit);

            // preparation des matieres
            Matiere html = new Matiere("HTML", 2, Difficulte.FACILE);
            Matiere js = new Matiere("Javascript", 3, Difficulte.MOYEN);
            Matiere java = new Matiere("JAVA", 5, Difficulte.FACILE);
            Matiere spring = new Matiere("Spring Core", 3, Difficulte.MOYEN);
            Matiere angular = new Matiere("Angular", 5, Difficulte.DIFFICILE);

            // ajout de matieres au formateurs
            eric.setCompetences(List.of(html, js));
            benoit.setCompetences(List.of(html, js, java, angular, spring));

            // praparation des adresses
            Adresse adr1 = new Adresse("1 rue de la Paix", "", "75008", "Paris", "France");
            Adresse adr2 = new Adresse("1 place du centre", "bis", "59000", "Lille", "France");
            Adresse adr3 = new Adresse("1 rue Sainte Catherine", "", "33000", "Bordeaux", "France");
            Adresse adr4 = new Adresse("1 place du Capitole", "3iemeEtage", "86000", "Poitiers", "France");
            Adresse adr5 = new Adresse("1 plaza de milano", "", "445211", "Parme", "Italie");

            // ajout des adresses
            eric.setAdresse(adr1);
            alex.setAdresse(adr5);

            // enregistrement d'adresses
            log.info("loading data " + adresseRepo.save(adr1));
            log.info("loading data " + adresseRepo.save(adr2));
            log.info("loading data " + adresseRepo.save(adr3));
            log.info("loading data " + adresseRepo.save(adr4));
            log.info("loading data " + adresseRepo.save(adr5));

            // enregistrement de matieres
            log.info("loading data " + matiereRepo.save(html));
            log.info("loading data " + matiereRepo.save(js));
            log.info("loading data " + matiereRepo.save(java));
            log.info("loading data " + matiereRepo.save(spring));
            log.info("loading data " + matiereRepo.save(angular));

            // enregistrement de formateurs et stagiaire
            log.info("loading data " + personneRepo.save(eric));
            log.info("loading data " + personneRepo.save(benoit));
            log.info("loading data " + personneRepo.save(romain));
            log.info("loading data " + personneRepo.save(cyril));
            log.info("loading data " + personneRepo.save(alex));

        };
    }
}
