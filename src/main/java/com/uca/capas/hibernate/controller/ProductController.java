package com.uca.capas.hibernate.controller;

import javax.validation.Valid;

import com.uca.capas.hibernate.domain.Product;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

    @RequestMapping("/producto")
	public ModelAndView index11() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("product", new Product());
		mav.setViewName("product");
		return mav;
	}

    @RequestMapping("/validar")
    public ModelAndView procesar(@Valid @ModelAttribute Product product, BindingResult result){
        ModelAndView mav = new ModelAndView();

        if(result.hasErrors()) {
            mav.setViewName("product");
        }
        else {
            mav.addObject("code", product.getCode());
            mav.addObject("name", product.getName());
            mav.addObject("brand", product.getBrand());
            mav.addObject("description", product.getDescription());
            mav.addObject("stock", product.getStock());
            mav.addObject("inDate", product.getInDate());

            mav.setViewName("resultado");
        }

        return mav;
    }
    
}