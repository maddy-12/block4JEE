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
import model.IncidentRepository;

@WebServlet("/registerHero")
public class ServletHero extends HttpServlet {
	private HeroRepository heroRepository;
	private IncidentRepository incidentRepository;
	

    public ServletHero() {
        heroRepository = new HeroRepository();
        incidentRepository = new IncidentRepository();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("page", "formAddHero");
		
		//request.setAttribute("typeIncidents", typeIncidents);
		System.out.println("doGet");
		String urlView = "formAddHero.jsp";
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		String urlView = "/views/formAddHero.jsp";
		
		if(request.getParameter("addHero_form") != null ) {
			System.out.println("formulaire hero");
			
			String heroName = request.getParameter("getName");
			String heroPhone = request.getParameter("getPhone");
			String heroAddr = request.getParameter("getAddress");
			double heroLatitude = Double.parseDouble(request.getParameter("getLatitude"));
			double heroLongitude = Double.parseDouble(request.getParameter("getLongitude"));
			
			Hero hero = new Hero(heroName, heroPhone, heroAddr, heroLatitude, heroLongitude);
			heroRepository.create_hero(hero);		
		}
		
		List<Hero> heroes = heroRepository.findAll();
		request.setAttribute("heroes", heroes);
		request.getRequestDispatcher(urlView).forward(request, response);
	}

}
