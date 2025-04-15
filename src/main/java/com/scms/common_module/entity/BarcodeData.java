package com.scms.common_module.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "barcode_data")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class BarcodeData {
    @Id
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private String id;

    @Column(name = "barcode_content", nullable = false, unique = true)
    private String content;

    @Column(name = "created_date", nullable = false)
    private Instant createdDate;

    @Column(name = "expiry_date")
    private Instant expiryDate;

    @Column(name = "barcode_active", nullable = false)
    private boolean active;

    @Column(name = "print_count")
    private Integer printCount;
}
