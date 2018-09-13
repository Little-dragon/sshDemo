<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改会员信息</title>
</head>
<body>
	<s:form action="update" method="post">
		<h4>
			修改会员信息
		</h4>
		<s:actionerror />

		<s:hidden name="member.id" value="%{member.id}"></s:hidden>
		<s:textfield name="member.username" label="会员姓名" required="true"></s:textfield>
		<s:textfield name="member.password" label="会员口令"></s:textfield>
		<s:textfield name="member.address" label="会员地址"></s:textfield>
		<s:textfield name="member.email" label="会员邮箱"></s:textfield>
		<s:textfield name="member.level" label="会员级别"></s:textfield>
		<s:submit value="提交" />
	</s:form>
</body>
</html>