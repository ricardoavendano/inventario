package com.co.inventario.service;

import com.co.inventario.model.TipoProductoEntity;
import com.co.inventario.repository.TipoProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoProductoServiceImpl implements TipoProductoService{

    private final TipoProductoRepository repository;

    public TipoProductoServiceImpl(TipoProductoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<TipoProductoEntity> getAllTipoProducto() {
        return repository.findAll();
    }
}
