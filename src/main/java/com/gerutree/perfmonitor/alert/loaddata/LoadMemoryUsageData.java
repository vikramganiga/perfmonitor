package com.gerutree.perfmonitor.alert.loaddata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gerutree.perfmonitor.alert.db.MemoryUsage;
import com.gerutree.perfmonitor.alert.repo.MemoryUsageRepo;

@Configuration
public class LoadMemoryUsageData {
	
	  private static final Logger log = LoggerFactory.getLogger(LoadCPUUsageData.class);

	  @Bean
	  CommandLineRunner initMemoryUsageDatabase(MemoryUsageRepo memoryUsageRepo) {

	    return args -> {
	      log.info("Preloading " + memoryUsageRepo.save(new MemoryUsage("11.00.99.99", "windows", 17)));
	    };
	  }


}
