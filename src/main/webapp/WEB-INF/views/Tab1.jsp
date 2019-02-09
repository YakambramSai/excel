<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Excel Spring Boot Demo</title>
</head>
<body>
 
 
    <h6>Add Employee :</h6>
	<div id="addEmployee">
	 <form:form method="POST" action="/addNewEmployee" modelAttribute="employee">
			<p>
				<label>Enter Employee Id</label>
				<form:input class="form-control" path="empId"  />
			</p>
			<p>
				<label>Enter Name</label>
				<form:input class="form-control" path="empName" />
			</p>
			<form:button type="submit" class="btn btn-info">Submit</form:button>
		</form:form>
	</div>

</body>
</html>