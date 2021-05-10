package com.gerutree.perfmonitor.alert.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerutree.perfmonitor.alert.db.MemoryUsage;

public interface MemoryUsageRepo extends JpaRepository<MemoryUsage, Long> {

}
