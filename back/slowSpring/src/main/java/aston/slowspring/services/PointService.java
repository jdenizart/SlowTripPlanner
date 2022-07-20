package aston.slowspring.services;

import aston.slowspring.entity.Point;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointService {
    public List<Point> findAll() {
        return null;
    }

    public List<Point> findByLongitude(String longitude) {
        return null;
    }

    public Point create(Point newPoints) {
        return newPoints;
    }

    public Point update(Point point) {
        return point;
    }

    public Point delete(Long point_id) {
        return null;
    }
}
