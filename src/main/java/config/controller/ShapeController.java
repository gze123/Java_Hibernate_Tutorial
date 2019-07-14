package config.controller;

import config.model.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import config.service.ShapeService;

import java.util.List;

@RestController
public class ShapeController {

    @Autowired
    private ShapeService shapeService;
//
//    //Add new data
//    @PostMapping("/config")
//    public ResponseEntity<?> save(@RequestBody Shape config){
//        long id = shapeService.save(config);
//        return ResponseEntity.ok().body("New data added\t"+id);
//    }
//
//    //get config by id
//    @GetMapping("/config/{id}")
//    public ResponseEntity<Shape> get(@PathVariable("id") long id){
//        Shape config = shapeService.get(id);
//        return ResponseEntity.ok().body(config);
//    }

    //get all config
    @RequestMapping("/shapeList")
    public ResponseEntity<List<Shape>> list(){
        List<Shape> shapes = shapeService.list();
        return ResponseEntity.ok().body(shapes);
    }

//    //update config by id
//    @PutMapping("/config/{id}")
//    public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Shape config){
//        shapeService.update(id,config);
//        return ResponseEntity.ok().body("Data updated");
//    }
//
//    //delete config by id
//    @DeleteMapping("/config/{id}")
//    public ResponseEntity<?> delete(@PathVariable("id") long id){
//        shapeService.delete(id);
//        return ResponseEntity.ok().body("Data deleted");
//    }
}