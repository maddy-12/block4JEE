package controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Hero;
import model.HeroRepository;
import model.IncidentTypeRepository;

/**
 * Servlet implementation class ServletHeroList
 */
@WebServlet("/ServletHeroList")
public class ServletHeroList extends HttpServlet {
	private HeroRepository heroRepository;
	private IncidentTypeRepository incidentTypeRepository;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletHeroList() {
    	heroRepository = new HeroRepository();
        incidentTypeRepository = new IncidentTypeRepository();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doGet");
		String urlView = "displayHero.jsp";
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		String urlView = "/views/displayHero.jsp";		
		
		
		List<Hero> heroes = heroRepository.findAll();
		request.setAttribute("heroes", heroes);
		request.getRequestDispatcher(urlView).forward(request, response);
	}
}
