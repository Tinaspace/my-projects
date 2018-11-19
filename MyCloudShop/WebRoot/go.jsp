<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String pageName=request.getParameter("pageName");
request.setAttribute("target", pageName);
request.getRequestDispatcher("main.jsp").forward(request, response);
%>

 