<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link type="text/css" rel="stylesheet"
	href="http://cdn.dcodes.net/2/tables1/css/dc_tables1.css" />
</head>
<body>

	<center><h2>Manage Book</h2></center>

		<a href="manage_book_create" class="btn btn-primary" role="button">Add Book</a>

		<table class="dc_table_s3" summary="Sample Table" style="width: 80%;">

			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Name</th>
					<th scope="col">Description</th>
					<th scope="col">Price</th>
					<th scope="col">Author</th>
					<th scope="col">Action</th>
				</tr>
			</thead>

			<c:forEach var="book" items="${bookList}">
				<tr>
					<td align="center">${book.id}</td>
					<td align="center">${book.name}</td>
					<td align="center">${book.description}</td>
					<td align="center">${book.price}</td>
					<td align="center">${book.author}</td>

					<td align="center"><a
						href="<c:url value="manage_book_edit/${book.id}"/>">Edit
							<span class="glyphicon glyphicon-edit"></span>
					</a>| <a href="<c:url value="manage_book_delete/${book.id}"/>">
							<span class="glyphicon glyphicon-trash"></span>delete
					</a></td>

				</tr>
			</c:forEach>

		</table>
</body>
</html>
