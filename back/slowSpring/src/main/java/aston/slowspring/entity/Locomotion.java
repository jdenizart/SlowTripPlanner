package aston.slowspring.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "locomotion")
public class Locomotion {

    // Attributs
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long locomotion_id;
    @Column
    private String libeleLoco;  /// faute d'orthographe

    // table reliée à celle du parcours en one to many, donc ici seulement mappedby
    @OneToMany(mappedBy = "locomotion")
    private List<Parcours> parcours;


    // Constructeurs
    public Locomotion() {
    }
    public Locomotion(String libeleLoco) {
        this.libeleLoco = libeleLoco;
    }

    // Getters & Setters
    public Long getLocomotion_id() {
        return locomotion_id;
    }
    public void setLocomotion_id(Long locomotion_id) {
        this.locomotion_id = locomotion_id;
    }
    public String getLibeleLoco() {
        return libeleLoco;
    }
    public void setLibeleLoco(String libeleLoco) {
        this.libeleLoco = libeleLoco;
    }
    public List<Parcours> getParcours() {
        return parcours;
    }
    public void setParcours(List<Parcours> parcours) {
        this.parcours = parcours;
    }

    @Override
    public String toString() {
        return "Locomotion{" +
                "locomotion_id=" + locomotion_id +
                ", libeleLoco='" + libeleLoco + '\'' +
                ", parcours=" + parcours +
                '}';
    }
}