package com.co.inventario.model.loader;

import com.co.inventario.model.InventarioEntity;
import com.co.inventario.repository.InventarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class InventarioDataLoader {

    @Bean
    CommandLineRunner loadInventario(InventarioRepository repository) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();

        repository.deleteAll();
        return args -> {
            repository.save(new InventarioEntity(1L, "Prueba 1", "Tarjeta Credito", 111L, new SimpleDateFormat("yyyy-MM-dd").parse(dtf.format(now)), false));
            repository.save(new InventarioEntity(2L, "Prueba 2", "Tarjeta Debito", 222L, new SimpleDateFormat("yyyy-MM-dd").parse(dtf.format(now)), true));
        };
    }
}
