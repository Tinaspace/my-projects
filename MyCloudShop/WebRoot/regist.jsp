<%@ page pageEncoding="utf-8"%>

 <table width="100%" align="center" height="100%" class="drbk1">
      <tr>
        <td height="30" align="center" bgcolor="#ffa013" class="font2">会员注册</td>
      </tr>
      <tr>
        <td height="340" valign="middle" align="center" >
        <form action="saveMember" method="post" id="registForm">
          <table width="500" border="0"   align="center" >
          <tr>
            <td height="30" class="font1" align="right">用户名:</td>
            <td align="center">
            <input name="nickname" type="text" class="input1" id="textfield3"  width="300"/></td>
          </tr>
          <tr>
            <td height="30" class="font1" align="right">密 码:</td>
            <td align="center">
            <input name="memberpwd" type="text" class="input1" id="textfield5"  width="300"/></td>
          </tr>
          <tr>
            <td height="30" class="font1" align="right">姓 名:</td>
            <td align="center">
            <input name="membername" type="text" class="input1" id="textfield6"  width="300"/></td>
          </tr>
          <tr>
            <td height="30" class="font1" align="right">性 别:</td>
            <td align="center" align="center">
               <table width="120" >
              <tr>
                <td width="30" align="left">
                <input type="radio" name="membergender" id="radio" value="男" />
                </td>
                <td align="left">男</td>
                <td width="30" align="left">
                <input type="radio" name="membergender" id="radio2" value="女" /></td>
                <td align="left">女</td>
              </tr>
            </table></td>
          </tr>
          <tr>
            <td height="30" class="font1" align="right">电 话:</td>
            <td align="center"><input name="membertel" type="text" class="input1" id="textfield8" width="300" /></td>
          </tr>
          <tr>
            <td height="30" class="font1" align="right">邮 箱:</td>
            <td align="center">
              <input name="memberemail" type="text" class="input1" id="textfield4"  width="300"/>
              </td>
          </tr>
          <tr>
            <td height="44">&nbsp;</td>
            <td valign="bottom" align="center"> 
                 <img src="images/an_qd.png" width="80" height="30" onclick="dopost()" /> 
                 <img src="images/an_qx.png" width="80" height="30" onclick="doCancel()"/> 
                 
            </td>
          </tr>
        </table>
        </form>
        </td>
      </tr>
    </table>