package com.takarekinfoapp.takarekinfo.repository;

import com.takarekinfoapp.takarekinfo.model.GPSPosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GPSPositionRepository extends JpaRepository<GPSPosition, Long> {
}
