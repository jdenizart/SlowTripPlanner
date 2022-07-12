package aston.slowspring.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "locomotion")
public class Locomotion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long locomotion_id;
    @Column
    private String libeleLoco;
    @Column
    private String descriptionLoco;
    @OneToMany
    private List<Parcours> parcours;


    public Locomotion() {
    }

    public Locomotion(Long locomotion_id, String libeleLoco, String descriptionLoco) {
        this.locomotion_id = locomotion_id;
        this.libeleLoco = libeleLoco;
        this.descriptionLoco = descriptionLoco;
    }

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

    public String getDescriptionLoco() {
        return descriptionLoco;
    }

    public void setDescriptionLoco(String descriptionLoco) {
        this.descriptionLoco = descriptionLoco;
    }
}
