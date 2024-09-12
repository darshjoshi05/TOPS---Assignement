package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Update() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		Person oldPerson = Dao.getUserById(id);
		
		oldPerson.setId(id);
		oldPerson.setName(request.getParameter("name"));
		oldPerson.setGender(request.getParameter("gender"));
		oldPerson.setAddress(request.getParameter("address"));
		oldPerson.setContact(Integer.parseInt(request.getParameter("contact")));
		
		System.out.println(Dao.updatePerson(oldPerson));
		response.sendRedirect("http://localhost:8080/RegistrationForm/view");
	}

}
