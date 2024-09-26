package com.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.model.Product;
import com.service.ProductService;

@WebServlet("/update")
@MultipartConfig(location = "C:/Users/Darsh Joshi/eclipse-workspace/JavaWebAssessment/src/main/webapp/images", maxFileSize = 1024
		* 1024 * 5, maxRequestSize = 1024 * 1024 * 25, fileSizeThreshold = 1024 * 1024)
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));

		String name = request.getParameter("name");
		String category = request.getParameter("category");
		String model = request.getParameter("model");
		String price = request.getParameter("price");
		String description = request.getParameter("description");
		Part part = request.getPart("imageName");
		String imageName = part.getName();

		Product product = new Product();
		product.setId(id);
		product.setName(name);
		product.setCategory(category);
		product.setModel(model);
		product.setPrice(Integer.parseInt(price));
		product.setDescription(description);
		product.setImageName(imageName);

		ProductService.update(product);
		response.sendRedirect("view");
	}

}
