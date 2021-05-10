package com.gerutree.perfmonitor.alert.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gerutree.perfmonitor.alert.db.UnknownProcess;
import com.gerutree.perfmonitor.alert.repo.UnknownProcessRepo;

@RestController
public class UnknownProcessController {

	private UnknownProcessRepo unknownProcessRepo;
	
	public UnknownProcessController(UnknownProcessRepo unknownProcessRepo) {
		this.unknownProcessRepo = unknownProcessRepo;
	}
	
	@GetMapping("/unknownprocess")
	public List<UnknownProcess> getAll(){
		return unknownProcessRepo.findAll();
	}
	
	@PostMapping("/unknownprocess")
	public UnknownProcess save(@RequestBody UnknownProcess unknownProcess) {
		return unknownProcessRepo.save(unknownProcess);
	}
}
