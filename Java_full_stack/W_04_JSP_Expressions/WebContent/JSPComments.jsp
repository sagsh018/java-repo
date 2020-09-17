<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP comments</title>
</head>
<body>
<h1>This web page will show examples for JSP comments element</h1>
<%-- So here we are going to take a look at the comment element of JSP
	1) So we have already seen that we can have normal java comments inside the scriptlets. see the example below --%>
<% 
	int a = 10;
	// out.print("Testing text");
	out.print("Value of X : " + a);
%>
<%-- So we can crealy see that we have used a normal single line comment from java inside the scriptlet in JSP. similarly we could also make
	use of multi line comments.
	But the issue here is that we could only make use of java comments inside JSP scriptlets elements. This is not possible in any other 
	JSP elements. --%>
	
<%-- Now that we have see the use of java comments is limited in JSP, we also have another type of comments available here in JSP which is
	HTML comments, since JSP is have all the functionality of HTML available. See the below example, where we can enclose the entire elements
	of JSP inside the HTML comment --%>

<!-- 
<%
	int y = 20;
	out.print(y);
%>
 -->
 
<%-- So as we can see that the above scriptlet is enclosed inside the HTML comments, so the print statement will not print the value on the web
	page. but these HTML comments are not reliable, because these comments can only comment the printing statements, if we call some methods
	then these comments will not be able to prevent it from executing. See the below example, whee we are redirecting the URL request made
	to this JSP to google.com  --%>

 <!--  
	<% response.sendRedirect("http://google.com"); %>
-->

<%-- So we can see even though the above scriptlet is enclosed inside the HTML comment, then also it will not be able to prevent the page
	to redirect to google.com
	So to solve this problem, we should always rely on JSP commants when using JSP.  --%>
	
<%--
	<% response.sendRedirect("http://facebook.com"); %>
	Notice that this above scriptlet enclosed inside the JSP commets has not effect and will not execute at all.
 --%>

</body>
</html>