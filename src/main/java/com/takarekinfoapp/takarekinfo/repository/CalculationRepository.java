package com.takarekinfoapp.takarekinfo.repository;

import com.takarekinfoapp.takarekinfo.model.Calculation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculationRepository extends JpaRepository<Calculation, Long> {
}
