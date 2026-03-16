package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Board;
import entities.Player;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char[][] b = new char[3][3];
		
		
		System.out.print("Nome do Jogador X: ");
		String nameX = sc.next();
		Player playerX = new Player(nameX, 'X');
		
		System.out.print("Nome do Jogador O: ");
		String nameO = sc.next();
		Player playerO = new Player(nameO, 'O');

		Board board = new Board(b, playerX, playerO);
		board.createBoard();
		
		while(board.getVerify() == "Continue") {
			board.showBoard();
			
			System.out.println("Vez do " + board.getPlayerX().getName());
			System.out.print("Linha: ");
			int lin = sc.nextInt();
			System.out.print("Coluna: ");
			int col = sc.nextInt();
			board.play(lin, col, playerX);
			board.showBoard();
			System.out.println(board.getVerify());
			board.verifyWin();
			
			System.out.println("Vez do " + board.getPlayerO().getName());
			System.out.println("Linha: ");
			lin = sc.nextInt();
			System.out.println("Coluna: ");	
			col = sc.nextInt();
			board.play(lin, col, playerO);
			System.out.println(board.getVerify());
			board.verifyWin();
			

		}
		
		
		sc.close();
	}
}
