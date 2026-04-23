/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.impl;

import bd.ConectaDB;
import beans.Tipo_articulo;
import beans.dao.impl.DaoTipo_articulo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows 10
 */
public class DaoTipoArticuloImpl implements DaoTipo_articulo{

    @Override
    public List<Tipo_articulo> query() {
        List<Tipo_articulo>list = new ArrayList<Tipo_articulo>();
       try
       {
           Connection cn=ConectaDB.conexion();
           PreparedStatement ps = cn.prepareStatement("SELECT * FROM Tipo_articulo ORDER BY id_tipoarticulo");
           ResultSet rs = ps.executeQuery();
           while(rs.next())
           {
               Tipo_articulo tipo_articulo = new Tipo_articulo();
               tipo_articulo.setId_tipoarticulo(rs.getInt("id_tipoarticulo"));
               tipo_articulo.setDescripcion_articulo(rs.getString("descripcion_articulo"));
               list.add(tipo_articulo);
           }
           cn.close();
       }catch(SQLException e)
       {
           
       }
       return list;
    }


    @Override
    public int getCodigo() {
       int codigo = 0;
        try
       {
           Connection cn=ConectaDB.conexion();
           Statement ps = cn.createStatement();
           ResultSet rs = ps.executeQuery("SELECT MAX(id_tipoarticulo) AS CODIGO FROM tipo_articulo");
           while(rs.next())
           {
               
             codigo = rs.getInt("CODIGO");
           }
           cn.close();
       }catch(SQLException e)
       {
           
       }
        return codigo;
    }

    @Override
    public String insert(Tipo_articulo tipo_articulo) {
         String result = null;
       try{
           Connection cn = ConectaDB.conexion();
           PreparedStatement ps = cn.prepareStatement("INSERT INTO Tipo_articulo VALUES(?,?)");
           ps.setInt(1, tipo_articulo.getId_tipoarticulo());
           ps.setString(2, tipo_articulo.getDescripcion_articulo());
          
           int ctos = ps.executeUpdate();
           cn.close();
           if(ctos == 0)
           {
               result = "0 filas";
           }
           else
           {
               result = "Transaccion Exitosa! se afectaron "+ctos+" registros";
           }
       }catch(SQLException e){
           result = e.getMessage();
       }
       return result;
    }

    @Override
    public String update(Tipo_articulo tipo_articulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete(Integer id_tipoarticulo) {
        String result = null;
        try
        {
           Connection cn = ConectaDB.conexion();
           PreparedStatement ps = cn.prepareStatement("DELETE FROM Tipo_articulo WHERE id_tipoarticulo  = ? ");
           ps.setInt(1,id_tipoarticulo);
           int ctos = ps.executeUpdate();
           cn.close();
           if(ctos == 0)
           {
               result = "0 filas";
           }
           else
           {
               result = "Transaccion Exitosa! se elimino el codigo "+id_tipoarticulo;
           } 
        }catch(SQLException ex)
        {
            result = ex.getMessage();
        }
        return result;
    }


    
}
