<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page pageEncoding="utf-8"%>
<table width="100%" align="center" valign="top" height="10%"
	class="drbk1">
	<tr>
		<td>
			<table width="100%" class="border">
				<tr>
				<tr>
					<td height="30" align="center" bgcolor="#ffa013" class="font2">
						商品详情展示</td>
				</tr>
			</table>
		</td>
	</tr>
</table>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td>
			<table width="100%" border="0" cellpadding="0" cellspacing="0"
				class="border">
				<tr>
					<td width="41%" height="247" align="center">
					<img src="upload/${book.bookimage}" width="223" height="229" /></td>
					<td width="59%" valign="top">
						<table width="100%" border="0" cellpadding="0" cellspacing="0"
							class="word07">
							<tr>
								<td height="33" colspan="2" bgcolor="#F5F5F5" align="center">
									${book.bookname}
								</td>
							</tr>
							<tr align="center">
								<td height="12" colspan="2" align="center" bgcolor="#FFFFFF">&nbsp;
								  	${book.bookname}
								</td>
							</tr>
							<tr>
								<td width="50%" height="30" align="center" bgcolor="#F5F5F5">商品名称:</td>
								<td width="50%" align="left" bgcolor="#F5F5F5" align="left">
									${book.bookname}
								</td>
							</tr>
							<tr align="center">
								<td height="30" align="center">商品编号:</td>
								<td align="center">
									${book.bookid}
								</td>
							</tr>
							<tr align="center">
								<td height="30" align="center" bgcolor="#F5F5F5">市场价:</td>
								<td align="left" bgcolor="#F5F5F5">
									${book.price}
								</td>
							</tr>
							<tr align="center">
								<td height="30" align="center">会员价：</td>
								<td align="left">
									${book.memberprice}
								</td>
							</tr>
							<tr align="center">
								<td height="62" colspan="2" align="center"><a
									href="cart.php?id= <?php echo $id?>"> <img
										src="images/shop_car1.jpg" width="116" height="31" border="0" />
								</a>
							</tr>
						</table>
					</td>
				</tr>
			</table>
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td height="26" align="left" bgcolor="#ffa013">					
						<span class="nbtext12">详细描述</span>
					</td>
				</tr>
			</table>
			<table width="100%" border="0" cellpadding="0" cellspacing="0"
				class="word07">
				<tr>
					<td height="150" valign="top">
						<div class="text12" style='line-height:23px;'>
							${book.discription}
						</div>
					</td>
				</tr>
			</table>
		</td>
	</tr>
</table>
