package com.scms.common_module.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "member")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Member {
    @Id
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private String id;

    @Column(name = "member_first_name", nullable = false)
    private String firstName;

    @Column(name = "member_last_name")
    private String lastName;

    @Column(name = "member_username", nullable = false, unique = true)
    private String username;

    @Column(name = "member_phone", nullable = false)
    private String phone;

    @Column(name = "member_email", nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "member_role", nullable = false)
    private MemberRole role;

    @Column(name = "member_password", nullable = false)
    private String password;

    @Column(name = "member_password_hint")
    private String passwordHint;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Column(name = "member_active", nullable = false)
    private boolean active;

    @Column(name = "member_locked", nullable = false)
    private boolean locked;

    @OneToMany(mappedBy = "member", fetch = FetchType.LAZY)
    private Set<SchoolMember> schoolMembers = new HashSet<>();

    // Helper to check if member is part of a specific school
    public boolean isInSchool(Long schoolId) {
        if (this.schoolMembers == null || schoolId == null) {
            return false;
        }
        return this.schoolMembers.stream()
                .anyMatch(sm -> sm.getSchool() != null && schoolId.equals(sm.getSchool().getId()));
    }
}
