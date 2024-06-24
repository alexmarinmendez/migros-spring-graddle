package edu.cibertec.migros.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name="compras")
//Puedes utilizar las anotaciones @Getter, @Setter, e incluso @Builder de Lombok para tu Entity.   Sin embargo, debes tener cuidado con otras anotaciones como @Data @ToString ó @EqualsAndHashCode ya que generan código que no es 100% correcto para entities (estas clases tienen algunos requerimientos especiales para estos métodos). En este vídeo puedes ver a lo que me refiero y cómo evitarlo. Ver: https://www.youtube.com/watch?v=j_hEdLPDczI
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_compra")
    private Integer idCompra;

    @Column(name="id_cliente")
    private Integer idCliente;

    private LocalDateTime fecha;

    @Column(name="medio_pago")
    private String medioPago;

    private String comentario;
    private String estado;

    @ManyToOne
    @JoinColumn(name="id_cliente", insertable = false, updatable = false)
    private Cliente cliente;
}
