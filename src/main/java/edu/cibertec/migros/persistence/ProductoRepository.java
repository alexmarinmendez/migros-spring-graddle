package edu.cibertec.migros.persistence;

import edu.cibertec.migros.persistence.crud.ProductoCrudRepository;
import edu.cibertec.migros.persistence.entity.Producto;
import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRespository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRespository.findAll();
    }
}
