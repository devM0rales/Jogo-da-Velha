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

		Player player = new Player();
		Board board = new Board(b, playerX, playerO, player);
		board.createBoard();
		
		
		for(int i = 0; board.getVerify() == 'C'; i++) {
			
			board.alterPlayer(i);
			board.showBoard();
			
			System.out.println("Vez do " + board.getPlayer().getName() + "("+board.getPlayer().getSymbol()+")");
			System.out.print("Linha: ");
			int lin = sc.nextInt();
			System.out.print("Coluna: ");
			int col = sc.nextInt();
			
			board.play(lin, col, board.getPlayer());;
			board.verifyWin(board.getPlayer().getSymbol());
		}
		
		
		board.showResult();
		board.showBoard();
		
		sc.close();
	}
}
