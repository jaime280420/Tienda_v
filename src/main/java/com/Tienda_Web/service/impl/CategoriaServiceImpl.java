package com.Tienda_Web.service.impl;

import com.Tienda_Web.dao.CategoriaDao;
import com.Tienda_Web.domain.Categoria;
import com.Tienda_Web.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Categoria> getCategorias(boolean activos) {
        List<Categoria> lista = categoriaDao.findAll();

        if (activos) {
            //Para remover las categorias donde activo sea igual a falso
            lista.removeIf(x -> !x.isActivo());
        }
        return lista;

    }
}
