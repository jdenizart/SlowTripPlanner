package aston.slowspring.entity;

import javax.persistence.*;

@Entity
@Table(name = "preference")
public class Preference {

    // Attributs
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long preference_id;
    @Column
    private Double kilometrageEtapeMoyenne;
    //  Table relié à celle du parcours (qui aura la clé étrangere)
    @OneToOne(mappedBy="preference")
    private Parcours parcours;



    // Constructeurs
    public Preference() {
    }

    public Preference(Double kilometrageEtapeMoyenne, Parcours parcours) {
        this.kilometrageEtapeMoyenne = kilometrageEtapeMoyenne;
        this.parcours = parcours;
    }

    // Getters & Setters
    public Long getPreference_id() {
        return preference_id;
    }
    public void setPreference_id(Long preference_id) {
        this.preference_id = preference_id;
    }
    public Double getKilometrageEtapeMoyenne() {
        return kilometrageEtapeMoyenne;
    }
    public void setKilometrageEtapeMoyenne(Double kilometrageEtapeMoyenne) {
        this.kilometrageEtapeMoyenne = kilometrageEtapeMoyenne;
    }
    public Parcours getParcours() {
        return parcours;
    }

    public void setParcours(Parcours parcours) {
        this.parcours = parcours;
    }

    @Override
    public String toString() {
        return "Preference{" +
                "preference_id=" + preference_id +
                ", kilometrageEtapeMoyenne=" + kilometrageEtapeMoyenne +
                ", parcours=" + parcours +
                '}';
    }
}
