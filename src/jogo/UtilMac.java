package jogo;

public class UtilMac {

	int[][] tabuleiro = new int[3][3];
	boolean vezJogadorX;// = true;
	boolean vezJogadorO;// = false;
	int jogadas;
	int vencedor = -1;

	public UtilMac() {
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

	public UtilMac(boolean jogador) {
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
		int jogador;
		
		if (vezJogadorX == true) { jogador = 1; } else { jogador = 2; }
		
		if (tabuleiro[1][1] == 0) {
			tabuleiro[1][1] = jogador;
		} else {
			boolean jogou = vence(jogador);
			if (!jogou) {
				jogou = bloqueia(jogador);
			}
			if (!jogou) {
				jogou = jogaCanto(jogador);
			}
			if (!jogou) {
				jogaMeio(jogador);
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

	private boolean vence(int jogador) {
		// verifica as linhas
		if (tabuleiro[0][1] == jogador && tabuleiro[0][2] == jogador
				&& tabuleiro[0][0] == 0) {
			tabuleiro[0][0] = jogador;
			return true;
		}
		if (tabuleiro[0][0] == jogador && tabuleiro[0][2] == jogador
				&& tabuleiro[0][1] == 0) {
			tabuleiro[0][1] = jogador;
			return true;
		}
		if (tabuleiro[0][0] == jogador && tabuleiro[0][1] == jogador
				&& tabuleiro[0][2] == 0) {
			tabuleiro[0][2] = jogador;
			return true;
		}
		if (tabuleiro[1][1] == jogador && tabuleiro[1][2] == jogador
				&& tabuleiro[1][0] == 0) {
			tabuleiro[1][0] = jogador;
			return true;
		}
		if (tabuleiro[1][0] == jogador && tabuleiro[1][2] == jogador
				&& tabuleiro[1][1] == 0) {
			tabuleiro[1][1] = jogador;
			return true;
		}
		if (tabuleiro[1][0] == jogador && tabuleiro[1][1] == jogador
				&& tabuleiro[1][2] == 0) {
			tabuleiro[1][2] = jogador;
			return true;
		}
		if (tabuleiro[2][1] == jogador && tabuleiro[2][2] == jogador
				&& tabuleiro[2][0] == 0) {
			tabuleiro[2][0] = jogador;
			return true;
		}
		if (tabuleiro[2][0] == jogador && tabuleiro[2][2] == jogador
				&& tabuleiro[2][1] == 0) {
			tabuleiro[2][1] = jogador;
			return true;
		}
		if (tabuleiro[2][0] == jogador && tabuleiro[2][1] == jogador
				&& tabuleiro[2][2] == 0) {
			tabuleiro[2][2] = jogador;
			return true;
		}

		if (tabuleiro[1][0] == jogador && tabuleiro[2][0] == jogador
				&& tabuleiro[0][0] == 0) {
			tabuleiro[0][0] = jogador;
			return true;
		}
		if (tabuleiro[0][0] == jogador && tabuleiro[2][0] == jogador
				&& tabuleiro[1][0] == 0) {
			tabuleiro[1][0] = jogador;
			return true;
		}
		if (tabuleiro[0][0] == jogador && tabuleiro[1][0] == jogador
				&& tabuleiro[2][0] == 0) {
			tabuleiro[2][0] = jogador;
			return true;
		}
		if (tabuleiro[1][1] == jogador && tabuleiro[2][1] == jogador
				&& tabuleiro[0][1] == 0) {
			tabuleiro[0][1] = jogador;
			return true;
		}
		if (tabuleiro[0][1] == jogador && tabuleiro[2][1] == jogador
				&& tabuleiro[1][1] == 0) {
			tabuleiro[1][1] = jogador;
			return true;
		}
		if (tabuleiro[0][1] == jogador && tabuleiro[1][1] == jogador
				&& tabuleiro[2][1] == 0) {
			tabuleiro[2][1] = jogador;
			return true;
		}
		if (tabuleiro[1][2] == jogador && tabuleiro[2][2] == jogador
				&& tabuleiro[0][2] == 0) {
			tabuleiro[0][2] = jogador;
			return true;
		}
		if (tabuleiro[0][2] == jogador && tabuleiro[2][2] == jogador
				&& tabuleiro[1][2] == 0) {
			tabuleiro[1][2] = jogador;
			return true;
		}
		if (tabuleiro[0][2] == jogador && tabuleiro[1][2] == jogador
				&& tabuleiro[2][2] == 0) {
			tabuleiro[2][2] = jogador;
			return true;
		}

		if (tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador
				&& tabuleiro[0][0] == 0) {
			tabuleiro[0][0] = jogador;
			return true;
		}
		if (tabuleiro[0][0] == jogador && tabuleiro[2][2] == jogador
				&& tabuleiro[1][1] == 0) {
			tabuleiro[1][1] = jogador;
			return true;
		}
		if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador
				&& tabuleiro[2][2] == 0) {
			tabuleiro[2][2] = jogador;
			return true;
		}
		if (tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador
				&& tabuleiro[0][2] == 0) {
			tabuleiro[0][2] = jogador;
			return true;
		}
		if (tabuleiro[0][2] == jogador && tabuleiro[2][0] == jogador
				&& tabuleiro[1][1] == 0) {
			tabuleiro[1][1] = jogador;
			return true;
		}
		if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador
				&& tabuleiro[2][0] == 0) {
			tabuleiro[2][0] = jogador;
			return true;
		}
		return false;
	}

	private boolean bloqueia(int jogador1) {
		int jogador2;
		if(jogador1 == 1) { jogador2 = 2; } else { jogador2 = 1; }

		if (tabuleiro[0][0] == 0 && tabuleiro[0][1] == jogador2
				&& tabuleiro[0][2] == jogador2) {
			tabuleiro[0][0] = jogador1;
			return true;
		}
		if (tabuleiro[0][1] == 0 && tabuleiro[0][0] == jogador2
				&& tabuleiro[0][2] == jogador2) {
			tabuleiro[0][1] = jogador1;
			return true;
		}
		if (tabuleiro[0][2] == 0 && tabuleiro[0][0] == jogador2
				&& tabuleiro[0][1] == jogador2) {
			tabuleiro[0][2] = jogador1;
			return true;
		}
		if (tabuleiro[1][0] == 0 && tabuleiro[1][1] == jogador2
				&& tabuleiro[1][2] == jogador2) {
			tabuleiro[1][0] = jogador1;
			return true;
		}
		if (tabuleiro[1][1] == 0 && tabuleiro[1][0] == jogador2
				&& tabuleiro[1][2] == jogador2) {
			tabuleiro[1][1] = jogador1;
			return true;
		}
		if (tabuleiro[1][2] == 0 && tabuleiro[1][0] == jogador2
				&& tabuleiro[1][1] == jogador2) {
			tabuleiro[1][2] = jogador1;
			return true;
		}
		if (tabuleiro[2][0] == 0 && tabuleiro[2][1] == jogador2
				&& tabuleiro[2][2] == jogador2) {
			tabuleiro[2][0] = jogador1;
			return true;
		}
		if (tabuleiro[2][1] == 0 && tabuleiro[2][0] == jogador2
				&& tabuleiro[2][2] == jogador2) {
			tabuleiro[2][1] = jogador1;
			return true;
		}
		if (tabuleiro[2][2] == 0 && tabuleiro[2][0] == jogador2
				&& tabuleiro[2][1] == jogador2) {
			tabuleiro[2][2] = jogador1;
			return true;
		}

		if (tabuleiro[0][0] == 0 && tabuleiro[1][0] == jogador2
				&& tabuleiro[2][0] == jogador2) {
			tabuleiro[0][0] = jogador1;
			return true;
		}
		if (tabuleiro[1][0] == 0 && tabuleiro[0][0] == jogador2
				&& tabuleiro[2][0] == jogador2) {
			tabuleiro[1][0] = jogador1;
			return true;
		}
		if (tabuleiro[2][0] == 0 && tabuleiro[0][0] == jogador2
				&& tabuleiro[1][0] == jogador2) {
			tabuleiro[2][0] = jogador1;
			return true;
		}
		if (tabuleiro[0][1] == 0 && tabuleiro[1][1] == jogador2
				&& tabuleiro[2][1] == jogador2) {
			tabuleiro[0][1] = jogador1;
			return true;
		}
		if (tabuleiro[1][1] == 0 && tabuleiro[0][1] == jogador2
				&& tabuleiro[2][1] == jogador2) {
			tabuleiro[1][1] = jogador1;
			return true;
		}
		if (tabuleiro[2][1] == 0 && tabuleiro[0][1] == jogador2
				&& tabuleiro[1][1] == jogador2) {
			tabuleiro[2][1] = jogador1;
			return true;
		}
		if (tabuleiro[0][2] == 0 && tabuleiro[1][2] == jogador2
				&& tabuleiro[2][2] == jogador2) {
			tabuleiro[0][2] = jogador1;
			return true;
		}
		if (tabuleiro[1][2] == 0 && tabuleiro[0][2] == jogador2
				&& tabuleiro[2][2] == jogador2) {
			tabuleiro[1][2] = jogador1;
			return true;
		}
		if (tabuleiro[2][2] == 0 && tabuleiro[0][2] == jogador2
				&& tabuleiro[1][2] == jogador2) {
			tabuleiro[2][2] = jogador1;
			return true;
		}

		if (tabuleiro[0][0] == 0 && tabuleiro[1][1] == jogador2
				&& tabuleiro[2][2] == jogador2) {
			tabuleiro[0][0] = jogador1;
			return true;
		}
		if (tabuleiro[1][1] == 0 && tabuleiro[0][0] == jogador2
				&& tabuleiro[2][2] == jogador2) {
			tabuleiro[1][1] = jogador1;
			return true;
		}
		if (tabuleiro[2][2] == 0 && tabuleiro[0][0] == jogador2
				&& tabuleiro[1][1] == jogador2) {
			tabuleiro[2][2] = jogador1;
			return true;
		}
		if (tabuleiro[0][2] == 0 && tabuleiro[1][1] == jogador2
				&& tabuleiro[2][0] == jogador2) {
			tabuleiro[0][2] = jogador1;
			return true;
		}
		if (tabuleiro[1][1] == 0 && tabuleiro[0][2] == jogador2
				&& tabuleiro[2][0] == jogador2) {
			tabuleiro[1][1] = jogador1;
			return true;
		}
		if (tabuleiro[2][0] == 0 && tabuleiro[0][2] == jogador2
				&& tabuleiro[1][1] == jogador2) {
			tabuleiro[2][0] = jogador1;
			return true;
		}
		return false;
	}

	private boolean jogaCanto(int jogador) {
		if (tabuleiro[0][0] != 0 && tabuleiro[0][2] != 0
				&& tabuleiro[2][0] != 0 && tabuleiro[2][2] != 0)
			return false;
		boolean p = false;
		int pos;
		do {
			pos = (int) ((Math.random() * 100) % 4) + 1;
			if (pos == 1) {
				if (tabuleiro[0][0] == 0) {
					tabuleiro[0][0] = jogador;
					p = true;
				}
			} else if (pos == 2) {
				if (tabuleiro[0][2] == 0) {
					tabuleiro[0][2] = jogador;
					p = true;
				}
			} else if (pos == 3) {
				if (tabuleiro[2][0] == 0) {
					tabuleiro[2][0] = jogador;
					p = true;
				}
			} else if (pos == 4) {
				if (tabuleiro[2][2] == 0) {
					tabuleiro[2][2] = jogador;
					p = true;
				}
			}
		} while (p == false);
		return true;
	}

	private void jogaMeio(int jogador) {
		boolean p = false;
		int pos;
		do {
			pos = (int) ((Math.random() * 100) % 4) + 1;
			if (pos == 1) {
				if (tabuleiro[0][1] == 0) {
					tabuleiro[0][1] = jogador;
					p = true;
				}
			} else if (pos == 2) {
				if (tabuleiro[1][0] == 0) {
					tabuleiro[1][0] = jogador;
					p = true;
				}
			} else if (pos == 3) {
				if (tabuleiro[1][2] == 0) {
					tabuleiro[1][2] = jogador;
					p = true;
				}
			} else if (pos == 4) {
				if (tabuleiro[2][1] == 0) {
					tabuleiro[2][2] = jogador;
					p = true;
				}
			}
		} while (p == false);
	}

	@Override
	public String toString() {

		return "|" + tabuleiro[0][0] + "|" + tabuleiro[0][1] + "|"
				+ tabuleiro[0][2] + "|\n|" + tabuleiro[1][0] + "|"
				+ tabuleiro[1][1] + "|" + tabuleiro[1][2] + "|\n|"
				+ tabuleiro[2][0] + "|" + tabuleiro[2][1] + "|"
				+ tabuleiro[2][2] + "|\n";
	}
}