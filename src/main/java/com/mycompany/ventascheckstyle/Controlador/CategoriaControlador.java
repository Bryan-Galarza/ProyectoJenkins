package com.mycompany.ventascheckstyle.Controlador;

import com.mycompany.ventascheckstyle.Modelo.CategoriaDAO;
import com.mycompany.ventascheckstyle.Modelo.CategoriaDTO;
import java.util.List;

//Controlador de categoria
public class CategoriaControlador {
    private CategoriaDAO categoriaDAO;

    public CategoriaControlador() {
        categoriaDAO = new CategoriaDAO();
    }

    public boolean registrarCategoria(String nombre) {
        CategoriaDTO categoria = new CategoriaDTO();
        categoria.setNombre(nombre);
        return categoriaDAO.agregarCategoria(categoria);
    }

    public List<CategoriaDTO> listarCategorias() {
        return categoriaDAO.listarCategorias();
    }
    public boolean eliminarCategoria(int idCategoria){
        return categoriaDAO.eliminarCategoria(idCategoria);
    }
    
    public boolean actualizarCategoria(int id, String nombre) {
        CategoriaDTO categoria = new CategoriaDTO();
        categoria.setId(id);
        categoria.setNombre(nombre);
        return categoriaDAO.actualizarCategoria(categoria);
    }
}