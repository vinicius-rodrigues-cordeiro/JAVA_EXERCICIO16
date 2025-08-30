package javaDesafio2402432;

import java.util.Scanner;
import java.lang.Math;

public class Desafio16 {

	public static void main(String[] args) {
		int hora = 60, dia = 24, ano = 365;
		System.out.println("Olá!\nPara saber quantos anos de vida, você perdeu devido ao fumo, preencha os campos indicados abaixo:");
		
		System.out.println("Quantidade de cigarros por dia");
		Scanner tc = new Scanner(System.in);
		int totalCigarrosPorDia = tc.nextInt();
		
		System.out.println("Quantidade de anos fumando");
		Scanner af = new Scanner(System.in);
		int anosFumando = af.nextInt();
		
		tc.close();
		af.close();
		
		Double diasPerdidos = (double) (totalCigarrosPorDia * (ano * anosFumando) * 10) / (hora * dia);
		System.out.println("Você perdeu: " + Math.round(diasPerdidos) + " dias de vida!");
		
		
	}

}

