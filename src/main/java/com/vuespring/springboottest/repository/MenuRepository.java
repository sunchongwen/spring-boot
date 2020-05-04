package com.vuespring.springboottest.repository;

import com.vuespring.springboottest.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu,Integer> {
}
