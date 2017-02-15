package com.dayone.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductController
 */
public class ProductController extends HttpServlet {
		ProductDAO productDAO=new ProductDAO();
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
				
		String pname=request.getParameter("pro_name");
		long pprice=Long.parseLong(request.getParameter("pro_price"));
		String pdetails=request.getParameter("pro_details");
		
		Model product=new Model();
		product.setPro_name(pname);
		product.setPro_price(pprice);
		product.setPro_details(pdetails);
		productDAO.add(product);
		List<Model>products=new ArrayList<Model>();
		products.add(product);
		request.setAttribute("product", product);
		RequestDispatcher rd=request.getRequestDispatcher("Show.jsp");
		rd.forward(request, response);
		
		
	}


}
