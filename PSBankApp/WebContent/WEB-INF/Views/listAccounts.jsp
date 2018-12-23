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
		</tr>
	</thead>
	<tbody>
		<c:forEach var="account" items="${accounts}">
			<tr>
				<th>${account.accountNo}</th>
				<th>${account.accountHolderName}</th>
				<th>${account.accountType}</th>
				<th>${account.balance}</th>
			</tr>
		</c:forEach>
	</tbody>
	
	</table>
	
	<a href="newaccount">Create New Account</a>
</body>
</html>