<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <h1>Registration Form</h1>
     
     <form action="userDetail">
     
     User Name : <input id="UName" name="UName"/><br>
     Email ID :<input id="EmailId" name="EmailId"/><br>
     Password : <input type="Password" id="Password" name="Password"/><br>
     Gender : <input type="radio" name="Gender" value="1" checked=true/> Male
     <input type="radio" name="Gender" value="2"/> Female<br>
     <br>
     <input type="checkbox" name="hobby" value="Dancing"> Dancing 
     <input name="hobby" type="checkbox" value="Singing"> Singing<br>
     
     <input type="submit" value="Register Now"/>      
     
     </form>
</body>
</html>