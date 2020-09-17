<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Expressions</title>
</head>
<body>
<h1>This page shows example of JSP Expression element</h1>
<%-- So this is a comment
	Here we will try to make use of the JSP expression elements
	So lets first start with the declarative element --%>

<%! int x = 22; %>
<%-- Now for above declarative element, we can display the x using expression element --%>
<%= x %>
<br/>
<%-- Now lets try to execute this first against the tomcat server and we will be able to print the value of x on web page --%>
<%-- Now we can also do the above step of declaring and printing the expression in one step as below --%>
<%= new Integer(22) %> 
<br>
<%-- Notice here we will have to give wrapper class instead of primitive data type --%>
<%-- Same is true for the String class as well --%>
<%= new String("Sagar") %>
<br>
<%-- We can also call in the Date class from java.utils as below --%>
<%= new java.util.Date() %>
<br/>
<%-- Now we could also give the expressions in the JSP expression elements and we will get the direct result on the web page, see example 
below --%>
<%= 25*4 %>
<br/>
<%-- We can even give the boolean expressions in the expression element and get the true or false value on the basis of evaluation --%>
<%= 25>4 %>
<br/>
<%-- So in the below cases we can make use of epression element
	a) when we have to execute and evaluate a simple one line expression
	b) Whenever we want to call a method of some class
	c) To display the value of a variable it can be used
	All three use cases we have seen above --%>
</body>
</html>