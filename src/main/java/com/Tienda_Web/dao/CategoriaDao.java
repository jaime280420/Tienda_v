package com.Tienda_Web.dao;

import com.Tienda_Web.domain.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria, Long> {

    //Mas adelante vamos a tener metodos ampliados
    List<Categoria> findByDescripcion(String descripcion);
}
