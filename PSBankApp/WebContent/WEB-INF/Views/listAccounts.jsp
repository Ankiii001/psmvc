<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PS Bank Account Holder Details</title>
</head>
<body>
	<table border="1" width="100%">
	<thead>
		<tr>
				<th>Account No</th>
				<th>Account Holder Name</th>
				<th>Account type</th>
				<th>Balance</th>
				<th> &nbsp; </th>
				<th> &nbsp; </th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="account" items="${accounts}">
			<c:url var="updateLink" value ="/edit">
			<c:param name="accountNo" value = "${account.accountNo}"/>
			</c:url>
			
			<c:url var="deleteLink" value ="/delete">
			<c:param name="accountNo" value = "${account.accountNo}"/>
			</c:url>
			
			
			<tr>
				<th>${account.accountNo}</th>
				<th>${account.accountHolderName}</th>
				<th>${account.accountType}</th>
				<th>${account.balance}</th>
				<th><a href="${updateLink}">Edit</a></th>
				<th><a href="${deleteLink}"
				onClick="if(!(confirm('Are you sure to delete'))) return false">
				Delete</a></th>
			</tr>
		</c:forEach>
	</tbody>
	
	</table>
	
	<a href="newaccount">Create New Account</a>
</body>
</html>