package com.example.ecommerce.domain.dto.category;

import com.example.ecommerce.domain.Product;

import java.util.List;

public record CategoryResponseDTO(Long id, String name, String description, List<Product> products) {
}
