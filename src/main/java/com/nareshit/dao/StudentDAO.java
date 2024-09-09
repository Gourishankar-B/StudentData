package com.nareshit.dao;

import java.util.List;

import com.nareshit.model.Student;

public interface StudentDAO 
{
	List<Student> getAllStudent();
	void saveStudent(Student st);
	void deleteStudent(Integer stuId);
	void updateStudent(Student st);
	Student getStudent(Integer stuId);

}
