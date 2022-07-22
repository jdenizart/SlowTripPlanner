package aston.slowspring.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "profil")
public class Profil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private Long profil_id;
    @Column(nullable=false, length=45)
    private String pseudo;
    @Column(length=200)
    private String photo_profil;
    @Column(length=255)
    private String devise;

    // table reliée à celle de Parcours en 1 to many
    @OneToMany(mappedBy="profil")
    private List<Parcours> parcours;

    // Contructeurs
    public Profil() {
    }

    public Profil(String pseudo, String photo_profil, String devise, List<Parcours> parcours) {
        this.pseudo = pseudo;
        this.photo_profil = photo_profil;
        this.devise = devise;
        this.parcours = parcours;
    }

    public Profil(String pseudo) {
        this.pseudo = pseudo;
    }

    // Getters & Setters

    public Long getProfil_id() {
        return profil_id;
    }

    public void setProfil_id(Long profil_id) {
        this.profil_id = profil_id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPhoto_profil() {
        return photo_profil;
    }

    public void setPhoto_profil(String photo_profil) {
        this.photo_profil = photo_profil;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public List<Parcours> getParcours() {
        return parcours;
    }

    public void setParcours(List<Parcours> parcours) {
        this.parcours = parcours;
    }

    @Override
    public String toString() {
        return "Profil{" +
                "profil_id=" + profil_id +
                ", pseudo='" + pseudo + '\'' +
                ", photo_profil='" + photo_profil + '\'' +
                '}';
    }


}
