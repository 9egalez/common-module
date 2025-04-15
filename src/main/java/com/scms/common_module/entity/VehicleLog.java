package com.scms.common_module.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "vehicle_log")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class VehicleLog {
    @Id
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private String id;

    @ManyToOne
    @JoinColumn(name = "barcode_data_id", nullable = false)
    private BarcodeData barcodeData;

    @Column(name = "arrival_time", nullable = false)
    private Instant arrivalTime;

    @Column(name = "departure_time")
    private Instant departureTime;
}
