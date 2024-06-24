package edu.cibertec.migros.persistence.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="compras_productos")
@Data
public class ComprasProducto {

    @EmbeddedId
    private ComprasProductoPK id;

    private Integer cantidad;

    //para un aplicativo real, no se deberían usar atributos de tipo Float o Double para almacenar datos monetarios (precios, totales, intereses, impuestos, etc.) sino el tipo de dato BigDecimal. Hay muchos artículos que explican el motivo, por ejemplo: https://dzone.com/articles/never-use-float-and-double-for-monetary-calculatio
    //Para información monetaria se debería usar BigDecimal, aunque el MonetaryAmount tambien puede ser una posibilidad. Ver: https://www.baeldung.com/java-money-and-currency
    private Double total;

    private Boolean estado;

}
