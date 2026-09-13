package org.example.productservice.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(
            nullable = false,
            unique = true
    )
    private String sku;

    @Column(
            nullable = false,
            precision = 12,
            scale = 2
    )
    private BigDecimal importPrice;

    @Column(
            nullable = false,
            precision = 12,
            scale = 2
    )
    private BigDecimal sellPrice;

    @Column(nullable = false)
    private Integer stockQuantity;
}
