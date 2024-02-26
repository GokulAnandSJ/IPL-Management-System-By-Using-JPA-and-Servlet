<%@page import="com.Player"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% Player players = (Player)request.getAttribute("UpdateThePlayer"); %>

<h1>Update Player Detail</h1>

<form action="saveUpdatePlayer" method="post">

<input type="number"  name="playerId" value="<%=players.getPlayerId()%>" readonly="true"><br>
<br>
<input type="text"  name="playerName" value="<%=players.getPlayerName()%>"> <br>
<br>
<input type="number"  name="playerAge" value="<%=players.getPlayerAge()%>"> <br>
<br>
<input type="text"  name="playerCountry" value="<%=players.getPlayerCountry()%>"> <br>
<br>
<input type="text"  name="playerTeam" value="<%=players.getPlayerTeam()%>"> <br>
<br>
<input type="number"  name="playerSalary" value="<%=players.getPlayerSalary()%>"> <br>
<br>
<input type="number"  name="playerJersyNumber" value="<%=players.getPlayerJerseyNumber()%>"><br>
<br>
<input type="text"  name="playerRole" value="<%=players.getPlayerRole()%>"> <br>
<br>
<input type="submit" value="Update">




</form>
</body>
</html>