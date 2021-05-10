package com.gerutree.perfmonitor.alert.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerutree.perfmonitor.alert.db.CPUUsage;

public interface CPUUsageRepo extends JpaRepository<CPUUsage, Long> {

}
