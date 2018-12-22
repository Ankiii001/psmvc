<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><spring:message code="lbl.title"></spring:message></title>
</head>
<body>
	<h2>PS: Bank Account Details</h2>
<%-- 	<p>Account # : ${param.accountNo}</p>
	<p>Account Holder Name : ${param.accountHolderName}</p>
	<p>Balance : ${param.balance}</p> --%>
	
	<p><spring:message code="lbl.accountNo"></spring:message> : ${account.accountNo}</p>
	<p><spring:message code="lbl.accountHolderName"></spring:message> : ${account.accountHolderName}</p>
	<p><spring:message code="lbl.balance"></spring:message> : ${account.balance}</p>
</body>
</html>