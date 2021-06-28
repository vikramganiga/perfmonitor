package com.gerutree.perfmonitor.alert.loaddata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gerutree.perfmonitor.alert.db.CPUUsage;
import com.gerutree.perfmonitor.alert.repo.CPUUsageRepo;

@Configuration
public class LoadCPUUsageData {
	
	  private static final Logger log = LoggerFactory.getLogger(LoadCPUUsageData.class);

	  @Bean
	  CommandLineRunner initCPUUsageDatabase(CPUUsageRepo cpuUsageRepo) {

	    return args -> {
	      log.info("Preloading " + cpuUsageRepo.save(new CPUUsage("11.00.99.99", "windows", 17.00)));
	    };
	  }

}
