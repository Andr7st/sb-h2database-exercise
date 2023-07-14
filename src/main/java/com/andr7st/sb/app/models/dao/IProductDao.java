/**
 * @author Andrés Segura - https://github.com/Andr7st
 * proyecto de prática spring boot persistencia.
 * */

package com.andr7st.sb.app.models.dao;

import com.andr7st.sb.app.models.entity.Product;

import java.util.List;

public interface IProductDao {

    public List<Product> findAll();

}
