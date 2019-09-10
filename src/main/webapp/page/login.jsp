<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE>
<TITLE></TITLE>
<head>
  <script language="JavaScript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
  <script language="JavaScript">
      $.ajaxSetup({
          async: false
      });

    $(function () {

        $("#sendButton").click(function () {
             /* tel:是手机号的name  $().val()则是直接把输入框里面的值直接取出来*/
            $.post("getCode",{"mobile":$("#inputTel").val(),"code":$("#inputValue").val()},function (data) {
                if (data.result>0){
                    alert("请查看手机短信，输入你的验证码")
                } else {
                    alert("短信发送失败，请你稍后再试")
                }
            },"json");
        });
    });

  </script>
</head>

<BODY>


<H4>用户登录</H4>
<FORM id=user method=post name=user action="${pageContext.request.contextPath}/page/getCode">
<DIV class=infos>

<TABLE class=field>
  <TBODY>
  <TR>
    <TD colSpan=2> </TD></TR>
  <TR>
    <TD class=field>用 户 名：</TD>
    <TD><!-- <input type="text" class="text" name="name" /> -->
      <INPUT
      id=user_name class=text type=text name="username"> </TD></TR>
  <TR>
    <TD class=field>密　　码：</TD>
    <TD><!-- <input type="password" class="text" name="password" /> -->
      <INPUT
      id=user_password class=text type=password name="password"> </TD></TR>
						<tr>
							<td class="field">手 机 号：</td>
							<td><input  type="text"  name="mobile" id="inputTel" />
                              <input type="button" id="sendButton"   value="获取验证码"/>
                                <input type="text" name="code" id="inputValue">
                            </td>
						</tr>
						</TBODY></TABLE>
<DIV class=buttons>
  <p><INPUT  value=登陆 type=submit></p>
  <%--<INPUT onclick='document.location="regs.jsp"' value=注册 type=button>--%>
</DIV>

</DIV></FORM>

</BODY>


