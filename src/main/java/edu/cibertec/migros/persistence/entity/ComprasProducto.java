package edu.cibertec.migros.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="compras_productos")
//Puedes utilizar las anotaciones @Getter, @Setter, e incluso @Builder de Lombok para tu Entity.   Sin embargo, debes tener cuidado con otras anotaciones como @Data @ToString ó @EqualsAndHashCode ya que generan código que no es 100% correcto para entities (estas clases tienen algunos requerimientos especiales para estos métodos). En este vídeo puedes ver a lo que me refiero y cómo evitarlo. Ver: https://www.youtube.com/watch?v=j_hEdLPDczI
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ComprasProducto {

    @EmbeddedId
    private ComprasProductoPK id;

    private Integer cantidad;

    //para un aplicativo real, no se deberían usar atributos de tipo Float o Double para almacenar datos monetarios (precios, totales, intereses, impuestos, etc.) sino el tipo de dato BigDecimal. Hay muchos artículos que explican el motivo, por ejemplo: https://dzone.com/articles/never-use-float-and-double-for-monetary-calculatio
    //Para información monetaria se debería usar BigDecimal, aunque el MonetaryAmount tambien puede ser una posibilidad. Ver: https://www.baeldung.com/java-money-and-currency
    private Double total;

    private Boolean estado;

    @ManyToOne
    @JoinColumn(name="id_compra", insertable = false, updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name="id_producto", insertable = false, updatable = false)
    private Producto producto;

}
