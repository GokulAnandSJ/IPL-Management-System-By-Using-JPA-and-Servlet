package com;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/addPlayer")
public class AddPlayer extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int playerId = Integer.parseInt(req.getParameter("playerId"));
		String playerName = req.getParameter("playerName");
		int playerAge = Integer.parseInt(req.getParameter("playerAge"));
		String playerCountry = req.getParameter("playerCountry");
		String playerTeam = req.getParameter("playerTeam");
		int playerSalary = Integer.parseInt(req.getParameter("playerSalary"));
		int playerJerseyNumber = Integer.parseInt(req.getParameter("playerJerseyNumber"));
		String playerRole = req.getParameter("playerRole");
		
		

		Player play = new Player();

		play.setPlayerId(playerId);
		play.setPlayerName(playerName);
		play.setPlayerAge(playerAge);
		play.setPlayerCountry(playerCountry);
		play.setPlayerTeam(playerTeam);
		play.setPlayerSalary(playerSalary);
		play.setPlayerJerseyNumber(playerJerseyNumber);
		play.setPlayerRole(playerRole);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gokulmysql");
		EntityManager em =emf.createEntityManager();
		EntityTransaction trns =em.getTransaction();

		trns.begin();
		em.persist(play);
		trns.commit();
		em.close();
		
		resp.sendRedirect("index.jsp");
	}
}