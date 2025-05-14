package com.scms.common_module.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "school_member")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SchoolMember {

    @EmbeddedId
    private SchoolMemberId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("schoolId") // Maps the schoolId field of the embedded ID
    @JoinColumn(name = "school_id", referencedColumnName = "id", insertable = false, updatable = false)
    private School school;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("memberId") // Maps the memberId field of the embedded ID
    @JoinColumn(name = "member_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Member member;

    public SchoolMember(School school, Member member) {
        this.school = school;
        this.member = member;
        this.id = new SchoolMemberId(school.getId(), member.getId());
    }
}