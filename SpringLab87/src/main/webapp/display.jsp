<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<%@ page isELIgnored="false"%>
<style >
.error{color:red}
</style>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>
<body>
<h1 align="center">
		<c:out value="${MSG} "></c:out>
	</h1>
<c:if test="${CLIST ne null}">

		<hr />
		<table align="center" width="40%">
			<tr>
				<th>Contact Id</th>
				<th>Contact Name</th>
				<th>Contact Email</th>
				<th>Contact Phone</th>
				<th>Update</th>
				<th>Delete</th>
				
			</tr>
				
			<c:forEach items="${CLIST}" var="cto">
				<tr>
					<td>${cto.contactId}</td>
					<td>${cto.contactName}</td>
					<td>${cto.contactEmail}</td>
					<td>${cto.contactPhone}</td>
				  
				
					<!-- construct an "update" link with customer id -->
					<c:url var="updateLink" value="/showFormForUpdate.jlc">
						<c:param name="contactId" value="${cto.contactId}" />
					</c:url>
					
						<td><!-- display the update link -->
							<a href="${updateLink}">Update</a>
							</td>
											
					<!-- construct an "delete" link with customer id -->
					<c:url var="deleteLink" value="/delete.jlc">
						<c:param name="contactId" value="${cto.contactId}" />
					</c:url>
					
							<td><a href="${deleteLink}"
							   onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
					</td>
					   
				
			</c:forEach>
			
			
		</table>
	</c:if>
</body>
</html>