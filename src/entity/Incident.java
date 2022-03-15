package entity;

import java.util.List;
import java.util.ArrayList;

public class Incident {
	private Long id;
	private String name_incident;
	
	private List<Hero> heroes;
	
	public Incident(String name_incident, Long id) {
		this.id = id;
		this.name_incident = name_incident;
	}

	public Incident() {
		// TODO Auto-generated constructor stub
	}

	public String getName_incident() {
		return name_incident;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName_incident(String name_incident) {
		this.name_incident = name_incident;
	}

	public List<Hero> getHeroes() {
		return heroes;
	}

	public void setHeroes(List<Hero> heroes) {
		this.heroes = heroes;
	}
	
}
