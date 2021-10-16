package de.gre90r.jspdemo;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BookServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	/**
	 * this method name belongs to a servlet lifecycle
	 */
	public void service(HttpServletRequest request, HttpServletResponse response) {
		
		String name = request.getParameter("name");
		String author = request.getParameter("author");
		
		try {
			response.getWriter().println(String.format("added book {name=%s, author=%s}", name, author));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * this method name belongs to a servlet lifecycle
	 */
//	public void doGet(HttpServletRequest request, HttpServletResponse response) {
//		
//	}
	
	/**
	 * this method name belongs to a servlet lifecycle
	 */
//	public void doPost(HttpServletRequest request, HttpServletResponse response) {
//		
//	}

}
