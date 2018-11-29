package com.bellinfo.advanced.springmvc.repository;

import com.bellinfo.advanced.springmvc.model.ShoppingCart;
import com.bellinfo.advanced.springmvc.model.Team;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ShoppingCartRepImpl implements ShoppingCartRep {

    @Autowired
    SessionFactory sessionFactory;

    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }
    @Override
    public void addShoppingCart(ShoppingCart shoppingCart) {

        getSession().save(shoppingCart);

    }
}
