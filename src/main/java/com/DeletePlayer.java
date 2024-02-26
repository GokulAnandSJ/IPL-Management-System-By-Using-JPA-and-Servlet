package com;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.query.Query;

@WebServlet("/deletePlayerList")
public class DeletePlayer extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int playerId = Integer.parseInt(req.getParameter("playerId"));
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gokulmysql");
		EntityManager em = emf.createEntityManager();
		EntityTransaction trns = em.getTransaction();
		trns.begin();
		
		Player play = em.find(Player.class, playerId);
		em.remove(play);
		
		Query query = (Query) em.createQuery("From Player");
		List<Player> players =  query.getResultList();
	
		trns.commit();
		em.close();
		
		req.setAttribute("playerList", players);
		RequestDispatcher rd =req.getRequestDispatcher("displayPlayers.jsp");
		rd.forward(req, resp);
	}
}
