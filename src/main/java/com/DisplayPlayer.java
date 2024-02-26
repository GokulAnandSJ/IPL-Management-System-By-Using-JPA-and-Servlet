package com;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/displayPlayerList")
public class DisplayPlayer extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gokulmysql");
		EntityManager em = emf.createEntityManager();
		EntityTransaction trns = em.getTransaction();
		trns.begin();

		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Player> cq = cb.createQuery(Player.class);
		Root<Player> root = cq.from(Player.class);
		cq.select(root);

		TypedQuery<Player> qure = em.createQuery(cq);
		List<Player> players = qure.getResultList();


		trns.commit();
		em.close();


		req.setAttribute("playerList", players);
		RequestDispatcher rd = req.getRequestDispatcher("displayPlayers.jsp");
		rd.forward(req, resp);


	}
}
