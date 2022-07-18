package aston.slowspring.entity;

import javax.persistence.*;

@Entity
@Table(name = "preference")
public class Preference {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long preference_id;
    @Column
    private int kilometrageEtapeMoyenne;
   @ManyToOne
   private Profil profil;
   @OneToOne
   private Parcours parcours;

    public Preference() {
    }

    public Long getPreference_id() {
        return preference_id;
    }

    public void setPreference_id(Long preference_id) {
        this.preference_id = preference_id;
    }

    public int getKilometrageEtapeMoyenne() {
        return kilometrageEtapeMoyenne;
    }

    public void setKilometrageEtapeMoyenne(int kilometrageEtapeMoyenne) {
        this.kilometrageEtapeMoyenne = kilometrageEtapeMoyenne;
    }

    public Profil getProfil() {
        return profil;
    }

    public void setProfil(Profil profil) {
        this.profil = profil;
    }

    public Parcours getParcours() {
        return parcours;
    }

    public void setParcours(Parcours parcours) {
        this.parcours = parcours;
    }
}
