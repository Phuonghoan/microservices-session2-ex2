package org.example.productservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.productservice.dto.ProductResponseDTO;
import org.example.productservice.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService
            productService;

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponseDTO>
    getProduct(
            @PathVariable Long id
    ) {

        return ResponseEntity.ok(
                productService
                        .getProduct(id)
        );
    }
}
