package com.StudentReg;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import com.StudentReg.model.Student;
public interface StudentRepository extends JpaRepository<Student,Integer> {
	
	
//	@Query("select * from Student s where s.sname=")
//	Student getByName(String s);
//	 public List<Student> getAllStudents();
//	 public Student getStudentById(int id);
//	 public Student updateById(int id, Student s);
//	 public String deleteStudent(int id);
	
}