package com.example.ecommerce.mapper;

import com.example.ecommerce.domain.Client;
import com.example.ecommerce.domain.Purchase;
import com.example.ecommerce.domain.dto.address.AddressResponseDTO;
import com.example.ecommerce.domain.dto.client.ClientRequestDTO;
import com.example.ecommerce.domain.dto.client.ClientResponseDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-04T20:27:32-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23 (Oracle Corporation)"
)
@Component
public class ClientMapperImpl implements ClientMapper {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public ClientResponseDTO toResponseDTO(Client client) {
        if ( client == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        String email = null;
        String cpf = null;
        String phoneNumber = null;
        AddressResponseDTO address = null;
        List<Purchase> purchase = null;

        id = client.getId();
        name = client.getName();
        email = client.getEmail();
        cpf = client.getCpf();
        phoneNumber = client.getPhoneNumber();
        address = addressMapper.toResponseDTO( client.getAddress() );
        List<Purchase> list = client.getPurchase();
        if ( list != null ) {
            purchase = new ArrayList<Purchase>( list );
        }

        ClientResponseDTO clientResponseDTO = new ClientResponseDTO( id, name, email, cpf, phoneNumber, address, purchase );

        return clientResponseDTO;
    }

    @Override
    public Client toEntity(ClientRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Client client = new Client();

        client.setName( dto.name() );
        client.setCpf( dto.cpf() );
        client.setEmail( dto.email() );
        client.setPhoneNumber( dto.phoneNumber() );

        return client;
    }

    @Override
    public List<ClientResponseDTO> toDTOList(List<Client> clients) {
        if ( clients == null ) {
            return null;
        }

        List<ClientResponseDTO> list = new ArrayList<ClientResponseDTO>( clients.size() );
        for ( Client client : clients ) {
            list.add( toResponseDTO( client ) );
        }

        return list;
    }

    @Override
    public void updateEntityFromDTO(ClientRequestDTO dto, Client client) {
        if ( dto == null ) {
            return;
        }

        if ( dto.name() != null ) {
            client.setName( dto.name() );
        }
        if ( dto.cpf() != null ) {
            client.setCpf( dto.cpf() );
        }
        if ( dto.email() != null ) {
            client.setEmail( dto.email() );
        }
        if ( dto.phoneNumber() != null ) {
            client.setPhoneNumber( dto.phoneNumber() );
        }
    }
}
