package com.StudentReg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentReg.StudentRepository;
import com.StudentReg.model.Student;

@Service
public class StudentLogic {
	@Autowired
	StudentRepository repo;
	
    public Student register(Student student) {
        return repo.save(student);
    }

	public List<Student> getAllStudents() {
		return repo.findAll();
	}

	public Student getById(int id) {
		return repo.findById(id).orElse(null);
	}

	public String UpdateById(int id, Student s) {
		s.setSid(id);
		repo.save(s);
		return "Update";
	}

	public String insert(Student s) {
		if (repo.existsById(s.getSid())) {
			return "Data inseted";
		}

		else {
			repo.save(s);
			return "already exist";
		}
	}

	public String deleteById(int id) {
		repo.deleteById(id);
		return "deleted by id  data";
	}
	public String deleteAll() {
		repo.deleteAll();
		return " All data deleted";
	}
}
