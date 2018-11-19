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
	 * ʹ�ù�������������������
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
			request.setAttribute("message", "�ף���ӭ����");
			request.getSession().setAttribute("userId", nickname);
			request.setAttribute("target", "showBooks.jsp");
			//��ѯ���е�ͼ��
			try{
			List<Book> books=mbiz.findAllBooks();
			request.getSession().setAttribute("books", books);
			}catch (Exception e){
				e.printStackTrace();
			}
		}else{
			request.setAttribute("message", "�ǳ���Ǹ��������������");
			request.setAttribute("target", "regist.jsp");
		}
		
		request.getRequestDispatcher("main.jsp").forward(request, response);
	}

}
