package com.co.inventario.controller;

import com.co.inventario.model.TipoProductoEntity;
import com.co.inventario.service.TipoProductoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
@RequestMapping("/tipo-producto")
public class TipoProductoController {

    private final TipoProductoService service;

    public TipoProductoController(TipoProductoService service) {
        this.service = service;
    }

    @GetMapping
    public List<TipoProductoEntity> getAllTipoProducto() {
        return service.getAllTipoProducto();
    }
}
