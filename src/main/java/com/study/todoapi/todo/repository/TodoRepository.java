package com.study.todoapi.todo.repository;

import com.study.todoapi.todo.entity.Todo;
import com.study.todoapi.user.entity.User;
import com.sun.xml.bind.v2.TODO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, String> {


//    @Query("SELECT T FROM tbl_todo where user_id ")
//    List<Todo> findAllByUser(User user);
}
