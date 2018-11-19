package com.oracle.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.biz.MemberBiz;
import com.oracle.entity.Book;

public class DoLoginSrevlet extends HttpServlet {

	/**
	 * 使用过滤器来处理中文乱码
	 */
	private MemberBiz mbiz= new MemberBiz();
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//response.setContentType("text/html;charset=utf-8");
		//PrintWriter out = response.getWriter();
		String nickname=request.getParameter("nickname");
		String memberpwd=request.getParameter("memberpwd");
		int ret=mbiz.doLoign(nickname, memberpwd);
		if(ret>0){
			request.setAttribute("message", "亲，欢迎您！");
			request.getSession().setAttribute("userId", nickname);
			request.setAttribute("target", "showBooks.jsp");
			//查询所有的图书
			try{
			List<Book> books=mbiz.findAllBooks();
			request.getSession().setAttribute("books", books);
			}catch (Exception e){
				e.printStackTrace();
			}
		}else{
			request.setAttribute("message", "非常抱歉，您不可以消费");
			request.setAttribute("target", "regist.jsp");
		}
		
		request.getRequestDispatcher("main.jsp").forward(request, response);
	}

}
