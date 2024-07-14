package com.co.inventario.repository;

import com.co.inventario.model.InventarioEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InventarioRepository extends MongoRepository<InventarioEntity, Long> {
}

