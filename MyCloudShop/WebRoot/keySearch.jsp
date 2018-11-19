<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<form action="keySearch" id="keySearchForm" >
	<table width="217"   align="center" class="border font2 drbk1"  height="20%">  
		<tr>
            <td valign="top">
               <img src="images/search.png" width="290"/>
             </td>
         </tr>
								 
		<tr>
			<td width="38%" height="36" align="right" valign="middle" class="font2">
			     书名关键字： 
			    <input name="keyWord" type="text" class="hui12" id="keyword" size="16" />
			  </span>
			</td>
		</tr>
		<tr>
		 <td height="48" colspan="2" align="center" class="zhongtext12">
		     <img src="images/an_qd.png" onclick="searchBooksByKeyWord()">
		    &nbsp;</td>
		 </tr> 					
	</table>
</form>