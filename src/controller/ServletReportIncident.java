package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Hero;
import entity.Incident;
import entity.ReportIncident;
import model.IncidentTypeRepository;
import model.ReportIncidentRepository;

/**
 * Servlet implementation class ServletReportIncident
 */
@WebServlet("/reportIncident")
public class ServletReportIncident extends HttpServlet {
	
	private ReportIncidentRepository reportIncidentRepository;
	private IncidentTypeRepository incidentTypeRepository;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletReportIncident() {
    	incidentTypeRepository = new IncidentTypeRepository();
    	reportIncidentRepository = new ReportIncidentRepository();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("page", "formAddIncident");
		
		ArrayList<Incident> incidents = incidentTypeRepository.findAll(); 
		request.setAttribute("incidents", incidents);
		//request.setAttribute("typeIncidents", typeIncidents);
		System.out.println("doGet");
//		String urlView = "formAddIncident.jsp";
		doPost(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		String urlView = "/views/formAddIncident.jsp";
		
		if(request.getParameter("addIncident_submit") != null ) {
			System.out.println("formulaire hero");
			
			String incidentAddress = request.getParameter("address");
			double incidentLatitude = Double.parseDouble(request.getParameter("latitude"));
			double incidentLongitude = Double.parseDouble(request.getParameter("longitude"));
			int incident_typeIncident = Integer.parseInt(request.getParameter("type_incident"));
			
			ReportIncident reportIncident = new ReportIncident(incidentAddress,incidentLatitude, incidentLongitude,incident_typeIncident);
			reportIncidentRepository.create_incident(reportIncident);
		}
		request.getRequestDispatcher(urlView).forward(request, response);
	}

}
