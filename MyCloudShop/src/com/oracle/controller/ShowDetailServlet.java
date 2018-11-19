package com.oracle.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.biz.MemberBiz;
import com.oracle.entity.Book;

public class ShowDetailServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	MemberBiz mb= new MemberBiz();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String bookid=request.getParameter("id");
		try{
		Book book=mb.findBookByBookId(Integer.parseInt(bookid));
		request.setAttribute("book",book);
		request.setAttribute("target", "showDetail.jsp");
		}catch (NumberFormatException e){
				e.printStackTrace();
		}catch (SQLException e){
			e.printStackTrace();
		}
		request.getRequestDispatcher("main.jsp").forward(request, response);;
	}

}
