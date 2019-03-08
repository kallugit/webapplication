<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type="textjavascript">
	
	function changeText(){
	var elementRef = document.getElementById("header1");
	elementRef.innerHTML= " u clicked Button";

}
</script>
</head>
<body>

	<h2 align= "center" id =header1"> Testing Java script</h2>
	
	<button onclick="changeText()">Click Me</button>
</body>
</html>