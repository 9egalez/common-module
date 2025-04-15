package com.scms.common_module.repo;


import com.scms.common_module.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepo extends JpaRepository<Member, String> {
    List<Member> findBySchoolId(Long schoolId);
}