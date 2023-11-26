<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    
    <h1>************** User Details ***************</h1>
    <br>
    <br>
    User Name :  ${regObj.name} <br>
    User Email :  ${regObj.email}<br>
    Gender :  ${regObj.gender}<br>
    Hobbies :  ${regObj.hobbies[0]}, ${regObj.hobbies[1]}
    
    
    
    
</body>
</html>