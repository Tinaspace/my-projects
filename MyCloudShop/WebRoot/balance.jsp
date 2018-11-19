<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page pageEncoding="utf-8"%>
<table width="100%" align="center" valign="top" height="10%" class="drbk1">
	
	<tr>
		<td>
			<table width="100%" class="border">
				<tr>
				<tr>
					<td height="30" align="center" bgcolor="#ffa013" class="font2">
						结算商品</td>
				</tr>
			</table>
		</td>
	</tr>
</table>	
	
	<form action="save_order.php?act=add" method="post">
		 <table width="90%" class="font2"> 
				 <tr>
					 <td height="30" colspan="2" align="center">
						 <span class="word07">您尚未登录,如果您已经是会员,</span>
							 <a href="index.php?fm=yes" class="word09">请点这里登录</a>
						 <span class="word07">,或填写以下信息,同时注册新会员</span>
					 </td>
				 </tr>
				 <tr>
					 <td height="27" align="right" class="word08">收 货 人：</td>
					 <td><input name="name" type="text" id="name" /> 
					    <span class="word09">* </span>
					 </td>
				 </tr>
				 <tr>
					 <td height="30" align="right" class="word08">收货地址：</td>
					 <td><input name="address" type="text" id="address" /> 
					     <span class="word09">*</span>
					 </td>
				 </tr>
				 <tr>
					 <td height="30" align="right" class="word08" >递送方式：</td>
						 <td>
						     <select name="post_way" id="post_way">
									<option>邮政EMS</option>
									<option>顺风快递</option>
									<option>申通快递</option>
									<option>圆通快递</option>
								</select>
						</td>
				 </tr>
				 <tr>
					 <td height="30" align="right" class="word08">邮政编码：</td>
					 <td><input name="zip" type="text" id="zip" />
					    <span class="word09">*</span>
					  </td>
				 </tr>
				 <tr>
					 <td height="30" align="right" class="word08">联系电话：</td>
					 <td><input name="telephone" type="text" id="telephone" /> 
						 <span class="word09">*</span></td>
				 </tr>
				 <tr>
					 <td height="30" align="right" class="word08">电子信箱：</td>
					 <td><input name="email" type="text" id="email" /></td>
				 </tr>
				 <tr>
					 <td height="30" align="right" class="word08">手机号码：</td>
					 <td><input name="mobile" type="text" id="mobile" /></td>
				 </tr>
				 <tr>
					 <td height="30" align="right" class="word08">留言备注：</td>
					 <td>
					 <label> 
					    <textarea name="content" cols="50" rows="10"
									id="content">
						 </textarea> 
					 </label></td>
				 </tr>
				 <tr>
					 <td width="24%" height="30" align="right" class="word09">&nbsp;</td>
					 <td width="76%" colspan="2" align="center" class="zhongtext12">   
		                  <img src="images/an_qd.png">
		                   &nbsp; 
		                  <img src="images/an_qx.png">
						 
					 </td>
				 </tr> 			
			 </table>
		 </form>
