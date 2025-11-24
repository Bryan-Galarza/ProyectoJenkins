
package com.mycompany.ventascheckstyle.Modelo;
/**
 *
 * @author BryanG
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {
    private Connection conn;

    public CategoriaDAO() {
        conn = Conexion.getConnection();
    }

    public boolean agregarCategoria(CategoriaDTO categoria) {
        String sql = "INSERT INTO categorias (nombre) VALUES (?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, categoria.getNombre());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error al agregar categoría: " + e.getMessage());
            return false;
        }
    }

    public List<CategoriaDTO> listarCategorias() {
        List<CategoriaDTO> categorias = new ArrayList<>();
        String sql = "SELECT * FROM categorias";
        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                CategoriaDTO categoria = new CategoriaDTO();
                categoria.setId(rs.getInt("id"));
                categoria.setNombre(rs.getString("nombre"));
                categorias.add(categoria);
            }
        } catch (Exception e) {
            System.out.println("Error al listar categorías: " + e.getMessage());
        }
        return categorias;
    }
        public boolean eliminarCategoria (int idCategoria){
        String sql = "DELETE FROM categorias WHERE id = ?";
        try(Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, idCategoria);
            int filasAfectadas = stmt.executeUpdate();
            return filasAfectadas > 0;         
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
 
   public boolean actualizarCategoria(CategoriaDTO categoria) {
    String sql = "UPDATE categorias SET nombre = ? WHERE id = ?";
    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, categoria.getNombre());
        ps.setInt(2, categoria.getId());
        int filasAfectadas = ps.executeUpdate();
        return filasAfectadas > 0;
    } catch (Exception e) {
        System.out.println("Error al actualizar categoría: " + e.getMessage());
        return false;
    }
}
        
}
