<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PS Bank Application</title>
</head>
<body>
	<h2>PS: Bank Account Details</h2>
	<p>Account # : ${account.accountNo}</p>
	<p>Account Holder Name : ${account.accountHolderName}</p>
	<p>Account type : : ${account.accountType}</p>
	<p>Balance : ${account.balance}</p>
	<p>PS Code : ${account.psCode}</p>
	<p>Date Of Birth : ${account.dateOfBirth}</p>

</body>
</html>