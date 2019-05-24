<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!-- 引入Struts2标签库 -->
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>首页</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<s:form action="login" method="post">
		<table>
			<caption>
				<h3>用户登录</h3>
			</caption>
			<tr>
				<td><s:textfield name="user.username" label="用户名" /></td>
			</tr>
			<tr>
				<td><s:textfield name="user.password" label="密码" /></td>
			</tr>
			<s:submit value="登录" />
			<s:reset value="重填" />
		</table>
	</s:form>
</body>
</html>