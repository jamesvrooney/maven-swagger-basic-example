package com.example.librarymaven.controller;

import com.example.api.LibraryApi;
import com.example.librarymaven.service.LibraryService;
import com.example.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibraryController implements LibraryApi {

    @Autowired
    private LibraryService libraryService;

    @Override
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = libraryService.getAllBooks();

        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}
