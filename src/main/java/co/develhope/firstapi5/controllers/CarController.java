package co.develhope.firstapi5.controllers;

import co.develhope.firstapi5.DTO.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/cars")
public class CarController {

    @GetMapping
    public CarDTO getCar(){
        CarDTO newCar = new CarDTO("1","Panda", 4000);
        return newCar;
    }

    /*@PostMapping("/a")
    public ResponseEntity<String> createCar(@RequestBody CarDTO car){
        return ResponseEntity.status(HttpStatus.CREATED).body(car.toString());
    }*/

    @PostMapping("/b")
    public ResponseEntity<Map<String, Object>> createCar(@RequestBody CarDTO car){
        Map<String,Object> carBody = new HashMap<>();
        carBody.put("id", car.getId());
        carBody.put("modelName", car.getModelName());
        carBody.put("price", car.getPrice());
        for(Map.Entry<String,Object> forMap : carBody.entrySet()){
            System.out.println(forMap.getKey() + " " + forMap.getValue());
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(carBody);
    }

}
