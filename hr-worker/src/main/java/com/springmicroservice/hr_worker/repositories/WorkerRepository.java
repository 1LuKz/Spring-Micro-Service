package com.springmicroservice.hr_worker.repositories;

import com.springmicroservice.hr_worker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Integer> {
}
