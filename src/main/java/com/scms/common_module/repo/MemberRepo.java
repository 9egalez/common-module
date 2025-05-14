package com.scms.common_module.repo;


import com.scms.common_module.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepo extends JpaRepository<Member, String> {
    Optional<Member> findByUsername(String username);

    boolean existsByUsername(String username);
}