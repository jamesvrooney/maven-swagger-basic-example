package com.example.librarymaven.service;

import com.example.models.Book;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class LibraryServiceImpl implements LibraryService{
    @Override
    public List<Book> getAllBooks() {
        Book oliverTwist = new Book();
        oliverTwist.setName("Oliver Twist");
        oliverTwist.setAuthor("Charles Dickens");

        Book gameOfThrones = new Book();
        gameOfThrones.setName("Game of Thrones");
        gameOfThrones.setAuthor("E.L. Ryan");

        List<Book> books = Arrays.asList(oliverTwist, gameOfThrones);

        return books;
    }
}
