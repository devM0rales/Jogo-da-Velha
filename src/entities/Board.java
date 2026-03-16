package entities;

import entities.Player;

public class Board {
	
	private Player playerX;
	private Player playerO;
	private String verify;
	
	char[][] board = new char[3][3];
	char[][] winX = new char[3][3];
	char[][] winO = new char[3][3];

	
	public Board(char[][] board, Player playerX, Player playerO) {
		this.board = board;
		this.playerX = playerX;
		this.playerO = playerO;
		
	}
	
	public Player getPlayerX() {
		return playerX;
	}

	public void setPlayerX(Player playerX) {
		this.playerX = playerX;
	}

	public Player getPlayerO() {
		return playerO;
	}

	public void setPlayerO(Player playerO) {
		this.playerO = playerO;
	}

	public char[][] getBoard() {
		return board;
	}


	public String getVerify() {
		return verify;
	}

	public void setVerify(String verify) {
		this.verify = verify;
	}

	public char[][] getWinX() {
		
		for (int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				winX[i][j] = 'X';
			}
		}
		return winX;
	}

	public void setWinX(char[][] winX) {
		this.winX = winX;
	}

	public char[][] getWinO() {
		return winO;
	}

	public void setWinO(char[][] winO) {
		this.winO = winO;
	}

	public void createBoard() {
		verify = "Continue";
		for (int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				board[i][j] = ' ';
			}
		}
		//Winnner Board X
		for (int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				winX[i][j] = 'X';
			}
		}
		//Winnner Board O
		for (int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				winO[i][j] = 'O';
			}
		}
	}
	
	public void play(int lin, int col, Player p) {
		board[lin][col] = p.getSymbol();
	}
	
	public void showBoard() {
		
		System.out.print("  0  1  2");
		for (int i = 0; i<3; i++) {
			System.out.println("");
			System.out.print(i);
			for(int j = 0; j<3;j++) {
				System.out.print(" "+board[i][j]+"|");
			}
		}
		System.out.println();
		System.out.println();
	}
	
	
	public void verifyWin() {
		//Verifica as linhas
		
		if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
			verify =  "X Ganhou";
		}
		if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
			verify =  "X Ganhou";
		}
		if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') {
			verify =  "X Ganhou";
		}
		
		//Verifica as colunhas
		if (board[0][1] == 'X' && board[0][2] == 'X' && board[0][3] == 'X') {
			verify =  "X Ganhou";
		}
		if (board[1][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
			verify =  "X Ganhou";
		}
		if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') {
			verify =  "X Ganhou";
		}
		
		//Verifica as Diagonais
		if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
			verify =  "X Ganhou";
		}if (board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X') {
			verify =  "X Ganhou";
			
		
		//Verificação "O"
			
		//Verifica as linhas
		
		if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') {
			verify = "O Ganhou";
		}
		if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') {
			verify = "X Ganhou";
		}
		if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') {
			verify = "O Ganhou";
		}
		
		//Verifica as colunhas
		if (board[0][1] == 'O' && board[0][2] == 'O' && board[0][3] == 'O') {
			verify = "X Ganhou";
		}
		if (board[1][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
			verify =  "X Ganhou";
		}
		if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') {
			verify = "O Ganhou";
		}
		
		//Verifica as Diagonais
		if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
			verify =  "X Ganhou";
		}if (board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == 'O') {
			verify =  "O Ganhou";
		}
}
		
	}
	
}


