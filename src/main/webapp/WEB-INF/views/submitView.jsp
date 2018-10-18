<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
<thead>
<tr>
	<th>Complete</th><th>Description</th><th>Due Date</th>
</tr>
</thead>

<tbody>

<c:forEach items ="${task }" var = "item" >

<tr>
	<td>${item.description }</td> 
	<td>${item.complete } </td>
	<td> <input type ="checkbox" value = "true" ${task.iscomplete ? 'checked' : ' '}> </td> 
	<td> <a href = "/delete">Delete</a></td>
	
</tr>
</c:forEach>
</table>

</body>
</html>