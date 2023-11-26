<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script src="jquery-3.5.1.min.js"></script>

<script>
var data;
     $(document).ready(function(){
    	$('#btnClick').click(function(){
    		$.ajax({
    			url:"/getUserByID/"+$('#uid').val(),
    			type:"POST",
    			contentType:"application/json",
    			dataType:"json",
    			success:function(r){
    				data=r;
    				alert(r)
    			}
    		})

    	})
     })
</script>


</head>
<body>
     <h1>Operation Form</h1>
     
     <form>
     User by ID: <input id="uid" name="UId" /><br>
     <select name="ddlFlag">
     <option value="select">Select Records</option>
     <option value="delete">Delete Records</option>
     <option value="update">Update Records</option>
     <option value="custom">Custom Records</option>
     
     </select>
     <br>
     
    
     
     <input id="btnClick" type="button" value="Click Now"/>      
     
     </form>
</body>
</html>