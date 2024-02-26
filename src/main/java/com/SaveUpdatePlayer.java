package com;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/saveUpdatePlayer")
public class SaveUpdatePlayer extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int playerId = Integer.parseInt(req.getParameter("playerId"));
		String playerName = req.getParameter("playerName");
		int playerAge = Integer.parseInt(req.getParameter("playerAge"));
		String playerCountry = req.getParameter("playerCountry");
		String playerTeam = req.getParameter("playerTeam");
		int playerSalary = Integer.parseInt(req.getParameter("playerSalary"));
		int playerJersyNumber = Integer.parseInt(req.getParameter("playerJersyNumber"));
		String playerRole = req.getParameter("playerRole");

		Player play = new Player();
		play.setPlayerId(playerId);
		play.setPlayerName(playerName);
		play.setPlayerAge(playerAge);
		play.setPlayerCountry(playerCountry);
		play.setPlayerTeam(playerTeam);
		play.setPlayerSalary(playerSalary);
		play.setPlayerJerseyNumber(playerJersyNumber);
		play.setPlayerRole(playerRole);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gokulmysql");
		EntityManager em = emf.createEntityManager();
		EntityTransaction trns = em.getTransaction();
		trns.begin();

		em.merge(play);

		Query query = em.createQuery("FROM Player");
		List<Player> players =  query.getResultList();

		trns.commit();
		em.close();

		req.setAttribute("playerList", players);
		RequestDispatcher rd =req.getRequestDispatcher("displayPlayers.jsp");
		rd.forward(req, resp);


	}
}
