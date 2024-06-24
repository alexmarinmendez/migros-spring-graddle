package edu.cibertec.migros.persistence;

import edu.cibertec.migros.persistence.crud.ProductoCrudRepository;
import edu.cibertec.migros.persistence.entity.Producto;
import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(Long idCategoria) {
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }
}
