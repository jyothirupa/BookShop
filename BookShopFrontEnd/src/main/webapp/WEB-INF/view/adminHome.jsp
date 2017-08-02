<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<p>This is the Admin home page</p>

	<a href="manage_categories">Category</a><br/><br/>
	<a href="manage_products">Book</a><br/><br/>
	<a href="manage_suppliers">Supplier</a>



	<c:if test="${isUserClickedCategories==true}">
		<jsp:include page="category.jsp" />
	</c:if>

	<c:if test="${isUserClickedProducts==true}">
		<jsp:include page="book.jsp" />
	</c:if>
	<c:if test="${isUserClickedSuppliers==true}">
		<jsp:include page="supplier.jsp" />
	</c:if>





</body>
</html>