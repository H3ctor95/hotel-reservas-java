/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.dao.impl;

import beans.Articulo;
import java.util.List;

/**
 *
 * @author Windows 10
 */
public interface DaoArticulo {
    public List<Articulo>query();
    public String insert(Articulo articulo);
    public String delete(Integer id_articulo);
    public String update(Articulo articulo);
    public int getCodigo();
}
