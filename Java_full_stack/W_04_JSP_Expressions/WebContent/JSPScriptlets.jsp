<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP scriptlets</title>
</head>
<body>
<h1>This Web page shows example of JSP scriptlets element</h1>
<%-- Here we are discuss about JSP scriptlet element
	So scriptlets in JSP are enclosed inside the tag followed by the % sign and closed by again % sign followed by closing tag
	
	In between tags of scriptlet we can write Java code fragments, and these could be complete java program or partial code.
	Lets try to write small java code fragment in it --%>
	
<% 
int x = 10;
out.println(x);
%>
<br/>

<%-- Also note that the variable we have defined in the java code fragment in the above scriptlet tag, will also be available later outside
	that tag as well. for example, we have defined x inside above scriptlet tags, its not just we can use it there, we could also use that
	down the line again. See the example below --%>

<%= x %>
<%-- So above expression element will be able to print the value of x again without any issue --%>
<br/>
<%-- We can even write the conditions inside the scriptlets as below --%>
<%
int y =20;
			if(y>10){
				out.println("y is greater than 10");
			}
			else{
				out.println("y is less than 10");
			}
%>
<%-- Lets also see how we can apply for loop inside this --%>
<% 
for(int i =0; i<=10; i++){
	out.print("<br/>");
	out.print(i);
}
%>
<%-- So in above tag if you notice, we are using br tag inside the print statement. The reason behind this is that inside JSP and servlets
	there is no role of println() method that means it does not add a new line to the output. So in JSP and servlets println and print methods
	are same. --%>
</body>
</html>