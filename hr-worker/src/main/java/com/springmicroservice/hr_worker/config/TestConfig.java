package com.springmicroservice.hr_worker.config;

import com.springmicroservice.hr_worker.entities.Worker;
import com.springmicroservice.hr_worker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    private WorkerRepository workerRepository;

    @Override
    public void run(String... args) throws Exception{
        Worker workerOne = new Worker(1, "Lucas", 200.0);
        Worker workerTwo = new Worker(2, "Joao", 150.0);
        Worker workerThree = new Worker(3, "Bob", 100.0);

        workerRepository.saveAll(Arrays.asList(workerOne, workerTwo, workerThree));
    }
}
