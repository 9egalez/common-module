package com.scms.common_module.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "school")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO
//            , generator = "school_seq"
    )
    private Long id;

    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "state_code")
    private String stateCode;

    @Column(name = "school_type")
    private String type;

    @Column(name = "school_email", nullable = false)
    private String email;

    @Column(name = "school_phone", nullable = false)
    private String phone;

    @Column(name = "school_startTime")
    private Instant startTime;

    @Column(name = "school_endTime")
    private Instant endTime;

    @Column(name = "regular_pickup_time")
    private Instant regularPickupTime;

    @Column(name = "sepcial_pickup_time")
    private Instant specialPickupTime;

    @Column(name = "school_name", nullable = false)
    private String name;

    @Column(name = "school_address", nullable = false)
    private String address;

    @Column(name = "school_active", nullable = false)
    private boolean active;

    @OneToMany(mappedBy = "school", fetch = FetchType.LAZY)
    private Set<SchoolMember> schoolMembers = new HashSet<>();

}
