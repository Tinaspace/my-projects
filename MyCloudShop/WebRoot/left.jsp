<%@ page  pageEncoding="utf-8"%>
 <%
   if(session.getAttribute("userId")==null){ 
      
 %>

<table   height="50%" class="border font2 drbk1">
      <tr>
        <td  valign="top" height="30px">
        <img src="images/tit_dr.png" width="290"/></td>
      </tr>
      <tr>
        <td   height="30px">
        <form id="loginForm">
        <table align="center" >
          <tr>
            <td   class="font1">用户名:</td>
            <td><input name="nickname" type="text" class="input1" id="uname" /></td>
          </tr>
          <tr>
            <td   class="font1">密&nbsp;码:</td>
            <td><input  type="password" class="input1" id="upass" name="memberpwd" /></td>
          </tr>
          <tr>
            <td  >&nbsp;</td>
            <td valign="bottom">
              <table width="160" >
              <tr>
                  <td width="82">
                    <img src="images/an_dr.png" width="72" height="34" onclick="dologin()"/>
                  </td>
                <td>立即注册</td>
              </tr>
            </table></td>
          </tr>
        </table>
        </form>
        </td>
      </tr>
    </table>
<%
	}
	else
	{
	 
%>
<table width="217"   class="border font2 drbk1"  height="50%" >
      <tr>
        <td valign="top">
        <img src="images/tit_dr.png" width="290"/></td>
      </tr>
      <tr>
        <td   align="center"  valign="top">
                        欢迎您  &nbsp; ${userId}
        </td>
        </tr>
      <tr>
           <td   align="center" valign="top" >
              <a href="go.jsp?pageName=modifyPwd.jsp" class="text12">修改密码</a> 
              &nbsp;&nbsp;
              <a href="myorder.php" class="text12">订单管理</a>
           </td>
        </tr>  
      <tr>
        <td   align="center" valign="top">
           <a href="exit.jsp" class="text12">退出登录</a>
        </td>
        </tr>
    </table>
<%
	}
  String pageName=null;
  if(request.getAttribute("target")!=null){
  	pageName=request.getAttribute("target").toString();
  }
  if(pageName!=null&&pageName.equals("showBooks.jsp")){
%>

<%@ include file="keySearch.jsp"%>
<%
  }
%>