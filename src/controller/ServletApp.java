 package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entite.Hero;
import entite.Incident;
import model.HeroRepository;
import model.IncidentRepository;

/**
 * Servlet implementation class ServletApp
 */
@WebServlet("/ServletApp")
public class ServletApp extends HttpServlet {
	private HeroRepository heroRepository;
	private IncidentRepository incidentRepository;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletApp() {
        super();
        // TODO Auto-generated constructor stub
        heroRepository = new HeroRepository();
		incidentRepository = new IncidentRepository(heroRepository);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("doGet");
		doPost(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
		System.out.println("doPost");
		String urlVue = "vue.jsp";
		if(request.getParameter("formulaire_promotion") != null) {
			System.out.println("Formulaire incident");
			String intitule = request.getParameter("name_incident");  
			String acronyme = request.getParameter("id_incident"); 
			Incident incident = new incident(id_incident,name_incident);
			incidentRepository.creer(incident);
		}
		else if(request.getParameter("formulaire_etudiant") != null){
			String acronyme = request.getParameter("incident");
			String nom = request.getParameter("nom");  
			String prenom = request.getParameter("prenom");  
			Hero hero = new Hero(name, phone);
			heroRepository.creer(hero, id_incident);
		}
		List<Incident> promotions = incidentRepository.findAll();
		List<Hero> etudiants = heroRepository.findAll();
		request.setAttribute("promotions", promotions);
		request.setAttribute("etudiants", etudiants);
		request.getRequestDispatcher(urlVue).forward(request, response); 
	}

}
