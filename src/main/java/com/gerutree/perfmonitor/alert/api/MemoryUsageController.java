package com.gerutree.perfmonitor.alert.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gerutree.perfmonitor.alert.db.MemoryUsage;
import com.gerutree.perfmonitor.alert.repo.MemoryUsageRepo;

@RestController
public class MemoryUsageController {
	
	private MemoryUsageRepo memoryUsageRepo;
	
	public MemoryUsageController(MemoryUsageRepo memoryUsageRepo) {
		this.memoryUsageRepo = memoryUsageRepo;
	}
	
	@GetMapping("/memoryusage")
	public List<MemoryUsage> getAll(){
		return memoryUsageRepo.findAll();
	}
	
	@PostMapping("/memoryusage")
	public MemoryUsage saveMemoryUsage(@RequestBody MemoryUsage memoryUsage) {
		return memoryUsageRepo.save(memoryUsage);
	}
}
