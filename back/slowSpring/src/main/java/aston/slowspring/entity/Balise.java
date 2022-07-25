package aston.slowspring.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "balise")
public class Balise {

    // Attributs
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private Long balise_id;  // JEROME: homogénéité des noms bof (ici en serpent case eplus loin en camelcase)
    @Column(nullable = false, length = 45)
    private String nomBalise;
    @Column(nullable = true)
    private Date dateTime;  // JEROME: le nom n'est pas approprié, c'est une date seulement
    @Column(nullable = false)
    private Double distance;
    @Column(nullable = false)
    private boolean estVerouille;

    // est relié aux tables:
    @ManyToOne
    @JoinColumn(name = "parcours_balise_id", nullable = true)
    private Parcours parcours;
    @OneToOne
    @JoinColumn(name = "point_balise_id", nullable = true)



    private Point point;

    // contructeurs
    public Balise() {
    }
    public Balise(String nomBalise, Date dateTime, Double distance, boolean estVerouille, Parcours parcours, Point point) {
        this.nomBalise = nomBalise;
        this.dateTime = dateTime;
        this.distance = distance;
        this.estVerouille = estVerouille;
        this.parcours = parcours;
        this.point = point;
    }


    public Balise(Long balise_id, String nomBalise, Date dateTime, Double distance, boolean estVerouille, Parcours parcours, Point point) {
        this.balise_id = balise_id;
        this.nomBalise = nomBalise;
        this.dateTime = dateTime;
        this.distance = distance;
        this.estVerouille = estVerouille;
        this.parcours = parcours;
        this.point = point;
    }


    // getters & setters

    public Long getBalise_id() {
        return balise_id;
    }

    public void setBalise_id(Long balise_id) {
        this.balise_id = balise_id;
    }

    public String getNomBalise() {
        return nomBalise;
    }

    public void setNomBalise(String nomBalise) {
        this.nomBalise = nomBalise;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public boolean isEstVerouille() {
        return estVerouille;
    }

    public void setEstVerouille(boolean estVerouille) {
        this.estVerouille = estVerouille;
    }

    public Parcours getParcours() {
        return parcours;
    }

    public void setParcours(Parcours parcours) {
        this.parcours = parcours;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Balise{" +
                "balise_id=" + balise_id +
                ", nomBalise='" + nomBalise + '\'' +
                ", dateTime=" + dateTime +
                ", distance=" + distance +
                ", estVerouille=" + estVerouille +
                ", parcours=" + parcours +
                ", point=" + point +
                '}';
    }
}
