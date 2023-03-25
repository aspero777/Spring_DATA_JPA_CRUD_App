package org.example.spring.repositories;

import org.example.spring.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
   // List<Person> findByName(String name);

   Optional<Person> findByName(String name);

    //List<Person> findByEmail(String email);

    //List<Person> findByNameStartingWith(String startingWith);

    //List<Person> findByNameOrEmail(String name, String email);

}
