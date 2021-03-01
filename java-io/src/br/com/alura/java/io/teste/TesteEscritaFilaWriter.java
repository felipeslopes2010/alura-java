package br.com.alura.java.io.teste;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TesteEscritaFilaWriter {

	public static void main(String[] args) throws IOException {

//		// Fluxo de Entrada com Arquivo
//		FileOutputStream fos = new FileOutputStream("teste2.txt");
//		OutputStreamWriter osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		FileWriter fw = new FileWriter("teste2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		bw.write("Criando meu arquivo teste");
		bw.newLine();
		bw.write("Dentro do meu arquivo teste");
		bw.newLine();
		bw.write("Terminando meu arquivo teste");

		bw.close();
	}
}
