package com.vuespring.springboottest.controller;

import com.vuespring.springboottest.entity.Book;
import com.vuespring.springboottest.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/book")
public class BookHandler {
    @Autowired
   private BookRepository bookRepository;

    @GetMapping("/findAll/{page}/{size}")
    public Page<Book> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
//        页码从零开始
        PageRequest pageable =PageRequest.of(page-1,size);
       return bookRepository.findAll( pageable);
    }

    @GetMapping("/findById/{id}")
    public Book findById(@PathVariable("id") Integer id){

        Book byId = bookRepository.findById(id).get();
        return byId;
    }
    @PostMapping("/save")
    public  String save(@RequestBody Book book){
        Book saveResult = bookRepository.save(book);
        if(saveResult !=null){
            return "save success";
        }else {
            return  "error";
        }

    }
    @PutMapping("/update")
    public  String update(@RequestBody Book book){
        Book saveResult = bookRepository.save(book);
        if(saveResult !=null){
            return "save success";
        }else {
            return  "error";
        }

    }
    @DeleteMapping("/deleteById/{id}")
    public void delete(@PathVariable("id") Integer id){

        bookRepository.deleteById(id);
    }

}
