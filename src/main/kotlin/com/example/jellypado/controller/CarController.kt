package com.example.jellypado.controller

import com.example.jellypado.model.Car
import com.example.jellypado.service.CarService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api")
class CarController (@Autowired var carService: CarService) {
    @GetMapping("/car")
    fun findCar(@RequestParam carName: String): Car? {
        return carService.findCar(carName)
    }

    @PostMapping("/car")
    fun saveCar(@RequestParam carName: String): String {
        return carService.saveCar(carName)
    }
}
