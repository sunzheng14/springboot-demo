package com.sun.zq.dao;

import com.sun.zq.model.Person;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByName(String name);

    List<Person> findByName(String name, Sort sort);

    List<Person> findByName(String name, Pageable pageable);

    List<Person> findByNameLike(String name);

    List<Person> findByNameAndEmail(String name, String email);

    List<Person> findFirst10ByName(String name);

    List<Person> findTop30ByName(String name);

}
