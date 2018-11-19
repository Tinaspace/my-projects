<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="top.jsp"%> 
<%
  if(request.getAttribute("target")==null)
     pageContext.setAttribute("target","regist.jsp");
 %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>图书销售网</title> 
<link href="css.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
	var message='${message}';
	if(message!=''){
	alert(message);
	}
function dopost(){
	var registForm=document.getElementById("registForm");
	registForm.method="post";
	registForm.action="saveMember";
	if(confirm("确定要提交吗？")){
		registForm.submit();
		}
}
function dologin(){
	var loginForm=document.getElementById("loginForm");
	loginForm.method="post";
	loginForm.action="dologin";
	loginForm.submit();
	}
function searchBooksByKeyWord(){
	var keySearchForm=document.getElementById("keySearchForm");
	keySearchForm.method="post";
	keySearchForm.submit();
}
//function (){
//	var =document.getElementById("");
//.method="post";
//	.submit();
//}
</script>
</head>
 
<table width="100" height="3" border="0" align="center" 
     cellpadding="0" cellspacing="0"  bgcolor="#f3e8ee">
  <tr>
    <td></td>
  </tr>
</table>
<table  width="1000" height="500"   align="center" >
  <tr>
    <td width="219"  align="left"  class="border" valign="top">
     <%@include file="left.jsp"%>    
    </td>
    <td width="3"></td>
    <td align="left" valign="top" class="border"> 
         <jsp:include page="${target}"></jsp:include>     
    </td>
  </tr>
</table>
<!-- 空出一个表格，防止连在一起 -->
<table width="100" height="3" border="0" align="center" cellpadding="0" cellspacing="0"  bgcolor="#f3e8ee">
  <tr>
    <td></td>
  </tr>
</table>
<%@include file="copy.jsp"%> 

 
