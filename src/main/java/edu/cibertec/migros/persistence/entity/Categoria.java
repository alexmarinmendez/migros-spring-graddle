package edu.cibertec.migros.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "categorias")
//Puedes utilizar las anotaciones @Getter, @Setter, e incluso @Builder de Lombok para tu Entity.   Sin embargo, debes tener cuidado con otras anotaciones como @Data @ToString ó @EqualsAndHashCode ya que generan código que no es 100% correcto para entities (estas clases tienen algunos requerimientos especiales para estos métodos). En este vídeo puedes ver a lo que me refiero y cómo evitarlo. Ver: https://www.youtube.com/watch?v=j_hEdLPDczI
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategoria;

    private String descripcion;
    private Boolean estado;
}
