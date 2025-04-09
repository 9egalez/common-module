package com.scms.common_module.repo;


import com.scms.common_module.entity.VehicleLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleLogRepo extends JpaRepository<VehicleLog, String> {


}