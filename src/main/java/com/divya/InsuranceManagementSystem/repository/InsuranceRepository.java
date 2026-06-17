package com.divya.InsuranceManagementSystem.repository;

import com.divya.InsuranceManagementSystem.domain.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance,Integer> {
}
