package com.example.gerenciamento_clientes.repositories;

import com.example.gerenciamento_clientes.models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {

}
