package com.co.inventario.service;

import com.co.inventario.model.InventarioEntity;
import com.co.inventario.repository.InventarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventarioServiceImpl implements InventarioService {

    private final InventarioRepository repository;

    public InventarioServiceImpl(InventarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<InventarioEntity> getAllInventario() {
        return repository.findAll();
    }

    @Override
    public void crearInventario(InventarioEntity inventario) {

        repository.save(new InventarioEntity((repository.count() + 1), inventario.getNombreUsuario(), inventario.getTipoProducto(), inventario.getNumeroSerie(), inventario.getFecha(), inventario.isEstado()));
    }

    @Override
    public void editarInventario(Long id, Boolean estado) {
        Optional<InventarioEntity> inventario = repository.findById(id);
        if (inventario.isPresent()) {
            inventario.get().setEstado(estado);
            repository.save(inventario.get());
        }
    }
}
