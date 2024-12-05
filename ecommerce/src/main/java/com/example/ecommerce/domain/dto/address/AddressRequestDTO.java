package com.example.ecommerce.domain.dto.address;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "DTO para endereço")
public class AddressRequestDTO {
    @Schema(description = "Nome da rua", example = "Rua Nova")
    private String street;

    @Schema(description = "Número", example = "110")
    private String number;

    @Schema(description = "Bairro", example = "Novo Jardim")
    private String district;

    @Schema(description = "Cidade", example = "Natal")
    private String city;

    @Schema(description = "Estado", example = "Novo Jardim")
    private String state;

    @Schema(description = "Cep", example = "Natal")
    private String zipCode;

}
