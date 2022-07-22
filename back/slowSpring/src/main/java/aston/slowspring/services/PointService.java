package aston.slowspring.services;

import aston.slowspring.entity.Point;
import aston.slowspring.repository.PointRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointService {
    @Autowired
    private PointRepo pointRepo;
    public List<Point> findAll() {

        return this.pointRepo.findAll();
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
