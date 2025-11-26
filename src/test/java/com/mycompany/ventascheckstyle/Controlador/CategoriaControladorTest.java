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
    // Generar nombres aleatorios para evitar duplicacion
    private String randomName(String base) {
        return base + "_" + System.currentTimeMillis();
    }

    @Test
    public void testRegistrarCategoria() {
        System.out.println("Iniciando test: registrarCategoria");
        CategoriaControlador controlador = new CategoriaControlador();

        String nombreUnico = randomName("Electronica");

        boolean resultadoValido = controlador.registrarCategoria(nombreUnico);
        System.out.println("Resultado registrarCategoria(\"" + nombreUnico + "\"): " + resultadoValido);

        assertTrue(resultadoValido, "Debe registrar una categoría válida");
        System.out.println("✅ Test registrarCategoria FINALIZADO correctamente");
    }

    @Test
    public void testListarCategorias() {
        CategoriaControlador controlador = new CategoriaControlador();

        List<CategoriaDTO> lista = controlador.listarCategorias();

        String nombreUnico = randomName("PruebaCategoria");
        controlador.registrarCategoria(nombreUnico);

        List<CategoriaDTO> lista2 = controlador.listarCategorias();

        assertTrue(lista2.size() >= lista.size(),
                "La lista después de registrar debe tener igual o más elementos");
    }

    @Test
    public void testEliminarCategoria() {
        System.out.println("🧪 Iniciando test: eliminarCategoria");
        CategoriaControlador controlador = new CategoriaControlador();

        String nombreUnico = randomName("Temporal");
        controlador.registrarCategoria(nombreUnico);

        List<CategoriaDTO> lista = controlador.listarCategorias();

        // buscar la categoría que acabamos de crear (seguro no tiene productos asociados)
        CategoriaDTO creada = lista.stream()
                .filter(c -> c.getNombre().equals(nombreUnico))
                .findFirst()
                .orElse(null);

        assertNotNull(creada, "La categoría recién creada debe existir");

        boolean eliminado = controlador.eliminarCategoria(creada.getId());
        assertTrue(eliminado, "Debe eliminar la categoría recién creada");

        System.out.println("✅ Test eliminarCategoria FINALIZADO correctamente");
    }

    @Test
    public void testActualizarCategoria() {
        CategoriaControlador controlador = new CategoriaControlador();

        String nombreInicial = randomName("Comida");
        controlador.registrarCategoria(nombreInicial);

        List<CategoriaDTO> lista = controlador.listarCategorias();

        CategoriaDTO creada = lista.stream()
                .filter(c -> c.getNombre().equals(nombreInicial))
                .findFirst()
                .orElse(null);

        assertNotNull(creada, "La categoría recién creada debe existir");

        String nuevoNombre = randomName("Ropa");
        boolean actualizado = controlador.actualizarCategoria(creada.getId(), nuevoNombre);

        assertTrue(actualizado, "Debe actualizar una categoría válida");
    }
}