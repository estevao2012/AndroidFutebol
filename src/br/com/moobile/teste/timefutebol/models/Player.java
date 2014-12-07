package br.com.moobile.teste.timefutebol.models;

public class Player {

	private int id;
	private String name;
	private String position;
	private int number;

	public Player(String name, String position, int number) {
		super();
		this.name = name;
		this.position = position;
		this.number = number;
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
}
