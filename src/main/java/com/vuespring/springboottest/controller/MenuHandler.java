package com.vuespring.springboottest.controller;


import com.vuespring.springboottest.entity.Menu;
import com.vuespring.springboottest.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/menu")
public class MenuHandler {
    @Autowired
    private MenuRepository menuRepository;

    @GetMapping("/findAll")
    public List<Menu> findAll() {
        return menuRepository.findAll();

    }
}
