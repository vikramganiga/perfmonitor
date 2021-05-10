package com.gerutree.perfmonitor.alert.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerutree.perfmonitor.alert.db.UnknownProcess;

public interface UnknownProcessRepo extends JpaRepository<UnknownProcess, Long> {

}
