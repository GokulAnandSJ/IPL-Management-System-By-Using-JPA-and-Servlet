<%@page import="com.Player"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Cricket Players List</h2>
	<%
	List<Player> players = (List) request.getAttribute("playerList");
	%>
 <table border="">
	<tr>
	
		<th>PlayerId</th>
		<th>Player Name</th>
		<th>PlayerTearm</th>
		<th>Player Country</th>
		<th>Player Age</th>
		<th>Player Salary</th>
		<th>Player JersyNumber</th>
		<th>Player Role</th>
		<th>UpdatePlayer</th>
		<th>DeletePlayer</th>

	</tr>

	<%for(Player play : players){ %>

	<tr>
		<td><%=play.getPlayerId() %></td>
		<td><%=play.getPlayerName() %></td>
		<td><%=play.getPlayerTeam() %></td>
		<td><%=play.getPlayerCountry()%></td>
		<td><%=play.getPlayerAge() %></td>
		<td><%=play.getPlayerSalary() %></td>
		<td><%=play.getPlayerJerseyNumber() %></td>
		<td><%=play.getPlayerRole() %></td>
		<td><a href="updatePlayerList?playerId=<%=play.getPlayerId()%>">UPDATE</a></td>
		<td><a href="deletePlayerList?playerId=<%=play.getPlayerId()%>">DELETE</a></td>

	</tr>
	<%} %>

</table>

	<h2><a href="index.jsp">Go Back To Player DashBoard</a></h2>

</body>
</html>