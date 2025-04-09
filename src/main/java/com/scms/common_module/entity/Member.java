package com.scms.common_module.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.UUID;

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
    private String id = UUID.randomUUID().toString();

    @Column(name = "member_first_name", nullable = false)
    private String firstName;

    @Column(name = "member_last_name")
    private String lastName;

    @Column(name = "member_user_name", nullable = false)
    private String userName;

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

    @ManyToOne
    @JoinColumn(name = "school_id", nullable = false)
    private School school;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Column(name = "member_active", nullable = false)
    private boolean active;

    @Column(name = "member_locked", nullable = false)
    private boolean locked;
}
