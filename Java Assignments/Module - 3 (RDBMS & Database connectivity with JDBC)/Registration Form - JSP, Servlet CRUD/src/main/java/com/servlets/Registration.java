package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/submit")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Person person = new Person();
		
		person.setId(Integer.parseInt(request.getParameter("id")));
		person.setName(request.getParameter("name"));
		person.setGender(request.getParameter("gender"));
		person.setAddress(request.getParameter("address"));
		person.setContact(Integer.parseInt(request.getParameter("contact")));
		
		System.out.println(Dao.savePerson(person));
		
		response.sendRedirect("http://localhost:8080/RegistrationForm");
	}
}

