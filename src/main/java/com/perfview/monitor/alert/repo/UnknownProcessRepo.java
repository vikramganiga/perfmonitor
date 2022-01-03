package com.perfview.monitor.alert.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perfview.monitor.alert.db.UnknownProcess;

public interface UnknownProcessRepo extends JpaRepository<UnknownProcess, Long> {

}
