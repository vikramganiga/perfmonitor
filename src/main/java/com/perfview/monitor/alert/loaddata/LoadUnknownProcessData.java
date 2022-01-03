package com.perfview.monitor.alert.loaddata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.perfview.monitor.alert.db.UnknownProcess;
import com.perfview.monitor.alert.repo.UnknownProcessRepo;

@Configuration
public class LoadUnknownProcessData {
	
	  private static final Logger log = LoggerFactory.getLogger(LoadCPUUsageData.class);

	  @Bean
	  CommandLineRunner initUnknownProcessDatabase(UnknownProcessRepo unknownProcessRepo) {

	    return args -> {
	      log.info("Preloading " + unknownProcessRepo.save(new UnknownProcess("11.00.99.99", "windows", "init.virus")));
	    };
	  }




}
