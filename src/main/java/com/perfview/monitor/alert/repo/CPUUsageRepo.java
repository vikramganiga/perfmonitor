package com.perfview.monitor.alert.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perfview.monitor.alert.db.CPUUsage;

public interface CPUUsageRepo extends JpaRepository<CPUUsage, Long> {

}
