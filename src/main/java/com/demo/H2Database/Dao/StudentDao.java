package com.demo.H2Database.Dao;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.H2Database.model.Student;

public interface StudentDao extends JpaRepository<Student, Id> {

}
