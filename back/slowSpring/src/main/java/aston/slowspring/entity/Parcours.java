package aston.slowspring.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "parcours")
public class Parcours {

    // Attributs
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique=true, nullable=false)
    private Long parcours_id;
    @Column(nullable=false, length=100)
    private String nomParcours;
    @Column(length=255)
    private String description;
    @Column(length=200)
    private String image;
    @Column(nullable=false)
    private Date dateDepart;
    @Column(nullable=false)
    private int nombreJour;

    // Table reliée aux tables suivantes:
    @OneToMany(mappedBy = "parcours", fetch = FetchType.LAZY)
    private List<Balise> balises;

    @ManyToOne
    @JoinColumn(name="Profil_profil_id", nullable=false)
    private Profil profil;

    // dans une relation one to one, on met le join column dand la table où on veut la clé étrangere, et dnas l'autre on met mappedBY
    @OneToOne
    @JoinColumn(name="Preference_preference_id", nullable=false)
    private Preference preference;

    @ManyToOne
    @JoinColumn(name="Locomotion_locomotion_id", nullable=false)
    private Locomotion locomotion;

    // Constructeurs
    public Parcours() {
    }
    public Parcours(String nomParcours, Date dateDepart, int nombreJour) {
        this.nomParcours = nomParcours;
        this.dateDepart = dateDepart;
        this.nombreJour = nombreJour;
    }

    // Getters & Setters
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

    // METHODES
    // Jerome à retravailler!!!!!!!!
    public Balise addBalise(Balise balise) {
        getBalises().add(balise);
        balise.setParcour(this);
        return balise;
    }
    public Balise addBalisePosition(Balise balise, Long position) {
        getBalises().add(position,balise);
        balise.setParcour(this);
        return balise;
    }

    public Balise removeBalise(Balise balise) {
        getBalises().remove(balise);
        balise.setParcour(null);
        return balise;
    }


}
