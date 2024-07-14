package com.co.inventario.model.loader;

import com.co.inventario.model.TipoProductoEntity;
import com.co.inventario.repository.TipoProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class TipoProductoDataLoader {

    @Bean
    CommandLineRunner loadTipoProducto(TipoProductoRepository repository) {
        return args -> {
            repository.save(new TipoProductoEntity(null, "Tarjeta Credito"));
            repository.save(new TipoProductoEntity(null, "Tarjeta Debito"));
        };
    }
}
