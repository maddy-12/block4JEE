package entity;

import java.util.List;

public class Incident {
	private Long id_incident;
	private String name_incident;
	
	private List<Hero> heroes;
	
	public Incident(String name_incident, Long id_incident) {
		this.id_incident = id_incident;
		this.name_incident = name_incident;
	}

	public String getName_incident() {
		return name_incident;
	}

	public Long getId_incident() {
		return id_incident;
	}

	public void setId_incident(Long id_incident) {
		this.id_incident = id_incident;
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
