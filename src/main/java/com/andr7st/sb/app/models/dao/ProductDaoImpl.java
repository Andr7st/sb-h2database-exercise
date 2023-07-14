/**
 * @author Andrés Segura - https://github.com/Andr7st
 * proyecto de prática spring boot persistencia.
 * */

package com.andr7st.sb.app.models.dao;

import com.andr7st.sb.app.models.entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("productDaoJPA")
public class ProductDaoImpl implements IProductDao {

    @PersistenceContext // va a utilizar la base de datos H2
    private EntityManager entityManager;

    @Transactional(readOnly = true) // es solo de consulta
    @Override
    public List<Product> findAll() {
        // ignorar warning
        return entityManager.createQuery("from Products").getResultList();
    }
}
