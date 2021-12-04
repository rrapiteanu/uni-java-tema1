package com.example.demo.repository;


import com.example.demo.model.Medicament;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface MedicamentRepository extends ReactiveCrudRepository<Medicament,Integer> {

}