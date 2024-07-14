package com.co.inventario.controller;

import com.co.inventario.model.InventarioEntity;
import com.co.inventario.service.InventarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
@RequestMapping("/inventario")
public class InventarioController {

    private final InventarioService service;

    public InventarioController(InventarioService service) {
        this.service = service;
    }

    @GetMapping
    public List<InventarioEntity> getAllInventario() {
        return service.getAllInventario();
    }

    @PostMapping
    public void crearInventario(@RequestBody InventarioEntity inventario) {
        service.crearInventario(inventario);
    }

    @PutMapping("/{id}/estado")
    public void editarInventario(@PathVariable long id, @RequestParam Boolean estado) {
        service.editarInventario(id, estado);
    }
}
