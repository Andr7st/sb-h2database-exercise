/**
 * @author Andrés Segura - https://github.com/Andr7st
 * proyecto de prática spring boot persistencia.
 * */

package com.andr7st.sb.app.controllers;

import com.andr7st.sb.app.models.dao.IProductDao;
import com.andr7st.sb.app.models.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    @Qualifier("productDaoJPA") // Apuntar explícitamente al archivo ClientDaoImpl.java para evitar que sea ambiguo | Elegir el bean concreto
    private IProductDao productDao;

    @RequestMapping(value = "/list", method= RequestMethod.GET)
    public String listClients(Model model) {

        List<Product> productList = productDao.findAll();

        model.addAttribute("title", "Lista de productos");
        model.addAttribute("products", productList);

        return "/list";
    }

}
