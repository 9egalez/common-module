/*
package com.scms.common_module.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table(name = "student_guardian")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentGuardian {

    @EmbeddedId
    private StudentGuardianId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("studentId") // Maps the studentId field of the composite ID
    @JoinColumn(name = "student_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("guardianId") // Maps the guardianId field of the composite ID
    @JoinColumn(name = "guardian_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Guardian guardian;

    public StudentGuardian(Student student, Guardian guardian) {
        this.student = student;
        this.guardian = guardian;
        this.id = new StudentGuardianId(student.getId(), guardian.getId());
    }
}*/
