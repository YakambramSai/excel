<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Getting Started: Handling Form Submission</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<h3>Employee Details:</h3>
 <table class="table table-striped">
   <tr>
      <th>Id:</th>
   
      <th>Name:</th>
    </tr>
    <c:forEach items="${employees}" var="employee">
       <tr>
           <td><c:out value="${employee.empId}"/></td>
          
           <td><c:out value="${employee.empName}"/></td>
        </tr>
    </c:forEach>
 </table>
  
</body>
</html>