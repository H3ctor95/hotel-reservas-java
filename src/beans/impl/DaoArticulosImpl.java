/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.impl;

import bd.ConectaDB;
import beans.Articulo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import beans.dao.impl.DaoArticulo;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Windows 10
 */
public class DaoArticulosImpl implements DaoArticulo {

    @Override
    public List<Articulo> query() {
         List<Articulo>list = new ArrayList<Articulo>();
       try
       {
           Connection cn=ConectaDB.conexion();
           PreparedStatement ps = cn.prepareStatement("SELECT * FROM articulo ORDER BY id_articulo");
           ResultSet rs = ps.executeQuery();
           while(rs.next())
           {
               Articulo articulo = new Articulo();
               articulo.setId_articulo(rs.getInt("ID_ARTICULO"));
               articulo.setDescripcion(rs.getString("descripcion"));
               articulo.setPrecio_venta(rs.getFloat("precio_venta"));
               articulo.setPrecio_costo(rs.getFloat("precio_costo"));
               articulo.setCod_tipo_articulo(rs.getInt("cod_tipo_articulo"));
               articulo.setFecha_ingreso(rs.getString("fecha_ingreso"));
               list.add(articulo);
           }
           cn.close();
       }catch(SQLException e)
       {
           
       }
       return list;
    }

    @Override
    public String insert(Articulo articulo) {
       String result = null;
       try{
           Connection cn = ConectaDB.conexion();
           PreparedStatement ps = cn.prepareStatement("INSERT INTO Articulo VALUES(?,?,?,?,?,?)");
           ps.setInt(1, articulo.getId_articulo());
           ps.setString(2, articulo.getDescripcion());
           ps.setFloat(3,articulo.getPrecio_venta());
           ps.setFloat(4, articulo.getPrecio_costo());
           ps.setInt(5,articulo.getCod_tipo_articulo());
           ps.setString(6, articulo.getFecha_ingreso());
          
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
    public String delete(Integer id_articulo) {
        String result = null;
        try
        {
           Connection cn = ConectaDB.conexion();
           PreparedStatement ps = cn.prepareStatement("DELETE FROM Articulo WHERE Id_articulo  = ? ");
           ps.setInt(1,id_articulo);
           int ctos = ps.executeUpdate();
           cn.close();
           if(ctos == 0)
           {
               result = "0 filas";
           }
           else
           {
               result = "Transaccion Exitosa! se elimino el codigo "+id_articulo;
           } 
        }catch(SQLException ex)
        {
            result = ex.getMessage();
        }
        return result;
    }

    @Override
    public int getCodigo() {
        int codigo = 0;
        try
       {
           Connection cn=ConectaDB.conexion();
           Statement ps = cn.createStatement();
           ResultSet rs = ps.executeQuery("SELECT MAX(Id_articulo) AS CODIGO FROM Articulo");
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
    public String update(Articulo articulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




    
}
