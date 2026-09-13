package org.example.productservice.config;

import lombok.RequiredArgsConstructor;
import org.example.productservice.entity.ProductEntity;
import org.example.productservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class DataInitializer
        implements CommandLineRunner {

    private final ProductRepository
            productRepository;

    @Override
    public void run(
            String... args
    ) {

        if (productRepository.count() == 0) {

            ProductEntity product =
                    ProductEntity
                            .builder()

                            .name(
                                    "iPhone 17"
                            )

                            .sku(
                                    "IP17-256-BLK"
                            )

                            .importPrice(
                                    new BigDecimal(
                                            "18000000"
                                    )
                            )

                            .sellPrice(
                                    new BigDecimal(
                                            "22990000"
                                    )
                            )

                            .stockQuantity(
                                    50
                            )

                            .build();


            productRepository.save(
                    product
            );
        }
    }
}
