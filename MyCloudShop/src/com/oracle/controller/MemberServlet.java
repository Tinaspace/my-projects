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
	 * ������Ա
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
			request.setAttribute("message", "��Ա�����ɹ������¼");
		}else{
			request.setAttribute("message", "��Ա����ʧ�ܣ�����ע��ʱ�������Ϣ��");
		}
		//��main.jsp ����target ָ��ҳ��
		request.setAttribute("target", "regist.jsp");
		//ҳ����ת
		request.getRequestDispatcher("main.jsp").forward(request,response);
		out.flush();
		out.close();
	}

}
