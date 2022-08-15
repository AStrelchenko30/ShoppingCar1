package com.example.shoppingcar.controller;

import com.example.shoppingcar.CarService;
import com.example.shoppingcar.model.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/add ")
    public List<Item> add(@RequestParam("id") List<Integer> id) {
        id.forEach(carService::add);
        return carService.getItem();
    }
    @GetMapping("/get")
    public List<Item> get(){
        return carService.getItem();
    }
}
