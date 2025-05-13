package com.example.jellypado.repository

import com.example.jellypado.model.Car
import org.springframework.data.jpa.repository.JpaRepository


interface CarRepository: JpaRepository<Car, Long> {
    fun findByName(name: String): Car?
}