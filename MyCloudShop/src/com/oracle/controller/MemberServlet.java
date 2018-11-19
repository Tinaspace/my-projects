package com.oracle.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.biz.MemberBiz;
import com.oracle.entity.Member;

public class MemberServlet extends HttpServlet {

	/**
	 * 新增会员
	 */
	private MemberBiz mbiz= new MemberBiz();
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String nickname=request.getParameter("nickname");
		String memberpwd=request.getParameter("memberpwd");
		String membername=request.getParameter("membername");
		String membergender=request.getParameter("membergender");
		String membertel=request.getParameter("membertel");
		String memberemail=request.getParameter("memberemail");
		Member member =new Member(nickname,memberpwd,membername,membergender,Double.parseDouble(membertel),memberemail);
		
		int ret=mbiz.saveMember(member);
		if(ret>0){
			request.setAttribute("message", "会员新增成功，请登录");
		}else{
			request.setAttribute("message", "会员新增失败，请检查注册时输入的信息！");
		}
		//让main.jsp 包含target 指向页面
		request.setAttribute("target", "regist.jsp");
		//页面跳转
		request.getRequestDispatcher("main.jsp").forward(request,response);
		out.flush();
		out.close();
	}

}
