/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

public class JogoRandom extends javax.swing.JFrame {

	UtilRandom util = new UtilRandom();

	/**
	 * Creates new form TelaDoJogo
	 */
	public JogoRandom() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	public void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		btn1 = new javax.swing.JButton();
		btn3 = new javax.swing.JButton();
		btn2 = new javax.swing.JButton();
		btn4 = new javax.swing.JButton();
		btn5 = new javax.swing.JButton();
		btn6 = new javax.swing.JButton();
		btn7 = new javax.swing.JButton();
		btn9 = new javax.swing.JButton();
		btn8 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jSeparator3 = new javax.swing.JSeparator();
		jLabel7 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		lblVitoriaJogador1 = new javax.swing.JLabel();
		lblEmpate = new javax.swing.JLabel();
		lblVitoriaJogador2 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		btnNovoJogo = new javax.swing.JButton();
		btnSair = new javax.swing.JButton();
		jogador = !util.vezJogadorX;

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Jogo da Velha");
		setResizable(false);

		jPanel1.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));

		btn1.setFont(new java.awt.Font("Tahoma", 0, 48));
		btn1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn1ActionPerformed(evt);
			}
		});

		btn3.setFont(new java.awt.Font("Tahoma", 0, 48));
		btn3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn3ActionPerformed(evt);
			}
		});

		btn2.setFont(new java.awt.Font("Tahoma", 0, 48));
		btn2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn2ActionPerformed(evt);
			}
		});

		btn4.setFont(new java.awt.Font("Tahoma", 0, 48));
		btn4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn4ActionPerformed(evt);
			}
		});

		btn5.setFont(new java.awt.Font("Tahoma", 0, 48));
		btn5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn5ActionPerformed(evt);
			}
		});

		btn6.setFont(new java.awt.Font("Tahoma", 0, 48));
		btn6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn6ActionPerformed(evt);
			}
		});

		btn7.setFont(new java.awt.Font("Tahoma", 0, 48));
		btn7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn7ActionPerformed(evt);
			}
		});

		btn9.setFont(new java.awt.Font("Tahoma", 0, 48));
		btn9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn9ActionPerformed(evt);
			}
		});

		btn8.setFont(new java.awt.Font("Tahoma", 0, 48));
		btn8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn8ActionPerformed(evt);
			}
		});

		 javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );


		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(20, 40, 189));
		jLabel1.setText("Jogo da Velha");

		jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
				"Informa��es da Partida",
				javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 1, 12))); // NOI18N

		jLabel2.setText("Jogador 1");

		jLabel3.setText("Jogador 2");

		jLabel4.setText("Vit�rias");

		jLabel6.setText("Empates");

		jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

		jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		jLabel7.setForeground(new java.awt.Color(31, 89, 223));
		jLabel7.setText("X");

		jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		jLabel9.setForeground(new java.awt.Color(222, 42, 42));
		jLabel9.setText("O");

		lblVitoriaJogador1.setText("0");

		lblEmpate.setText("0");

		lblVitoriaJogador2.setText("0");

		jLabel15.setText("Vit�rias");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(99, 99, 99)
                        .addComponent(lblVitoriaJogador1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addComponent(lblEmpate))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(lblVitoriaJogador2)))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(74, 74, 74))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(lblVitoriaJogador1))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblVitoriaJogador2)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblEmpate)))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

		btnNovoJogo.setText("Novo Jogo");
		btnNovoJogo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnNovoJogoActionPerformed(evt);
			}
		});

		btnSair.setText("Sair");
		btnSair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSairActionPerformed(evt);
			}
		});

		 javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNovoJogo))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNovoJogo)
                        .addGap(10, 10, 10)
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();

		if (util.vezJogadorO == true) {
			jogador = false;
			if (util.getCampo(0, 0) == 2)
				btn1.setText("O");
			else if (util.getCampo(0, 1) == 2)
				btn2.setText("O");
			else if (util.getCampo(0, 2) == 2)
				btn3.setText("O");
			else if (util.getCampo(1, 0) == 2)
				btn4.setText("O");
			else if (util.getCampo(1, 1) == 2)
				btn5.setText("O");
			else if (util.getCampo(1, 2) == 2)
				btn6.setText("O");
			else if (util.getCampo(2, 0) == 2)
				btn7.setText("O");
			else if (util.getCampo(2, 1) == 2)
				btn8.setText("O");
			else if (util.getCampo(2, 2) == 2)
				btn9.setText("O");
		} else {
			jogador = true;
		}

		pack();
	}// </editor-fold>

	private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {
		if (btn1.getText().equals("") && vencedor == false) {
			if (util.vezJogadorX == true) {
				btn1.setText("X");
				btn1.setForeground(new java.awt.Color(51, 51, 255));
				util.setCampo(0, 0);
				util.vezDoJogador();
				System.out.println(util.toString());

				if (util.jogadas < 9)
					jogada();
			}
			vencedor();
		}
	}

	private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {
		if (btn2.getText().equals("") && vencedor == false) {
			if (util.vezJogadorX == true) {
				btn2.setText("X");
				btn2.setForeground(new java.awt.Color(51, 51, 255));
				util.setCampo(0, 1);
				util.vezDoJogador();
				System.out.println(util.toString());

				if (util.jogadas < 9)
					jogada();
			}
			vencedor();
		}
	}

	private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {
		if (btn3.getText().equals("") && vencedor == false) {
			if (util.vezJogadorX == true) {
				btn3.setText("X");
				btn3.setForeground(new java.awt.Color(51, 51, 255));
				util.setCampo(0, 2);
				util.vezDoJogador();
				System.out.println(util.toString());

				if (util.jogadas < 9)
					jogada();
			}
			vencedor();
		}
	}

	private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {
		if (btn4.getText().equals("") && vencedor == false) {
			if (util.vezJogadorX == true) {
				btn4.setText("X");
				btn4.setForeground(new java.awt.Color(51, 51, 255));
				util.setCampo(1, 0);
				util.vezDoJogador();
				System.out.println(util.toString());

				if (util.jogadas < 9)
					jogada();
			}
			vencedor();
		}
	}

	private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {
		if (btn5.getText().equals("") && vencedor == false) {
			if (util.vezJogadorX == true) {
				btn5.setText("X");
				btn5.setForeground(new java.awt.Color(51, 51, 255));
				util.setCampo(1, 1);
				util.vezDoJogador();
				System.out.println(util.toString());

				if (util.jogadas < 9)
					jogada();
			}
			vencedor();
		}
	}

	private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {
		if (btn6.getText().equals("") && vencedor == false) {
			if (util.vezJogadorX == true) {
				btn6.setText("X");
				btn6.setForeground(new java.awt.Color(51, 51, 255));
				util.setCampo(1, 2);
				util.vezDoJogador();
				System.out.println(util.toString());

				if (util.jogadas < 9)
					jogada();
			}
			vencedor();
		}
	}

	private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {
		if (btn7.getText().equals("") && vencedor == false) {
			if (util.vezJogadorX == true) {
				btn7.setText("X");
				btn7.setForeground(new java.awt.Color(51, 51, 255));
				util.setCampo(2, 0);
				util.vezDoJogador();
				System.out.println(util.toString());

				if (util.jogadas < 9)
					jogada();
			}
			vencedor();
		}
	}

	private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {
		if (btn8.getText().equals("") && vencedor == false) {
			if (util.vezJogadorX == true) {
				btn8.setText("X");
				btn8.setForeground(new java.awt.Color(51, 51, 255));
				util.setCampo(2, 1);
				util.vezDoJogador();
				System.out.println(util.toString());

				if (util.jogadas < 9)
					jogada();
			}
			vencedor();
		}
	}

	private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {
		if (btn9.getText().equals("") && vencedor == false) {
			if (util.vezJogadorX == true) {
				btn9.setText("X");
				btn9.setForeground(new java.awt.Color(51, 51, 255));
				util.setCampo(2, 2);
				util.vezDoJogador();
				System.out.println(util.toString());
				if (util.jogadas < 9)
					jogada();
			}
			vencedor();
		}
	}

	private void jogada() {
		int btn = util.jogada();
		if (btn == 1){
			btn1.setText("O");
			btn1.setForeground(new java.awt.Color(255, 0, 0));
		}else if (btn == 2){
			btn2.setText("O");
			btn2.setForeground(new java.awt.Color(255, 0, 0));
		}else if (btn == 3){
			btn3.setText("O");
			btn3.setForeground(new java.awt.Color(255, 0, 0));
		}else if (btn == 4){
			btn4.setText("O");
			btn4.setForeground(new java.awt.Color(255, 0, 0));
		}else if (btn == 5){
			btn5.setText("O");
			btn5.setForeground(new java.awt.Color(255, 0, 0));
		}else if (btn == 6){
			btn6.setText("O");
			btn6.setForeground(new java.awt.Color(255, 0, 0));
		}else if (btn == 7){
			btn7.setText("O");
			btn7.setForeground(new java.awt.Color(255, 0, 0));
		}else if (btn == 8){
			btn8.setText("O");
			btn8.setForeground(new java.awt.Color(255, 0, 0));
		}else if (btn == 9){
			btn9.setText("O");
			btn9.setForeground(new java.awt.Color(255, 0, 0));
		}
	}

	private void statusBtnGroup(boolean btn) {
		btn1.setEnabled(btn);
		btn2.setEnabled(btn);
		btn3.setEnabled(btn);
		btn4.setEnabled(btn);
		btn5.setEnabled(btn);
		btn6.setEnabled(btn);
		btn7.setEnabled(btn);
		btn8.setEnabled(btn);
		btn9.setEnabled(btn);
	}

	private void vencedor() {
		if (util.vencedor == 1) {
			lblVitoriaJogador1.setText(Integer.toString(++VitoriasJogador1));
			statusBtnGroup(false);
		} else if (util.vencedor == 2) {
			lblVitoriaJogador2.setText(Integer.toString(++VitoriasJogador2));
			statusBtnGroup(false);
		} else if (util.jogadas == 9) {
			lblEmpate.setText(Integer.toString(++Empates));
			statusBtnGroup(false);
		}
	}

	private void btnNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {
		btn1.setText("");
		btn2.setText("");
		btn3.setText("");
		btn4.setText("");
		btn5.setText("");
		btn6.setText("");
		btn7.setText("");
		btn8.setText("");
		btn9.setText("");
		util = new UtilRandom(jogador);
		if (jogador == true) {
			jogada();
			jogador = false;
		} else {
			jogador = true;
		}
		vencedor = false;
		statusBtnGroup(true);
	}
	
	private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {                                        
        dispose();
    }  

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(JogoUnstoppable.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(JogoUnstoppable.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(JogoUnstoppable.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(JogoUnstoppable.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new JogoUnstoppable().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private int VitoriasJogador1 = 0;
	private int VitoriasJogador2 = 0;
	private int Empates = 0;
	private boolean jogador;
	private boolean vencedor = false;
	private javax.swing.JButton btn1;
	private javax.swing.JButton btn2;
	private javax.swing.JButton btn3;
	private javax.swing.JButton btn4;
	private javax.swing.JButton btn5;
	private javax.swing.JButton btn6;
	private javax.swing.JButton btn7;
	private javax.swing.JButton btn8;
	private javax.swing.JButton btn9;
	private javax.swing.JButton btnNovoJogo;
	private javax.swing.JButton btnSair;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JSeparator jSeparator3;
	private javax.swing.JLabel lblEmpate;
	private javax.swing.JLabel lblVitoriaJogador1;
	private javax.swing.JLabel lblVitoriaJogador2;
	// End of variables declaration
	
}