package com.vuespring.springboottest.repository;

import com.vuespring.springboottest.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class BookRepositoryTest {
    @Autowired
    BookRepository bookRepository;
    @Test
    void findAll(){
        List all = bookRepository.findAll();
        System.out.println(all);

    }
    @Test
    void save(){
        Book book = new Book();
        book.setId(12);
        book.setDetail("adfafd");
        book.setTitle("adfafd");
        Book save = bookRepository.save(book);
        System.out.println(save);
    }
    @Test
    void findById(){
        Integer id =1;
        Optional<Book> repositoryById = bookRepository.findById(1);
        System.out.println(repositoryById);
    }
}