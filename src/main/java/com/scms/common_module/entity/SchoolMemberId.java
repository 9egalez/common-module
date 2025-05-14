package com.scms.common_module.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class SchoolMemberId implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "school_id", nullable = false)
    private Long schoolId;

    @Column(name = "member_id", nullable = false, length = 255)
    private String memberId;
}