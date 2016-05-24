package jogo;

public class UtilUnstoppable {

	int[][] tabuleiro = new int[3][3];
	boolean vezJogadorX;// = true;
	boolean vezJogadorO;// = false;
	int jogadas;
	int vencedor = -1;

	public UtilUnstoppable() {
		if ((Math.random() % 2) == 0) {
			vezJogadorX = false;
			vezJogadorO = true;
		} else {
			vezJogadorX = true;
			vezJogadorO = false;
		}
		jogadas = 0;
		if (vezJogadorO == true)
			jogada();
	}

	public UtilUnstoppable(boolean jogador) {
		if (jogador == true) {
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

	public int[][] jogada() {
		if(tabuleiro[1][1] == 0) {
			tabuleiro[1][1] = 2;
		}
		else {
			boolean jogou = vence();
			if(!jogou) {
				jogou = bloqueia();
			}
			if(!jogou) {
				jogou = jogaCanto();
			}
			if(!jogou) {
				jogaMeio();
			}
		}
		jogadas++;
		vencedor = verificaVencedor();
		System.out.println(toString());
		return tabuleiro;
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

	public int verificaVencedor() {
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
			return 2;
		}
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
			System.out.println("Jogador Venceu");
			return 1;
		}
		return -1;
	}
	
	private boolean vence() {
		// verifica as linhas
		if (tabuleiro[0][1] == 2 && tabuleiro[0][2] == 2 && tabuleiro[0][0] == 0) {
			tabuleiro[0][0] = 2;
			return true;
		}
		if (tabuleiro[0][0] == 2 && tabuleiro[0][2] == 2 && tabuleiro[0][1] == 0) {
			tabuleiro[0][1] =2;
			return true;
		}
		if (tabuleiro[0][0] == 2 && tabuleiro[0][1] == 2 && tabuleiro[0][2] == 0) {
			tabuleiro[0][2] = 2;
			return true;
		}
		if (tabuleiro[1][1] == 2 && tabuleiro[1][2] == 2 && tabuleiro[1][0] == 0) {
			tabuleiro[1][0] = 2;
			return true;
		}
		if (tabuleiro[1][0] == 2 && tabuleiro[1][2] == 2 && tabuleiro[1][1] == 0) {
			tabuleiro[1][1] = 2;
			return true;
		}
		if (tabuleiro[1][0] == 2 && tabuleiro[1][1] == 2 && tabuleiro[1][2] == 0) {
			 tabuleiro[1][2] = 2;
				return true;
		}
		if (tabuleiro[2][1] == 2 && tabuleiro[2][2] == 2 && tabuleiro[2][0] == 0) {
			tabuleiro[2][0] = 2;
			return true;
		}
		if (tabuleiro[2][0] == 2 && tabuleiro[2][2] == 2 && tabuleiro[2][1] == 0) {
			tabuleiro[2][1] = 2;
			return true;
		}
		if (tabuleiro[2][0] == 2 && tabuleiro[2][1] == 2 && tabuleiro[2][2] == 0) {
			tabuleiro[2][2] = 2;
			return true;
		}

		if (tabuleiro[1][0] == 2 && tabuleiro[2][0] == 2 && tabuleiro[0][0] == 0) {
			tabuleiro[0][0] = 2;
			return true;
		}
		if (tabuleiro[0][0] == 2 && tabuleiro[2][0] == 2 && tabuleiro[1][0] == 0) {
			tabuleiro[1][0] = 2;
			return true;
		}
		if (tabuleiro[0][0] == 2 && tabuleiro[1][0] == 2 && tabuleiro[2][0] == 0) {
			tabuleiro[2][0] = 2;
			return true;
		}
		if (tabuleiro[1][1] == 2 && tabuleiro[2][1] == 2 && tabuleiro[0][1] == 0) {
			tabuleiro[0][1] = 2;
			return true;
		}
		if (tabuleiro[0][1] == 2 && tabuleiro[2][1] == 2 && tabuleiro[1][1] == 0) {
			tabuleiro[1][1] = 2;
			return true;
		}
		if (tabuleiro[0][1] == 2 && tabuleiro[1][1] == 2 && tabuleiro[2][1] == 0) {
			tabuleiro[2][1] = 2;
			return true;
		}
		if (tabuleiro[1][2] == 2 && tabuleiro[2][2] == 2 && tabuleiro[0][2] == 0) {
			tabuleiro[0][2] = 2;
			return true;
		}
		if (tabuleiro[0][2] == 2 && tabuleiro[2][2] == 2 && tabuleiro[1][2] == 0) {
			tabuleiro[1][2] = 2;
			return true;
		}
		if (tabuleiro[0][2] == 2 && tabuleiro[1][2] == 2 && tabuleiro[2][2] == 0) {
			tabuleiro[2][2] = 2;
			return true;
		}

		if (tabuleiro[1][1] == 2 && tabuleiro[2][2] == 2 && tabuleiro[0][0] == 0) {
			tabuleiro[0][0] = 2;
			return true;
		}
		if (tabuleiro[0][0] == 2 && tabuleiro[2][2] == 2 && tabuleiro[1][1] == 0) {
			tabuleiro[1][1] = 2;
			return true;
		}
		if (tabuleiro[0][0] == 2 && tabuleiro[1][1] == 2 && tabuleiro[2][2] == 0) {
			tabuleiro[2][2] = 2;
			return true;
		}
		if (tabuleiro[1][1] == 2 && tabuleiro[2][0] == 2 && tabuleiro[0][2] == 0) {
			tabuleiro[0][2] = 2;
			return true;
		}
		if (tabuleiro[0][2] == 2 && tabuleiro[2][0] == 2 && tabuleiro[1][1] == 0) {
			tabuleiro[1][1] = 2;
			return true;
		}
		if (tabuleiro[0][2] == 2 && tabuleiro[1][1] == 2 && tabuleiro[2][0] == 0) {
			tabuleiro[2][0] = 2;
			return true;
		}
		return false;
	}
		
	private boolean bloqueia() {

		if (tabuleiro[0][0] == 0 && tabuleiro[0][1] == 1 && tabuleiro[0][2] == 1) {
			tabuleiro[0][0] = 2;
			return true;
		}
		if (tabuleiro[0][1] == 0 && tabuleiro[0][0] == 1 && tabuleiro[0][2] == 1) {
			tabuleiro[0][1] = 2;
			return true;
		}
		if (tabuleiro[0][2] == 0 && tabuleiro[0][0] == 1 && tabuleiro[0][1] == 1) {
			tabuleiro[0][2] = 2;
			return true;
		}
		if (tabuleiro[1][0] == 0 && tabuleiro[1][1] == 1 && tabuleiro[1][2] == 1) {
			tabuleiro[1][0] = 2;
			return true;
		}
		if (tabuleiro[1][1] == 0 && tabuleiro[1][0] == 1 && tabuleiro[1][2] == 1) {
			tabuleiro[1][1] = 2;
			return true;
		}
		if (tabuleiro[1][2] == 0 && tabuleiro[1][0] == 1 && tabuleiro[1][1] == 1) {
			tabuleiro[1][2] = 2;
			return true;
		}
		if (tabuleiro[2][0] == 0 && tabuleiro[2][1] == 1 && tabuleiro[2][2] == 1) {
			tabuleiro[2][0] = 2;
			return true;
		}
		if (tabuleiro[2][1] == 0 && tabuleiro[2][0] == 1 && tabuleiro[2][2] == 1) {
			tabuleiro[2][1] = 2;
			return true;
		}
		if (tabuleiro[2][2] == 0 && tabuleiro[2][0] == 1 && tabuleiro[2][1] == 1) {
			tabuleiro[2][2] = 2;
			return true;
		}

		if (tabuleiro[0][0] == 0 && tabuleiro[1][0] == 1 && tabuleiro[2][0] == 1) {
			tabuleiro[0][0] = 2;
			return true;
		}
		if (tabuleiro[1][0] == 0 && tabuleiro[0][0] == 1 && tabuleiro[2][0] == 1) {
			tabuleiro[1][0] = 2;
			return true;
		}
		if (tabuleiro[2][0] == 0 && tabuleiro[0][0] == 1 && tabuleiro[1][0] == 1) {
			tabuleiro[2][0] = 2;
			return true;
		}
		if (tabuleiro[0][1] == 0 && tabuleiro[1][1] == 1 && tabuleiro[2][1] == 1) {
			tabuleiro[0][1] = 2;
			return true;
		}
		if (tabuleiro[1][1] == 0 && tabuleiro[0][1] == 1 && tabuleiro[2][1] == 1) {
			tabuleiro[1][1] = 2;
			return true;
		}
		if (tabuleiro[2][1] == 0 && tabuleiro[0][1] == 1 && tabuleiro[1][1] == 1) {
			tabuleiro[2][1] = 2;
			return true;
		}
		if (tabuleiro[0][2] == 0 && tabuleiro[1][2] == 1 && tabuleiro[2][2] == 1) {
			tabuleiro[0][2] = 2;
			return true;
		}
		if (tabuleiro[1][2] == 0 && tabuleiro[0][2] == 1 && tabuleiro[2][2] == 1) {
			tabuleiro[1][2] = 2;
			return true;
		}
		if (tabuleiro[2][2] == 0 && tabuleiro[0][2] == 1 && tabuleiro[1][2] == 1) {
			tabuleiro[2][2] = 2;
			return true;
		}

		if (tabuleiro[0][0] == 0 && tabuleiro[1][1] == 1 && tabuleiro[2][2] == 1) {
			tabuleiro[0][0] = 2;
			return true;
		}
		if (tabuleiro[1][1] == 0 && tabuleiro[0][0] == 1 && tabuleiro[2][2] == 1) {
			tabuleiro[1][1] = 2;
			return true;
		}
		if (tabuleiro[2][2] == 0 && tabuleiro[0][0] == 1 && tabuleiro[1][1] == 1) {
			tabuleiro[2][2] = 2;
			return true;
		}
		if (tabuleiro[0][2] == 0 && tabuleiro[1][1] == 1 && tabuleiro[2][0] == 1) {
			tabuleiro[0][2] = 2;
			return true;
		}
		if (tabuleiro[1][1] == 0 && tabuleiro[0][2] == 1 && tabuleiro[2][0] == 1) {
			tabuleiro[1][1] = 2;
			return true;
		}
		if (tabuleiro[2][0] == 0 && tabuleiro[0][2] == 1 && tabuleiro[1][1] == 1) {
			tabuleiro[2][0] = 2;
			return true;
		}
		if (tabuleiro[0][0] == 1 && tabuleiro[2][2] == 1){
			tabuleiro[1][0] = 2;
			return true;
		}
		if (tabuleiro[0][2] == 1 && tabuleiro[2][0] == 1){
			tabuleiro[2][1] = 2;
			return true;
		}
		if (tabuleiro[2][2] == 0 && tabuleiro[0][2] == 1 && tabuleiro[2][1] == 1){//ok
			tabuleiro[2][2] = 2;
			return true;
		}
		if (tabuleiro[0][2] == 0 && tabuleiro[0][0] == 1 && tabuleiro[1][2] == 1){//ok
			tabuleiro[0][2] = 2;
			return true;
		}
		if (tabuleiro[0][0] == 0 && tabuleiro[2][0] == 1 && tabuleiro[0][1] == 1){//ok
			tabuleiro[0][0] = 2;
			return true;
		}
		if (tabuleiro[2][0] == 0 && tabuleiro[2][2] == 1 && tabuleiro[1][0] == 1){//ok
			tabuleiro[2][0] = 2;
			return true;
		}
		if (tabuleiro[0][2] == 0 && tabuleiro[2][2] == 1 && tabuleiro[0][1] == 1){//ok
			tabuleiro[0][2] = 2;
			return true;
		}
		if (tabuleiro[2][0] == 0 && tabuleiro[0][0] == 1 && tabuleiro[2][1] == 1){//ok
			tabuleiro[2][0] = 2;
			return true;
		}
		if (tabuleiro[0][0] == 0 && tabuleiro[0][2] == 1 && tabuleiro[1][0] == 1){//ok
			tabuleiro[0][0] = 2;
			return true;
		}
		if (tabuleiro[2][2] == 0 && tabuleiro[2][0] == 1 && tabuleiro[1][2] == 1){//ok
			tabuleiro[2][2] = 2;
			return true;
		}
		return false;
	}
	
	private boolean jogaCanto() {
		if(tabuleiro[0][0] != 0 && tabuleiro[0][2] != 0 && tabuleiro[2][0] != 0 && tabuleiro[2][2] != 0)
			return false;
		boolean p = false;
		int pos;
		do {
			pos = (int) ((Math.random()*100) % 4) + 1;
			if(pos == 1) {
				if(tabuleiro[0][0] == 0) {
					tabuleiro[0][0] = 2;
					p = true;
				}
			}
			else if(pos == 2) {
				if(tabuleiro[0][2] == 0) {
					tabuleiro[0][2] = 2;
					p = true;
				}
			}
			else if(pos == 3) {
				if(tabuleiro[2][0] == 0) {
					tabuleiro[2][0] = 2;
					p = true;
				}
			}
			else if(pos == 4) {
				if(tabuleiro[2][2] == 0) {
					tabuleiro[2][2] = 2;
					p = true;
				}
			}
		}while(p == false);
		return true;
	}
	
	private void jogaMeio() {
		boolean p = false;
		int pos;
		do {
			pos = (int) ((Math.random()*100) % 4) + 1;
			if(pos == 1) {
				if(tabuleiro[0][1] == 0) {
					tabuleiro[0][1] = 2;
					p = true;
				}
			}
			else if(pos == 2) {
				if(tabuleiro[1][0] == 0) {
					tabuleiro[1][0] = 2;
					p = true;
				}
			}
			else if(pos == 3) {
				if(tabuleiro[1][2] == 0) {
					tabuleiro[1][2] = 2;
					p = true;
				}
			}
			else if(pos == 4) {
				if(tabuleiro[2][1] == 0) {
					tabuleiro[2][1] = 2;
					p = true;
				}
			}
		}while(p == false);
	}

	@Override
	public String toString() {
		
		return "|" + tabuleiro[0][0] + "|" + tabuleiro[0][1] + "|" + tabuleiro[0][2] + "|\n|" + tabuleiro[1][0] + "|" + tabuleiro[1][1] + "|" + tabuleiro[1][2] + "|\n|"  + tabuleiro[2][0] + "|" + tabuleiro[2][1] + "|" + tabuleiro[2][2] + "|\n";
	}
}