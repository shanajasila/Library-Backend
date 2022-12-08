package com.example.LibraryApp.backend.dao;


import com.example.LibraryApp.backend.model.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Bookdao extends CrudRepository<Book,Integer> {

    @Query(value = "SELECT `id`, `author`, `booktitle`, `description`, `image` FROM `books` WHERE `booktitle` LIKE %:booktitle%",nativeQuery = true)
    List<Book>searchBook(@Param("booktitle")String booktitle);
}
