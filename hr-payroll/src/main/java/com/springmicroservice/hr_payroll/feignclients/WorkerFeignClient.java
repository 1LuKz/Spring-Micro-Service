package com.springmicroservice.hr_payroll.feignclients;

import com.springmicroservice.hr_payroll.entities.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "hr-worker", path = "/workers")
public interface WorkerFeignClient {

    @GetMapping("/{id}")
    ResponseEntity<Worker> findById(@PathVariable("id") Integer id);
}
