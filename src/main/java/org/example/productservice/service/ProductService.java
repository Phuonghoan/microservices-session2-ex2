package org.example.productservice.service;

import lombok.RequiredArgsConstructor;
import org.example.productservice.dto.ProductResponseDTO;
import org.example.productservice.entity.ProductEntity;
import org.example.productservice.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository
            productRepository;

    public ProductResponseDTO getProduct(
            Long id
    ) {

        ProductEntity product =
                productRepository
                        .findById(id)
                        .orElseThrow(
                                () -> new RuntimeException(
                                        "Product not found"
                                )
                        );

        // ==========================
        // ENTITY -> DTO
        // ==========================

        return ProductResponseDTO
                .builder()

                .id(
                        product.getId()
                )

                .name(
                        product.getName()
                )

                .sellPrice(
                        product.getSellPrice()
                )

                .build();
    }
}
