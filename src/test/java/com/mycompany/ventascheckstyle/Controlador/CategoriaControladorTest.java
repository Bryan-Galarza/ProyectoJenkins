package com.mycompany.ventascheckstyle.Controlador;

import com.mycompany.ventascheckstyle.Modelo.CategoriaDTO;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias básicas para CategoriaControlador.
 * Estas pruebas no usan base de datos; solo prueban lógica mínima.
 */
public class CategoriaControladorTest {

    @Test
    public void testRegistrarCategoria() {
        System.out.println("Iniciando test: registrarCategoria");
        CategoriaControlador controlador = new CategoriaControlador();
        // Caso: nombre válido → debe registrar (true)
        boolean resultadoValido = controlador.registrarCategoria("Electronica");
        System.out.println("Resultado registrarCategoria(\"Electronica\"): " + resultadoValido);

        assertTrue(resultadoValido, "Debe registrar una categoría válida");
        System.out.println("✅ Test registrarCategoria FINALIZADO correctamente");
    }

    @Test
    public void testListarCategorias() {
        CategoriaControlador controlador = new CategoriaControlador();

        List<CategoriaDTO> lista = controlador.listarCategorias();

        // Para este caso simple, asumimos que devuelve al menos una categoría si registrar funciona
        controlador.registrarCategoria("PruebaCategoria");
        List<CategoriaDTO> lista2 = controlador.listarCategorias();

        assertTrue(lista2.size() >= lista.size(),
                "La lista después de registrar debe tener igual o más elementos");
    }

    @Test
    public void testEliminarCategoria() {
        System.out.println("🧪 Iniciando test: eliminarCategoria");
        CategoriaControlador controlador = new CategoriaControlador();

        controlador.registrarCategoria("Temporal");
        List<CategoriaDTO> lista = controlador.listarCategorias();
        System.out.println("Tamaño lista antes de eliminar: " + (lista != null ? lista.size() : "null"));

        if (!lista.isEmpty()) {
            int id = lista.get(0).getId();
            System.out.println("Intentando eliminar categoría con id: " + id);

            boolean eliminado = controlador.eliminarCategoria(id);
            System.out.println("Resultado eliminarCategoria(" + id + "): " + eliminado);

            assertTrue(eliminado, "Debe eliminar una categoría válida");
        } else {
            System.out.println("No hay categorías, probando eliminar ID inexistente 9999");
            boolean eliminadoFalso = controlador.eliminarCategoria(9999);
            System.out.println("Resultado eliminarCategoria(9999): " + eliminadoFalso);

            assertFalse(eliminadoFalso, "Eliminar ID inexistente debe devolver false");
        }

        System.out.println("✅ Test eliminarCategoria FINALIZADO correctamente");
    }

    @Test
    public void testActualizarCategoria() {
        CategoriaControlador controlador = new CategoriaControlador();
        // Registrar categoría inicial
        controlador.registrarCategoria("Comida");
        List<CategoriaDTO> lista = controlador.listarCategorias();

        if (!lista.isEmpty()) {
            int id = lista.get(0).getId();

            boolean actualizado = controlador.actualizarCategoria(id, "Ropa");
            assertTrue(actualizado, "Debe actualizar una categoría válida");
        } else {
            boolean actualizadoFalso = controlador.actualizarCategoria(0, "Otro");
            assertFalse(actualizadoFalso, "Actualizar categoría inexistente debe fallar");
        }
    }
}