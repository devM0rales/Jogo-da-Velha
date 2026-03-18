package entities;

public class Player {

	private String name;
	private char symbol; //C-Continua
	
	public Player() {
	}
	
	public Player(String name, char symbol) {
		this.name = name;
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
	
	public void play(char x, char y) {
		char lin = x;
		char col= y;
		
	}
	
}
