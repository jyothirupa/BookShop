<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration page</title>
</head>

<body>
	<center>Registration page</center>


	<form:form action="register" method="post" commandName="user">

		<table>
			<tr>
				<td><form:label path="id">User Id</form:label></td>
				<td><form:input path="id" disabled="true" /></td>
				<td><form:hidden path="id" /></td>
			</tr>
			<tr>
				<td><form:label path="username">User Name</form:label></td>
				<td><form:input path="username" /></td>
				<td><form:errors path="username" /></td>

			</tr>
			<tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:input path="password" /></td>
				<td><form:errors path="password" /></td>

			</tr>
			
			<tr>
				<td colspan="2"><input type="submit" value="Register"
					class="btn btn-default"></td>
			</tr>

		</table>

	</form:form>

</body>
</html>