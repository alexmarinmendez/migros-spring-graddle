package edu.cibertec.migros.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class ComprasProductoPK implements Serializable {

    @Column(name="id_compra")
    private int idCompra;

    @Column(name="id_producto")
    private int idProducto;
}
