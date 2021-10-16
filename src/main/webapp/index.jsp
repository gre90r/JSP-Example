<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%@ page import="java.util.*" %>  <!-- directive -->
<%@ include file="header.jsp" %>  <!-- render this jsp file into this jsp file -->


<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>jsp demo</title>
</head>
<body>
	<%
		int i = 3;
		System.out.println("hello world");
	%>
	
	<p>
		i is <%= i%> <!-- expression tag -->
	</p>
</body>
</html>