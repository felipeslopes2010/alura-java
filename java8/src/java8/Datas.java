package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate anoNovo = LocalDate.of(2022, Month.JANUARY, 1);
		
		int anos = anoNovo.getYear() - hoje.getYear();
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, anoNovo);
		LocalDate proximoAnoNovo = anoNovo.plusYears(1);
		System.out.println(proximoAnoNovo);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String valorFormatado = proximoAnoNovo.format(formatador);
		System.out.println(valorFormatado);
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));
		
		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println(intervalo);
	}

}
