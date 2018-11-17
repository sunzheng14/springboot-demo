package com.sun.zq.dao;

import com.sun.zq.model.Person;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface PersonMapper {
    @Select("SELECT * FROM Person")
    @Results({@Result(property = "name", column = "name")})
    List<Person> getAll();

    @Select("SELECT * FROM Person WHERE id = #{id}")
    @Results({@Result(property = "name", column = "name")})
    Person getOne(Long id);

    @Insert("INSERT INTO Person(name,age,email) VALUES(#{name}, #{age}, #{email})")
    void insert(Person person);

    @Update("UPDATE Person SET name=#{name},age=#{age} WHERE id =#{id}")
    void update(Person person);

    @Delete("DELETE FROM Person WHERE id =#{id}")
    void delete(Long id);
}
