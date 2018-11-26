package com.jlc.online.ws.dao;

import java.util.List;

import com.jlc.online.ws.StudentTO;

public interface StudentDAO {
public List<StudentTO>getAllStudents();
public StudentTO getStudent(int id);
public void addStudent(String name,String email,long phone);
}
