package br.com.allysoncostap.cm.modelo;

import br.com.allysoncostap.cm.visao.TabuleiroConsole;

public class Aplicacao {

	
	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(6,6,6);	
		new TabuleiroConsole(tabuleiro);
}
}