package jogo;

public class Util {

	int[][] tabuleiro = new int[3][3];
	boolean vezJogadorX;// = true;
	boolean vezJogadorO;// = false;
	int jogadas;
	int vencedor = -1;

	public Util() {
		if((Math.random() % 2) == 0) {
			vezJogadorX = false;
			vezJogadorO = true;
		} else {
			vezJogadorX = true;
			vezJogadorO = false;
		}
		jogadas = 0;
		if(vezJogadorO == true)
			jogada();
	}

	public Util(boolean jogador) {
		if(jogador == true) {
			vezJogadorX = false;
			vezJogadorO = true;
		} else {
			vezJogadorX = true;
			vezJogadorO = false;
		}
		jogadas = 0;
	}

	public void vezDoJogador() {
		if (vezJogadorX == true) {
			vezJogadorX = false;
			vezJogadorO = true;
		} else {
			vezJogadorX = true;
			vezJogadorO = false;
		}
	}

	public int jogada() {
		int posH;
		int posV;
		if (jogadas < 9 && vencedor == -1) {
			do {
				posH = (int) ((Math.random()*100) % 3);
				posV = (int) ((Math.random()*100) % 3);
			} while (tabuleiro[posH][posV] == 1 || tabuleiro[posH][posV] == 2);
			tabuleiro[posH][posV] = 2;
			if ((tabuleiro[0][0] == tabuleiro[0][1] && tabuleiro[0][1] == tabuleiro[0][2])
					&& (tabuleiro[0][0] == 2)
					|| (tabuleiro[1][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[1][2])
					&& (tabuleiro[1][0] == 2)
					|| (tabuleiro[2][0] == tabuleiro[2][1] && tabuleiro[2][1] == tabuleiro[2][2])
					&& (tabuleiro[2][0] == 2)
					|| (tabuleiro[0][0] == tabuleiro[1][0] && tabuleiro[1][0] == tabuleiro[2][0])
					&& (tabuleiro[0][0] == 2)
					|| (tabuleiro[0][1] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][1])
					&& (tabuleiro[0][1] == 2)
					|| (tabuleiro[0][2] == tabuleiro[1][2] && tabuleiro[1][2] == tabuleiro[2][2])
					&& (tabuleiro[0][2] == 2)
					|| (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2])
					&& (tabuleiro[0][0] == 2)
					|| (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0])
					&& (tabuleiro[0][2] == 2)) {
				System.out.println("Computador Venceu");
				vencedor = 2;
			}

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(tabuleiro[i][j] + " ");
				}
				System.out.println("fim");
			}
			System.out.println();
			jogadas++;
			vezDoJogador();
			return posJogada(posH, posV);
		}
		return -1;
	}
	
	private int posJogada(int posH, int posV) {
		if(posH == 0 && posV == 0)
			return 1;
		else if(posH == 0 && posV == 1)
			return 2;
		else if(posH == 0 && posV == 2)
			return 3;
		else if(posH == 1 && posV == 0)
			return 4;
		else if(posH == 1 && posV == 1)
			return 5;
		else if(posH == 1 && posV == 2)
			return 6;
		else if(posH == 2 && posV == 0)
			return 7;
		else if(posH == 2 && posV == 1)
			return 8;
		else if(posH == 2 && posV == 2)
			return 9;
		else
			return 0;
	}

	public int getCampo(int posH, int posV) {
		return tabuleiro[posH][posV];
	}

	public int setCampo(int posH, int posV) {
		if (vezJogadorX == true)
			tabuleiro[posH][posV] = 1;
		else
			jogada();
		jogadas++;
		

		if ((tabuleiro[0][0] == tabuleiro[0][1] && tabuleiro[0][1] == tabuleiro[0][2])
				&& (tabuleiro[0][0] == 1)
				|| (tabuleiro[1][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[1][2])
				&& (tabuleiro[1][0] == 1)
				|| (tabuleiro[2][0] == tabuleiro[2][1] && tabuleiro[2][1] == tabuleiro[2][2])
				&& (tabuleiro[2][0] == 1)
				|| (tabuleiro[0][0] == tabuleiro[1][0] && tabuleiro[1][0] == tabuleiro[2][0])
				&& (tabuleiro[0][0] == 1)
				|| (tabuleiro[0][1] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][1])
				&& (tabuleiro[0][1] == 1)
				|| (tabuleiro[0][2] == tabuleiro[1][2] && tabuleiro[1][2] == tabuleiro[2][2])
				&& (tabuleiro[0][2] == 1)
				|| (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2])
				&& (tabuleiro[0][0] == 1)
				|| (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0])
				&& (tabuleiro[0][2] == 1)) {
			System.out.println("Jogador Venceu");
			vencedor = 1;
		}
		
		return getCampo(posH, posV);
	}

}