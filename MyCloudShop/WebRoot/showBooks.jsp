<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page pageEncoding="utf-8"%>
 <table width="100%" align="center" valign="top"   class="drbk1">
      <tr>           
             <td height="30" align="center"  bgcolor="#ffa013" class="font2">
                          图书列表展示
             </td>  
      </tr>
 </table>
 <table width="100%" align="center"   >
 <c:forEach items="${books}" var="product" varStatus="vs">
   <c:if test="${vs.index%4==0}">
    <tr>
      <td   align="center">
              <table width="90%" border="0" cellspacing="0" cellpadding="0"> 					
					<tr>
					  <td height="144" colspan="5" align="center" valign="middle">
					   <a href="showDetail?id=${product.bookid}">
						 <img src="upload/${product.bookimage}" width="133" height="141" border="0">
						</a>
					  </td>
					</tr>
					<tr>
					  <td height="22" align="center" colspan="5" class="stext12">
					   ${product.bookname}</td>
					</tr>
					<tr>
						<td width="52%" height="22" align="right" valign="middle"class="stext12">定 价:</td>
						<td width="48%" height="22" align="left" valign="middle" class="redtext12">
												${product.price}
												 </td>
					</tr>
					<tr>
						<td height="32" align="center" colspan="5" valign="middle">
						  <a href="cart.php?id= <?php echo $arryid[$t]?>">
						    <img src="images/shop_car.jpg" width="116" height="32" border="0" class="img" border="0">
						</a>
					</td> 								
				</tr>
				</table>
			  </td>
 </c:if>
 <c:if test="${vs.index%4!=0}">
    <td   align="center">
              <table width="90%" border="0" cellspacing="0" cellpadding="0"> 					
					<tr>
					  <td height="144" colspan="5" align="center" valign="middle">
					   <a href="showDetail?id=${product.bookid}">
						 <img src="upload/${product.bookimage}" width="133" height="141" border="0">
						</a>
					  </td>
					</tr>
					<tr>
					  <td height="22" align="center" colspan="5" class="stext12">
					   ${product.bookname}</td>
					</tr>
					<tr>
						<td width="52%" height="22" align="right" valign="middle"class="stext12">定 价:</td>
						<td width="48%" height="22" align="left" valign="middle" class="redtext12">
												${product.price}
												 </td>
					</tr>
					<tr>
						<td height="32" align="center" colspan="5" valign="middle">
						  <a href="#">
						    <img src="images/shop_car.jpg" width="116" height="32" border="0" class="img" border="0">
						</a>
					</td> 								
				</tr>
				</table>
			  </td>
 </c:if>
 </c:forEach> 	 
 </table>