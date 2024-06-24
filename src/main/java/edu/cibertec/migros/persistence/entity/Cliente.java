package edu.cibertec.migros.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name="clientes")
//Puedes utilizar las anotaciones @Getter, @Setter, e incluso @Builder de Lombok para tu Entity.   Sin embargo, debes tener cuidado con otras anotaciones como @Data @ToString ó @EqualsAndHashCode ya que generan código que no es 100% correcto para entities (estas clases tienen algunos requerimientos especiales para estos métodos). En este vídeo puedes ver a lo que me refiero y cómo evitarlo. Ver: https://www.youtube.com/watch?v=j_hEdLPDczI
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    private String id;
    private String nombre;
    private String apellidos;
    private Long celular;
    private String direccion;

    @Column(name="correo_electronico")
    private String correoElectronico;

    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;
}