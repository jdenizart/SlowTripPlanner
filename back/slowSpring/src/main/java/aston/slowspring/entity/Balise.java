package aston.slowspring.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "balise")
public class Balise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique=true, nullable=false)
    private Long balise_id;
    @Column(nullable = false, length = 45)
    private String nomBalise;
    @Column(nullable = false)
    private Date dateTime;
    @Column(nullable = false)
    private Double distance;
    @Column(nullable = false)
    private boolean estVerouille;
    @ManyToOne
    @JoinColumn(name = "Parcours_parcours_id", nullable = false)
    private Parcours parcours;

    @OneToOne
    private Point point;

    public Balise() {
    }

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
