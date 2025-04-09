package com.scms.common_module.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "guardian")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Guardian {
    @Id
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private String id = UUID.randomUUID().toString();

    @Column(name = "guardian_first_name")
    private String firstName;

    @Column(name = "guardian_last_name")
    private String lastName;

    @Column(name = "guardian_email")
    private String email;

    @OneToOne
    @JoinColumn(name = "barcode_id")
    private BarcodeData barcodeData;
}
