package com.StudentReg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentReg.model.Student;
import com.StudentReg.service.StudentLogic;

@RestController
@CrossOrigin(origins = "*")
public class StudentController {

	@Autowired
    StudentLogic logic;	
	
	@PostMapping("/register")
    public Student register(@RequestBody Student student) {
		return  logic.register(student);   
    }
	
	@GetMapping("/")
	public List<Student> getAll(){
		return logic.getAllStudents();
	}
	@GetMapping("/{id}")
	public Student getById(@PathVariable int id) {
	    return logic.getById(id);
	}
	@PostMapping("/")
	public  String postData(@RequestBody Student s) {
		return logic.insert(s);
	}
	
	@PutMapping("/{id}")
	public String putData( @PathVariable int id,  @RequestBody Student s) {
		return logic.UpdateById(id, s);
	}
	
	@DeleteMapping("/{id}")
	public String deleteData(@PathVariable int id) {
		return logic.deleteById(id);
	}
	@DeleteMapping("/")
		public String deleteAll() {
		return logic.deleteAll();
	}}
	
	
