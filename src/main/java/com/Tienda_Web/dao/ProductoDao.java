package com.Tienda_Web.dao;

import com.Tienda_Web.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Producto, Long> {
    //Mas adelante, vamos a tener metodos ampliados
}
