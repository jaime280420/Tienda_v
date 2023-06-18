
package com.Tienda_Web.service;

import com.Tienda_Web.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    //Metodo que retorna la lista de categorias 
    
    public List<Categoria> getCategorias(boolean activos);
}
