package aston.slowspring.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "parcours")
public class Parcours {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long parcours_id;
    @Column
    private String nomParcours;
    @Column
    private String description;
    @Column
    private String image;
    @Column
    private Date dateDepart;

    @Column
    private int nombreJour;
    @OneToMany(mappedBy = "parcours", fetch = FetchType.LAZY)
    private List<Balise> balises;
    @ManyToOne
    private Profil profil;
    @OneToOne
    private Preference preference;
    @ManyToOne
    private Locomotion locomotion;

    public Parcours() {
    }

    public Long getParcours_id() {
        return parcours_id;
    }

    public void setParcours_id(Long parcours_id) {
        this.parcours_id = parcours_id;
    }

    public String getNomParcours() {
        return nomParcours;
    }

    public void setNomParcours(String nomParcours) {
        this.nomParcours = nomParcours;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }





    public int getNombreJour() {
        return nombreJour;
    }

    public void setNombreJour(int nombreJour) {
        this.nombreJour = nombreJour;
    }

    @Override
    public String toString() {
        return "Parcours{" +
                "parcours_id=" + parcours_id +
                ", nomParcours='" + nomParcours + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", dateDepart=" + dateDepart +
                ", nombreJour=" + nombreJour +
                '}';
    }
}
