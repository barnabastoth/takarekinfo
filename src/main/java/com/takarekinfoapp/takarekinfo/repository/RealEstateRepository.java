package com.takarekinfoapp.takarekinfo.repository;

import com.takarekinfoapp.takarekinfo.model.RealEstate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealEstateRepository extends JpaRepository<RealEstate, Long> {
}
