<html>
<body>
<h2>Game statistics application</h2>
<%@ page import="
	java.util.List,
    nl.bocko.games.businessobjects.Game,
	nl.bocko.games.model.GameModel"
%>
<%
	GameModel model = new GameModel();
	String[] playerList = model.findAvailablePlayers();

	String selectedPlayer = request.getParameter("player");
	List<Game> gameList = model.findGamesByPlayer(selectedPlayer);
%>

   <h3>Choose a player to find played matches</h3>
   <form action="index.jsp" method="get">
	  Please choose a player:
      <SELECT name="player">
         <OPTION value="">---Any player---</OPTION>
      	<%
      	for(String playerName : playerList){ 
      	%>
      	 <OPTION value="<%=playerName%>"><%=playerName%></OPTION>
      	<%
      	}
      	%>
      </SELECT>
      <BUTTON type="submit">GO</BUTTON>
   </form>
   <% if (gameList.size() > 0) { %>
	   <h3>Available games played by <%=selectedPlayer%> </h3>
	   <table border="1">
	        <tr>
	          <th>GameId</th>
	          <th>Player1</th>
	          <th>Player2</th>
	          <th>Player1 score</th>
	          <th>Player2 score</th>
	      	</tr>
	      <%
	      for(Game game : gameList){
	      %>
	        <tr>
	          <td><%=game.getGameId()%></td>
	          <td><%=game.getPlayer1()%></td>
	          <td><%=game.getPlayer2()%></td>
	          <td><%=game.getPlayer1Score()%> points</td>
	          <td><%=game.getPlayer2Score()%> points</td>
	      	</tr>
	      <%
	      }
	      %>
	    </table>
	 <%}%>
</body>
</html>
