<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
session.removeAttribute("userId");
request.setAttribute("target","regist.jsp");
request.getRequestDispatcher("main.jsp").forward(request,response);
%>

