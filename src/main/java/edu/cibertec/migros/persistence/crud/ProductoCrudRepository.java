package edu.cibertec.migros.persistence.crud;

import edu.cibertec.migros.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Long> {

}
