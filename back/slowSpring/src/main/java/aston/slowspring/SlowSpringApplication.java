package aston.slowspring;

import aston.slowspring.entity.Balise;
import aston.slowspring.entity.Locomotion;
import aston.slowspring.entity.Parcours;
import aston.slowspring.entity.Profil;
import aston.slowspring.repository.BaliseRepo;
import aston.slowspring.repository.LocomotionRepo;
import aston.slowspring.repository.ParcoursRepo;
import aston.slowspring.repository.ProfilRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SlowSpringApplication implements CommandLineRunner {
    @Autowired
    private BaliseRepo baliseRepo;
    @Autowired
    private ProfilRepo profilRepo;

    @Autowired
    private LocomotionRepo locomotionRepo;
    @Autowired
    private ParcoursRepo parcoursRepo;
    public static void main(String[] args) {

        SpringApplication.run(SlowSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    //baliseRepo.save(new Balise("balise2",null ,2.0,true,null,null));
    //baliseRepo.save(new Balise("balise1",null ,3.0,false,null,null));
    //profilRepo.save(new Profil("meiry11","null","Respirez le courage, expirez la peur",null));
    //locomotionRepo.save(new Locomotion("velo",null));
    //locomotionRepo.save(new Locomotion("trotinette",null));
    //locomotionRepo.save(new Locomotion("skateBoard",null));


   /* profilRepo.findAll().forEach(p->{
        System.out.println(p.toString());
    });
    baliseRepo.findAll().forEach(b->{
        System.out.println(b.toString());
    });

    locomotionRepo.findAll().forEach(l->{
            System.out.println(l.toString());
        });**/
        locomotionRepo.findAll().forEach(l->{
            System.out.println(l.toString());
        });
    }
}
