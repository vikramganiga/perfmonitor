package com.perfview.monitor.alert.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.perfview.monitor.alert.db.MemoryUsage;
import com.perfview.monitor.alert.repo.MemoryUsageRepo;

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
