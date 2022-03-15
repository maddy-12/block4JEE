package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Hero;
import entity.Incident;
import model.HeroRepository;
import model.IncidentTypeRepository;

@WebServlet("/registerHero")
public class ServletHero extends HttpServlet {
	private HeroRepository heroRepository;
	private IncidentTypeRepository incidentTypeRepository;
	

    public ServletHero() {
        heroRepository = new HeroRepository();
        incidentTypeRepository = new IncidentTypeRepository();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("page", "formAddHero");
		ArrayList<Incident> incidents = incidentTypeRepository.findAll(); 
		request.setAttribute("incidents", incidents);
		System.out.println("doGet");
		String urlView = "/views/formAddHero.jsp";
		request.getRequestDispatcher(urlView).forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		String urlView = "/views/formAddHero.jsp";
		
		if(request.getParameter("addHero_form") != null ) {
			System.out.println("formulaire hero");
			
			String heroName = request.getParameter("name");
			String heroPhone = request.getParameter("phone");
			String heroAddr = request.getParameter("address");
			double heroLatitude = Double.parseDouble(request.getParameter("latitude"));
			double heroLongitude = Double.parseDouble(request.getParameter("longitude"));
			
			Hero hero = new Hero(heroName, heroPhone, heroAddr, heroLatitude, heroLongitude);
			int id_hero = heroRepository.create_hero(hero);
			
				for(int i=1; i<= 10; i++) {
					System.out.println(id_hero);
					String id_incident = request.getParameter("incident".concat(String.valueOf(i)));
					if(id_incident != null) {
					System.out.println(id_incident);
					heroRepository.insertIncidentType(id_hero, Integer.parseInt(id_incident));
				}
			}
				
		}

		List<Hero> heroes = heroRepository.findAll();
		request.setAttribute("heroes", heroes);
		request.getRequestDispatcher(urlView).forward(request, response);
	}
}
