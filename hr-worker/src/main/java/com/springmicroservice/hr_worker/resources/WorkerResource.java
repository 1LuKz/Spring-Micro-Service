package com.springmicroservice.hr_worker.resources;

import com.springmicroservice.hr_worker.entities.Worker;
import com.springmicroservice.hr_worker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/workers")
public class WorkerResource {

    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        List<Worker> workerList = workerRepository.findAll();
        return ResponseEntity.ok().body(workerList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Integer id){
        Worker worker = workerRepository.findById(id).get();
        return ResponseEntity.ok().body(worker);
    }
}
