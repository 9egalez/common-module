package com.scms.common_module.repo;

import com.scms.common_module.entity.SchoolMember;
import com.scms.common_module.entity.SchoolMemberId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SchoolMemberRepo extends JpaRepository<SchoolMember, SchoolMemberId> {

    List<SchoolMember> findBySchoolId(Long schoolId);

    List<SchoolMember> findByMemberId(String memberId);

    Optional<SchoolMember> findBySchoolIdAndMemberId(Long schoolId, String memberId);

    boolean existsBySchoolIdAndMemberId(Long schoolId, String memberId);

    void deleteBySchoolIdAndMemberId(Long schoolId, String memberId);

    // If needed to delete all associations for a member or a school directly via this repo:
    void deleteByMemberId(String memberId);

    void deleteBySchoolId(Long schoolId);
}