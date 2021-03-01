package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

//		// Fluxo de Entrada com Arquivo
//		FileOutputStream fos = new FileOutputStream("teste2.txt");
//		OutputStreamWriter osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		//PrintStream ps = new PrintStream(new File("teste2.txt"));
		PrintWriter ps = new PrintWriter("teste2.txt", "UTF-8");
		
		
		
		ps.println("Testando PrintStream");
		ps.println();
		ps.println("Continuando Teste");
		ps.println();
		ps.println("Finalizando Teste");
		
		ps.close();
	}
}
