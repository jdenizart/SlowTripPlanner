package aston.slowspring.entity;

import javax.persistence.*;

@Entity
@Table(name = "point")
public class Point {

    // Attributs
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique=true, nullable=false)
    private int point_id;

    @Column(nullable=false, length=100)
    private String etiquette;

    @Column(nullable=false, length=12)
    private String Longitude;

    @Column(nullable=false, length=12)
    private String Latitude;

    // table reliée à la table point en 1 to 1
    @OneToOne(mappedBy="point")
    private Balise balise;


    // Constructeurs
    public Point() {
    }

    public Point(String etiquette, String longitude, String latitude, Balise balise) {
        this.etiquette = etiquette;
        Longitude = longitude;
        Latitude = latitude;
        this.balise = balise;
    }

    //  Getters & Setters
    public int getPoint_id() {
        return point_id;
    }

    public void setPoint_id(int point_id) {
        this.point_id = point_id;
    }

    public String getEtiquette() {
        return etiquette;
    }

    public void setEtiquette(String etiquette) {
        this.etiquette = etiquette;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public Balise getBalise() {
        return balise;
    }
    public void setBalise(Balise balise) {
        this.balise = balise;
    }

    @Override
    public String toString() {
        return "Point{" +
                "point_id=" + point_id +
                ", etiquette='" + etiquette + '\'' +
                ", Longitude='" + Longitude + '\'' +
                ", Latitude='" + Latitude + '\'' +
                '}';
    }
}
