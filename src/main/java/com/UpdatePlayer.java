package com;

import java.io.IOException;

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
@WebServlet("/updatePlayerList")
public class UpdatePlayer extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int playerId = Integer.parseInt(req.getParameter("playerId"));
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gokulmysql");
		EntityManager em = emf.createEntityManager();
		EntityTransaction trns = em.getTransaction();
		trns.begin();
		Player play = em.find(Player.class,playerId);
		
		req.setAttribute("UpdateThePlayer", play);
		RequestDispatcher rd = req.getRequestDispatcher("UpdatePlayer.jsp");
		rd.forward(req, resp);
		
		trns.commit();
		em.close();
	
	
	
	}
}
