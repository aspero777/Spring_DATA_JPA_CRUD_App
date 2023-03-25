package org.example.spring.repositories;

import org.example.spring.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {
    List<Book> findByTitleStartingWith(String title);

    //person.getItems()
    //List<Book> findByOwner(Person owner);
}
