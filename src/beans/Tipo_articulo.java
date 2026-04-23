/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;

/**
 *
 * @author Windows 10
 */
public class Tipo_articulo implements Serializable{
    private int id_tipoarticulo;
    private String descripcion_articulo;

    public int getId_tipoarticulo() {
        return id_tipoarticulo;
    }

    public void setId_tipoarticulo(int id_tipoarticulo) {
        this.id_tipoarticulo = id_tipoarticulo;
    }

    public String getDescripcion_articulo() {
        return descripcion_articulo;
    }

    public void setDescripcion_articulo(String descripcion_articulo) {
        this.descripcion_articulo = descripcion_articulo;
    }
    
}
