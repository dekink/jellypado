package com.example.jellypado.service

import com.example.jellypado.model.Car
import com.example.jellypado.repository.CarRepository
import org.springframework.stereotype.Service


@Service
class CarService (
    private val carRepository: CarRepository
) {
    fun findCar(carName: String): Car? {
        return carRepository.findByName(carName)
    }
    fun saveCar(carName: String): String {
        val car = Car(
            name=carName
        )
        carRepository.save(car)
        return carName
    }

}