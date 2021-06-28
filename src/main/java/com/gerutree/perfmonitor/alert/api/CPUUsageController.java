package com.gerutree.perfmonitor.alert.api;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gerutree.perfmonitor.alert.db.CPUUsage;
import com.gerutree.perfmonitor.alert.repo.CPUUsageRepo;

@CrossOrigin
@RestController
public class CPUUsageController {

	private CPUUsageRepo cpuUsageRepo;
	
	public CPUUsageController(CPUUsageRepo cpuUsageRepo) {
		this.cpuUsageRepo = cpuUsageRepo;
	}
	
	
	@GetMapping("/cpuusages")
	List<CPUUsage> getAll(){
		return cpuUsageRepo.findAll();
	}
	
	@PostMapping("/cpuusage")
	CPUUsage saveCPUusage(@RequestBody CPUUsage cpuUsage) {
		return cpuUsageRepo.save(cpuUsage);
	}
}
