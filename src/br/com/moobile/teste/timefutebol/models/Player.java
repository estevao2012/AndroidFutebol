package br.com.moobile.teste.timefutebol.models;

import java.util.Date;

public class Player {

	private int id;
	private String name;
	private String position;
	private int number;
	private int team_id;
	private Date created_at;
	private Date updated_at;

	public Player(int id, String name, String position, int number, int team_id, Date created_at, Date updated_at) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.number = number;
		this.team_id = team_id;
		this.created_at = created_at;
		this.updated_at = updated_at;
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getTeam_id() {
		return team_id;
	}

	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

}
