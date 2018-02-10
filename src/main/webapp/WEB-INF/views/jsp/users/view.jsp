<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
<h2>User Info</h2>

<strong>First Name </strong>: ${employee.firstname} <br>
<strong>Last Name </strong> : ${employee.lastname}<br>
<strong>user Name </strong> : ${employee.username}<br>
<strong>Password </strong> : ${employee.password}<br>
<strong>email </strong> : ${employee.email}<br>
<strong>phone </strong> : ${employee.phone}<br>
<strong>Employee </strong> : <c:forEach var="val" items="${employee.country}">
 <c:out value="${val}"></c:out>
 </c:forEach><br>
<strong>Country </strong>: ${employee.country} <br> 

	
</body>

</html>