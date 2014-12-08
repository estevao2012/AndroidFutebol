package br.com.moobile.teste.timefutebol.models;


public class Team {
	private int id;
	private String name;
	private String sigla;
	private String created_at;
	private String updated_at;
	
	
	public Team(int id, String name, String sigla, String created_at, String updated_at) {
		super();
		this.id = id;
		this.name = name;
		this.sigla = sigla;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public Team(String name) {
		this.name = name;
	}
	
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	@Override
	public String toString() { 
		return name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
