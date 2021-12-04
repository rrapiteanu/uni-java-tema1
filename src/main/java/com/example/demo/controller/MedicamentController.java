package com.example.demo.controller;


import com.example.demo.model.Medicament;
import com.example.demo.repository.MedicamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/medicamente")
public class MedicamentController {

    @Autowired
    MedicamentRepository repository;

    @GetMapping
    public Flux<Medicament> getMedicamente(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Medicament> getMedicament(@PathVariable Integer id){
        return repository.findById(id);
    }

    @PostMapping
    public Mono<Medicament> createMedicament(@RequestBody Medicament medicament){
        return  repository.save(medicament);
    }

    @PutMapping("/{id}")
    public Mono<Medicament> updateMedicament(@RequestBody Medicament medicament, @PathVariable Integer id){
        return repository.findById(id)
                .map((c) -> {
                    c.setDenumire(medicament.getDenumire());
                    c.setCantitate(medicament.getCantitate());
                    return c;
                }).flatMap( c -> repository.save(c));

    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteMedicament(@PathVariable Integer id){
        return repository.deleteById(id);
    }
}