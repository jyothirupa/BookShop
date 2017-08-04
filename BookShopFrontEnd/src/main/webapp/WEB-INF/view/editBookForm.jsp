<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Book</title>
</head>
<body>
	<c:url value="/manage_book_edit" var="url"></c:url>

	<form:form method="post" action="${url}" commandName="editBookObj">
		<table>
			<tr>
				<td><form:label path="id">Book Id</form:label></td>
				<td><form:input path="id" disabled="true" class="form-control" />
					<form:hidden path="id" /></td>
			</tr>
			<tr>
				<td><form:label path="name">Book Name</form:label></td>
				<td><form:input path="name" class="form-control"></form:input></td>
				<td><form:errors path="name" /></td>
			</tr>
			<tr>
				<td><form:label path="description">Book Description</form:label></td>
				<td><form:input path="description" class="form-control"></form:input></td>
				<td><form:errors path="description" /></td>
			</tr>
			
			<tr>
				<td><form:label path="price">Price</form:label></td>
				<td><form:input path="price" class="form-control"></form:input></td>
				<td><form:errors path="price" /></td>
			</tr>
			
			<tr>
				<td><form:label path="author">Author</form:label></td>
				<td><form:input path="author" class="form-control"></form:input></td>
				<td><form:errors path="author" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Edit Book"></td>
			</tr>
		</table>
	</form:form>
	

</body>
</html>