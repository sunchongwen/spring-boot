package com.vuespring.springboottest.repository;

import com.vuespring.springboottest.entity.Menu;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MenuRepositoryTest {
    @Autowired
     private MenuRepository menuRepository;
    @Test
    void findAll(){
        List<Menu> menuList = menuRepository.findAll();
        System.out.println(menuList);

    }
}