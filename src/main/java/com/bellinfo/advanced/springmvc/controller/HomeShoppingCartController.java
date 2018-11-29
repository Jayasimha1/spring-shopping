package com.bellinfo.advanced.springmvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class HomeShoppingCartController {

    @RequestMapping(value = "/", method= RequestMethod.GET)
    public String getIndex(Model model){
        HomeShoppingCartController homeShoppingCartController = new HomeShoppingCartController();
        model.addAttribute("homeShoppingCartController", homeShoppingCartController);
        return "team-login";
    }

    @RequestMapping(value = "/index", method= RequestMethod.GET)
    public String getIndexPage(Model model){
        HomeShoppingCartController homeShoppingCartController = new HomeShoppingCartController();
        model.addAttribute("homeShoppingCartController", homeShoppingCartController);
        return "team-login";
    }
}
