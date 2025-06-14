package com.scms.common_module.repo;


import com.scms.common_module.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, String> {
    List<Student> findBySchoolId(Long schoolId);

}