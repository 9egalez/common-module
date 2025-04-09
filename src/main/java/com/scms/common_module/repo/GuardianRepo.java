package com.scms.common_module.repo;


import com.scms.common_module.entity.Guardian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuardianRepo extends JpaRepository<Guardian, String> {


}