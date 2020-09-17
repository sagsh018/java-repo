<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Declarations</title>
</head>
<body>
<h1>This Web page is going to show examples of Declarative JSP elements</h1>
<%-- The work which we will try to do with declarative,we have already donw with the help of expression element and scriptlet element
	but with the help of declarative element we will be able to do one that that is not possible with other elements which we have studied
	which is specifying the access modifier. we cannot specify the access modifier in expression and scriplet elements
 --%>
 <%! public int p =10; %>
 <%= p %>
 
<br/>
 
 <%-- Even more important difference is that inside declarative we can declare methods, which is not possible in scriptlets
 		So whenever we have to declare the methods, we make use of declarative
  --%>
<%!
public String someFunc(){
	return "Hello This is JSP";
}
%>

<%-- Now we can just simply call this method inside expression element of JSP as below --%>
<%= someFunc() %>
</body>
</html>