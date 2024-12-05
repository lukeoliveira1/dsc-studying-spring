package com.example.ecommerce.domain.dto.client;

import com.example.ecommerce.domain.Purchase;
import com.example.ecommerce.domain.dto.address.AddressResponseDTO;

import java.util.List;

public record ClientResponseDTO(Long id, String name, String email, String cpf, String phoneNumber, AddressResponseDTO address, List<Purchase> purchase) {
}
