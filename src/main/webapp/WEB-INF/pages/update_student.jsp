<%@page import="com.nareshit.model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
<% Student st = (Student)request.getAttribute("st"); %>
	<div class="container mt-3">
	<h1>Update Student</h1>
		
		<form action="updateStudent" method="post">
			<input type="hidden" value="<%=st.getStid()%>" name="stu_id" />
			<div class="form-floating mb-3">
				<input type="text" value="<%=st.getFirstName()%>"
					class="form-control" name="first_name" id="floatingFirstName"
					placeholder="First Name"> <label for="floatingFirstName">First
					Name</label>
			</div>
			<div class="form-floating">
				<input type="text" value="<%=st.getLastName()%>" name="last_name"
					class="form-control" id="floatingLastName" placeholder="Password">
				<label for="floatingLastName">Last Name</label>
			</div>
			<br />
			<div class="form-floating">
				<input type="submit" class="btn btn-success"
					value="Update Student" /> <a class="btn btn-outline-dark"
					href="getAllStudents">Cancel</a>
			</div>
		</form>
	</div>
</body>
</html>