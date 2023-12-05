package com.store.serviceproduct;

import com.store.serviceproduct.Category.domain.entity.Category;
import com.store.serviceproduct.Product.domain.entity.Product;
import com.store.serviceproduct.Product.domain.interfaces.ProductService;
import com.store.serviceproduct.Product.domain.repository.ProductRepository;
import com.store.serviceproduct.Product.domain.services.ProductServiceImp;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class ProductServicesMockTest {
    // Datos mockeados
    @Mock
    private ProductRepository productRepository;

    private ProductService productService;

    // Se ejecuta antes de nuestro test
    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        productService = new ProductServiceImp(productRepository);
        Product computer = Product.builder()
                .Id(1L)
                .name("computer")
                .category(Category.builder().id(1L).build())
                .price(Double.parseDouble("12.5"))
                .stock(Double.parseDouble("5"))
                .build();

        Mockito.when(productRepository.findById(1L))
                .thenReturn(Optional.of(computer));
        Mockito.when(productRepository.save(computer)).thenReturn(computer);
    }

    // Realiza una busqueda del elemento mockeado
    @Test
    public void whenValidGetID_ThenReturnProduct() {
        Product found = productService.getProduct(1L);
        Assertions.assertThat(found.getName()).isEqualTo("computer");
    }

    @Test
    public void whenValidUpdateStock_ThenReturnNewStock() {
        Product newStock = productService.updateStock(1L, Double.parseDouble("8"));
        Assertions.assertThat(newStock.getStock()).isEqualTo(13);
    }

}
