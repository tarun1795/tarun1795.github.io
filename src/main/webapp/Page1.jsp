<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter Credentials to validate</h1>
<form action="/servletAssignment1/validate" method="POST">
	<label>Email ID: <input type="text" name="email"/></label><br/><br/>
	<label>Password: <input type="password" name="pass"/></label><br/>
	<input type="submit">
</form>
</body>
</html>