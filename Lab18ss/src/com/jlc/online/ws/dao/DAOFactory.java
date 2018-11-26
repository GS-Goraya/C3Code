package com.jlc.online.ws.dao;

import com.jlc.online.ws.dao.impl.HibernateStudentDAO;

public class DAOFactory {
static StudentDAO studentDAO;
static
{
	studentDAO=new HibernateStudentDAO();
}
public static StudentDAO getStudentDAO()
{
	return studentDAO;
}
}
