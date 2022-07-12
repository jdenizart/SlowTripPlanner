package aston.slowspring.entity;

import javax.persistence.*;

@Entity
@Table(name = "point")
public class Point {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int point_id;
    @Column
    private String Longitude;
    @Column
    private String Latitude;
    @OneToOne
    private Balise balise;
    public Point() {
    }

    public Point(int point_id, String longitude, String latitude) {
        this.point_id = point_id;
        Longitude = longitude;
        Latitude = latitude;
    }

    public int getPoint_id() {
        return point_id;
    }

    public void setPoint_id(int point_id) {
        this.point_id = point_id;
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
}
