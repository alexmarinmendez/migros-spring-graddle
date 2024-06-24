package edu.cibertec.migros.persistence;

import edu.cibertec.migros.persistence.crud.ProductoCrudRespository;
import edu.cibertec.migros.persistence.entity.Producto;
import java.util.List;

public class ProductoRepository {
    private ProductoCrudRespository productoCrudRespository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRespository.findAll();
    }
}
