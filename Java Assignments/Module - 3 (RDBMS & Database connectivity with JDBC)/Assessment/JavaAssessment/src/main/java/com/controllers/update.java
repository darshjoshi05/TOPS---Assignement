package com.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Product;
import com.service.ProductService;

@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String quantity = request.getParameter("quantity");
		String company = request.getParameter("company");

		Product p = new Product();
		p.setId(id);
		p.setName(name);
		p.setPrice(Integer.parseInt(price));
		p.setQuantity(Integer.parseInt(quantity));

		ProductService.update(p);
		response.sendRedirect("index.jsp");
	}

}
