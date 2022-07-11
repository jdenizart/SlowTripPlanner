package aston.slowspring.repository;

import aston.slowspring.entity.Point;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointRepo extends JpaRepository<Point,Long> {
}
