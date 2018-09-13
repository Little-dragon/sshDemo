<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>会员登陆</title>
</head>
<body>
		<s:form action="login" method="post">
			<s:textfield name="member.username" label="会员姓名"></s:textfield>
			<s:password name="member.password" label="会员口令"></s:password>
			<s:submit value="提交"></s:submit>
		</s:form>
</body>
</html>