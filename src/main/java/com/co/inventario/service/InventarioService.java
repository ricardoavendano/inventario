package com.co.inventario.service;

import com.co.inventario.model.InventarioEntity;

import java.util.List;

public interface InventarioService {

    List<InventarioEntity> getAllInventario();

    void crearInventario(InventarioEntity inventario);

    void editarInventario(Long id, Boolean estado);


}
