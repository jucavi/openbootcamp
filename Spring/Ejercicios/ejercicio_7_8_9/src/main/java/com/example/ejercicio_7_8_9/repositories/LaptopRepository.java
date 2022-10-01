package com.example.ejercicio_7_8_9.repositories;

import com.example.ejercicio_7_8_9.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
