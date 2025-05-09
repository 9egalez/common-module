package com.scms.common_module.repo;


import com.scms.common_module.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepo extends JpaRepository<Member, String> {
    List<Member> findBySchoolId(Long schoolId);
    Optional<Member> findByUsername(String username);
    boolean existsByUsername(String username);
/*    boolean existsByUsernameAndSchoolId(String username, Long schoolId);
    Optional<Member> findByUsernameAndSchoolId(String username, Long schoolId);*/
}