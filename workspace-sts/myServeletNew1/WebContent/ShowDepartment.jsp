<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="DepartmentServlet" method="post">
<fieldset>

<legend>Enter the Detail of the Department </legend>


<div>
	<label for="id">ID:</label><br>
	<input type="text" name="id" value="" /><br>
</div>

<div>
	<label for="Name">Name:</label><br>
	<input type="text" name="name" value="" maxlength="100" /><br>
</div>

<div>
	<input type="submit" value="Submit" />
</div>

</fieldset>
</form>
</body>
</html>