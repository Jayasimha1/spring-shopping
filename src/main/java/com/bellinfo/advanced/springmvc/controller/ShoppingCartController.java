package com.bellinfo.advanced.springmvc.controller;

import com.bellinfo.advanced.springmvc.model.ShoppingCart;
import com.bellinfo.advanced.springmvc.model.Team;
import com.bellinfo.advanced.springmvc.service.ShoppingCartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/shoppingCart")
public class ShoppingCartController {

    Logger log = LoggerFactory.getLogger(ShoppingCartController.class);

    @Autowired
    ShoppingCartService shoppingCartService;


    @RequestMapping(value = "/", method= RequestMethod.GET)
    public String getIndex(Model model){
        ShoppingCart shoppingCart = new ShoppingCart();
        log.info("Team adding in / request", shoppingCart);
        model.addAttribute("shoppingCart", shoppingCart);
        return "shopping-login";
    }

    @RequestMapping(value = "/index", method= RequestMethod.GET)
    public String getIndexPage(Model model){
        ShoppingCart shoppingCart = new ShoppingCart();
        log.info("Team adding in / request", shoppingCart);
        model.addAttribute("shoppingCart", shoppingCart);
        return "shopping-login";
    }

}
