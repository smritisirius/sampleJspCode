<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
  <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.5.3/js/bootstrapValidator.js"></script>
</head>

<body>
<h2>Employee Data</h2>

<div class="table-responsive">
<table class="table table-bordered">
  <tbody>
    <tr>
      
      <td>First Name</td>
      <td>${employee.firstname}</td>
    </tr>
     <tr>
      
      <td>Last Name</td>
      <td>${employee.lastname}</td>
    </tr>
     <tr>
      
      <td>User Name</td>
      <td>${employee.username}</td>
    </tr>
     <tr>     
      <td>Email</td>
      <td>${employee.email}</td>
    </tr>
     <tr>
      <td word-wrap:break-word>Phone</td>
      <td>${employee.phone}</td>
    </tr>
     <tr>     
      <td word-wrap:break-word>Country</td>
      <td> ${employee.country}</td>
    </tr>
  </tbody>
</table>	
</div>


</body>

</html>