package com.saikiran.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saikiran.dao.StudentDao;
import com.saikiran.model.Student;

@Service
public class StudentService {
	@Autowired
	StudentDao stddao;
	
	public Student createStudent(Student student) {
		return stddao.save(student);
	}
	
	public Optional<Student> getById(Integer stdId) {
		return stddao.findById(stdId);
	}
	
	public Iterable<Student> getAll() {
		return stddao.findAll();
	}

}
