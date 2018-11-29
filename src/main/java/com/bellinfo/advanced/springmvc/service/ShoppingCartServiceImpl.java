package com.bellinfo.advanced.springmvc.service;

import com.bellinfo.advanced.springmvc.model.ShoppingCart;
import com.bellinfo.advanced.springmvc.repository.ShoppingCartRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Autowired
    ShoppingCartRep shoppingCartRep;


    @Override
    public void addShoppingCart(ShoppingCart shoppingCart){
        shoppingCartRep.addShoppingCart(shoppingCart);
    }
}
