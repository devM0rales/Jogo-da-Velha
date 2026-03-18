package entities;

public class Board {
	
	private Player playerX;
	private Player playerO;
	private Player player;
	private char verify;
	
	char[][] board = new char[3][3];
	
	
	public Board(char[][] board, Player playerX, Player playerO, Player player) {
		this.board = board;
		this.playerX = playerX;
		this.playerO = playerO;
		this.player = player;
	}
	
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
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
	
	public char getVerify() {
		return verify;
	}
	public void setVerify(char verify) {
		this.verify = verify;
	}
	
	
	public void createBoard() {
		verify = 'C';
		for (int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				board[i][j] = ' ';
			}
		}
	}
	public void play(int lin, int col, Player p) {
		if(board[lin][col] != ' ') {
			System.out.println("Posição já ocupada!");
		}
		else {
			board[lin][col] = p.getSymbol();
		}
	}
	
	public void alterPlayer(int count) {
		if (count %2 == 0) {
			this.player = playerO;
		}
		else {
			player = playerX;
		}
	}
	
	public void showBoard() {
		System.out.print("  0  1  2");
		for (int i = 0; i<3; i++) {
			System.out.println("");
			System.out.print(i +" ");
			for(int j = 0; j<3;j++) {
				System.out.print(board[i][j]+"|");
			}
		}
		System.out.println();
		System.out.println();
	}
	public void verifyWin(char symbol) {
		//Verifica as linhas
		for(int i = 0; i<3; i++) {
			if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
				verify = symbol;
			}
		}
		//Verifica as Colunas
		for(int i = 0; i<3;i++) {
			if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) {
				verify = symbol;
			}
		}
		//Verifica a Diagonal principal
		if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
			verify = symbol;
		}
		
		//Verifica a Diagonal Secundaria
		if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
			verify = symbol;
		}
		int count = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j<3; j++) {
				if (board[i][j] != ' '){
					count += 1;
				}
			}
		}
		if (count == 9) {
			verify = 'E';
		}
	}
	public void showResult() {
		if (verify == 'E') {
			System.out.println("------------------------");
			System.out.println("EMPATE!");
		}
		
		else if(verify == 'X') {
			System.out.println("------------------------");
			System.out.println("O JOGADOR " + playerX.getName()+"(X) GANHOU!");
		}
		
		else if(verify == 'O') {
			System.out.println("------------------------");
			System.out.println("O JOGADOR " + playerO.getName()+"(O) GANHOU!");
		}
	}
}