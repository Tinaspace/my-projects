package com.oracle.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.biz.MemberBiz;
import com.oracle.entity.Book;

public class KeySearchServlet extends HttpServlet {

	private MemberBiz mbiz= new MemberBiz();
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String keyWord=request.getParameter("keyWord");
		try{
		List<Book> books= mbiz.findAllBooksByKeyWord(keyWord);
		request.getSession().setAttribute("books", books);
		}catch(SQLException e){
			e.printStackTrace();
		}
		request.setAttribute("target", "showBooks.jsp");
		request.getRequestDispatcher("main.jsp").forward(request, response);
		
	}

}
