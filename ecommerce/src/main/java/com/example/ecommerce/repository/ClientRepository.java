package com.example.ecommerce.repository;

import com.example.ecommerce.domain.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    boolean existsByName(String name);

    boolean existsByEmail(String email);

    Page<Client> findAll(Pageable pageable);
}
