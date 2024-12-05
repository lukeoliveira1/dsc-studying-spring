package com.example.ecommerce.mapper;

import com.example.ecommerce.domain.Client;
import com.example.ecommerce.domain.dto.client.ClientRequestDTO;
import com.example.ecommerce.domain.dto.client.ClientResponseDTO;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", uses = {AddressMapper.class})
public interface ClientMapper {
    ClientResponseDTO toResponseDTO(Client client);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "name")
    @Mapping(target = "cpf")
    @Mapping(target = "email")
    @Mapping(target = "phoneNumber")
    @Mapping(target = "address", ignore = true)
    Client toEntity(ClientRequestDTO dto);

    List<ClientResponseDTO> toDTOList(List<Client> clients);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "name")
    @Mapping(target = "cpf")
    @Mapping(target = "email")
    @Mapping(target = "phoneNumber")
    @Mapping(target = "address", ignore = true)
    void updateEntityFromDTO(ClientRequestDTO dto, @MappingTarget Client client);
}
