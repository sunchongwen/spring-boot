package com.vuespring.springboottest.controller;

import com.vuespring.springboottest.entity.Book;
import com.vuespring.springboottest.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/book2")
public class MyBookHandler {
   @Autowired
    BookRepository bookRepository;

   @GetMapping("/findAll/{pagenum}/{pagesize}")
   public Page<Book> findAll(@PathVariable("pagenum") Integer pagenum,@PathVariable("pagesize") Integer pagesize){
       Pageable pageable = PageRequest.of(pagenum,pagesize);
       Page<Book>  bookListPage= bookRepository.findAll(pageable);
       return bookListPage;
   }

}
