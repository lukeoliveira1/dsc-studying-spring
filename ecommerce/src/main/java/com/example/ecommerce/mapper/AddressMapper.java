package com.example.ecommerce.mapper;

import com.example.ecommerce.domain.Address;
import com.example.ecommerce.domain.dto.address.AddressRequestDTO;
import com.example.ecommerce.domain.dto.address.AddressResponseDTO;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    AddressResponseDTO toResponseDTO(Address address);

    // Converter DTO para Address
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "street")
    @Mapping(target = "number")
    @Mapping(target = "district")
    @Mapping(target = "city")
    @Mapping(target = "state")
    @Mapping(target = "zipCode")
    @Mapping(target = "client", ignore = true)
    Address toEntity(AddressRequestDTO dto);

    List<AddressResponseDTO> toDTOList(List<Address> addresses);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "street")
    @Mapping(target = "number")
    @Mapping(target = "district")
    @Mapping(target = "city")
    @Mapping(target = "state")
    @Mapping(target = "zipCode")
    @Mapping(target = "client", ignore = true)
    void updateEntityFromDTO(AddressRequestDTO dto, @MappingTarget Address address);

}
