package edu.cibertec.migros.persistence.crud;

import edu.cibertec.migros.persistence.entity.Producto;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<Producto, Long> {
    //anotación opcional. Si se usa anotación ya no es necesario respetar el formato de nombre del método
    //@Query(value="SELECT * FROM productos WHERE id_categoria = ?", nativeQuery=true)
    //si no se usa @Query es obligatorio respetar el formato de nombre. A eso se le llama "Query methods"
    List<Producto> findByIdCategoriaOrderByNombreAsc(Long idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidad, boolean estado);
}
