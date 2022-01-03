package com.perfview.monitor.alert.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perfview.monitor.alert.db.MemoryUsage;

public interface MemoryUsageRepo extends JpaRepository<MemoryUsage, Long> {

}
