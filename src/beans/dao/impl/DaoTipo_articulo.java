/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.dao.impl;

import beans.Tipo_articulo;
import java.util.List;

/**
 *
 * @author Windows 10
 */
public interface DaoTipo_articulo {
    public List<Tipo_articulo>query();
    public String insert(Tipo_articulo tipo_articulo);
    public String delete(Integer id_tipoarticulo);
    public String update(Tipo_articulo tipo_articulo);
    public int getCodigo();
    
}
