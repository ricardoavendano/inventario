package com.co.inventario.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "inventario")
public class InventarioEntity {
	
	@Id
    private Long id;
    private String nombreUsuario;
    private String tipoProducto;
    private Long numeroSerie;
    private Date fecha;
    private boolean estado;

}
