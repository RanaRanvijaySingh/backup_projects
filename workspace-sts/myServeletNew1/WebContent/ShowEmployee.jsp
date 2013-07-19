<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="EmployeeServlet" method="post">
<fieldset>

<legend>Enter the Details of the Employee </legend>

<div>
	<label for="id">ID:</label><br>
	<input type="text" name="id" value="1" /><br>
</div>

<div>
	<label for="Name">Name:</label><br>
	<input type="text" name="name" value="rana" maxlength="100" /><br>
</div>

<div>
	<label for="Age">Age:</label><br>
	<input type="text" name="age" value="23" /><br>
</div>

<div>
	<label for="Dob">DOB:</label><br>
	<input type="text" name="dob" value="1989-11-05" /><br>
</div>

<div>
	<label for="Dept_id">Department ID:</label><br>
	<input type="text" name="dept_id" value="2" /><br>
</div>


<div>
	<input type="submit" value="Submit" />
</div>

</fieldset>
</form>
</body>
</html>