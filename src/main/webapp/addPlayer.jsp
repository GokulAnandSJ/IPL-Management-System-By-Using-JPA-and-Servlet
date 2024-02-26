<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


 <h1>Add The Player Details</h1>
 
<form action="addPlayer" method="post">

<input type="number" placeholder="Enter Player Id" name="playerId"><br>
<br>
<input type="text" placeholder="Enter Player Name" name="playerName"><br>
<br>
<input type="number" placeholder="Enter Player Age" name="playerAge"><br>
<br>
<input type="text" placeholder="Enter Player Country" name="playerCountry"><br>
<br>
<input type="text" placeholder="Enter Player Team" name="playerTeam"><br>
<br>
<input type="number" placeholder="Enter Player Salary" name="playerSalary"><br>
<br>
<input type="number" placeholder="Enter Player JerseyNumber" name="playerJerseyNumber"><br>
<br>
<input type="text" placeholder="Enter Player Role" name="playerRole"><br>
<br>

<input type="submit" value="Add">




</form>
</body>
</html>