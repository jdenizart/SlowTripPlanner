package aston.slowspring.controller;


import aston.slowspring.entity.Point;

import aston.slowspring.services.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/points")
public class PointController {

    @Autowired
    private PointService pointService;


    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Point> findAll(){
        return this.pointService.findAll();
    }

    @GetMapping("/longitude/{Longitude}")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Point> findByLongitude(@PathVariable String Longitude){
        return this.pointService.findByLongitude(Longitude);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Point create(@RequestBody Point newPoints) {
        return this.pointService.create(newPoints);
    };

    @PostMapping("/{point_id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Point update(@RequestBody Point point,@PathVariable Long point_id) {
        if (!point_id.equals(point.getPoint_id())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "mauvais point à mettre à jour");
        }
        return this.pointService.update(point);
    }

    @DeleteMapping("/{point_id}")
    @ResponseStatus(code=HttpStatus.ACCEPTED)
    public Point delete(@PathVariable Long point_id) {
        return this.pointService.delete(point_id);
    }

}
