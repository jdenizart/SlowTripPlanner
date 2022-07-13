package aston.slowspring.repository;

import aston.slowspring.entity.Point;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PointRepo extends JpaRepository<Point,Long> {

    List<Point> findByLongitude(String longitude);

    List<Point> findByLatitude(String latitude);
}
