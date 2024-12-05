package com.example.ecommerce.mapper;

import com.example.ecommerce.domain.Address;
import com.example.ecommerce.domain.dto.address.AddressRequestDTO;
import com.example.ecommerce.domain.dto.address.AddressResponseDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-04T20:30:45-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23 (Oracle Corporation)"
)
@Component
public class AddressMapperImpl implements AddressMapper {

    @Override
    public AddressResponseDTO toResponseDTO(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressResponseDTO addressResponseDTO = new AddressResponseDTO();

        addressResponseDTO.setId( address.getId() );
        addressResponseDTO.setStreet( address.getStreet() );
        addressResponseDTO.setNumber( address.getNumber() );
        addressResponseDTO.setDistrict( address.getDistrict() );
        addressResponseDTO.setCity( address.getCity() );
        addressResponseDTO.setState( address.getState() );
        addressResponseDTO.setZipCode( address.getZipCode() );

        return addressResponseDTO;
    }

    @Override
    public Address toEntity(AddressRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Address address = new Address();

        address.setStreet( dto.getStreet() );
        address.setNumber( dto.getNumber() );
        address.setDistrict( dto.getDistrict() );
        address.setCity( dto.getCity() );
        address.setState( dto.getState() );
        address.setZipCode( dto.getZipCode() );

        return address;
    }

    @Override
    public List<AddressResponseDTO> toDTOList(List<Address> addresses) {
        if ( addresses == null ) {
            return null;
        }

        List<AddressResponseDTO> list = new ArrayList<AddressResponseDTO>( addresses.size() );
        for ( Address address : addresses ) {
            list.add( toResponseDTO( address ) );
        }

        return list;
    }

    @Override
    public void updateEntityFromDTO(AddressRequestDTO dto, Address address) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getStreet() != null ) {
            address.setStreet( dto.getStreet() );
        }
        if ( dto.getNumber() != null ) {
            address.setNumber( dto.getNumber() );
        }
        if ( dto.getDistrict() != null ) {
            address.setDistrict( dto.getDistrict() );
        }
        if ( dto.getCity() != null ) {
            address.setCity( dto.getCity() );
        }
        if ( dto.getState() != null ) {
            address.setState( dto.getState() );
        }
        if ( dto.getZipCode() != null ) {
            address.setZipCode( dto.getZipCode() );
        }
    }
}
