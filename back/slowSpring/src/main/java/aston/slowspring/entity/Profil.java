package aston.slowspring.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "profil")
public class Profil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long profil_id;
    @Column
    private String pseudo;
    @Column
    private String photo_profil;
    @Column
    private String devise;
    @OneToMany
    private List<Parcours> parcours;
    @OneToMany
    private List<Preference> preferences;

    public Profil() {
    }

    public Profil(Long profil_id, String pseudo, String photo_profil) {
        this.profil_id = profil_id;
        this.pseudo = pseudo;
        this.photo_profil = photo_profil;
    }

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

    @Override
    public String toString() {
        return "Profil{" +
                "profil_id=" + profil_id +
                ", pseudo='" + pseudo + '\'' +
                ", photo_profil='" + photo_profil + '\'' +
                '}';
    }
}
