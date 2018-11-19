package com.oracle.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.biz.MemberBiz;

public class SavePwdServlet extends HttpServlet {

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	private MemberBiz mbiz= new MemberBiz();
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//response.setContentType("text/html;charset=utf-8");
		//PrintWriter out = response.getWriter();
		String oldpass=request.getParameter("oldpass");
		String newpass=request.getParameter("newpass");
		String userId=request.getSession().getAttribute("userId").toString();
		int ret=mbiz.modifyPwd(oldpass,newpass , userId);
		if(ret>0){
			request.setAttribute("message", "密码更新成功");
		}else{
			request.setAttribute("message", "密码更新失败");
		}
		request.setAttribute("target", "modifyPwd.jsp");
		request.getRequestDispatcher("main.jsp").forward(request, response);
		
	}

}
