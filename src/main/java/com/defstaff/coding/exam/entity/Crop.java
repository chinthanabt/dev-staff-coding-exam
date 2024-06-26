package com.defstaff.coding.exam.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "crop")
public class Crop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private double plantingArea;
    private double expectedProduct;
    private double actualProduct;

    @ManyToOne
    @JoinColumn(name = "farm_id")
    private Farm farm;
}
