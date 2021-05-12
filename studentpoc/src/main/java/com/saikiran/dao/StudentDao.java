package com.saikiran.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saikiran.model.Student;

public interface StudentDao extends JpaRepository<Student ,Integer> {

}
