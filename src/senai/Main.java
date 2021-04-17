package senai;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		System.out.println("--- Sistema de eventos ---");
		Usuario usuario1 = new Usuario("João Dantas");
		Usuario usuario2 = new Usuario("Maria Gonçalves");
		
		System.out.println("--- Evento 1 ---");
		EventoPresencial evento1 = new EventoPresencial("Java for Dummies", LocalDate.of(2020, 8, 10), usuario1, "SENAI/SC",20);
		evento1.addParticipante(usuario2);
		
		System.out.println("--- Evento 2 ---");
		EventoVirtual evento2 = new EventoVirtual("PostgreSQL for Dummies", LocalDate.of(2020, 9, 7), usuario2, "http://evento virtual.org.br/123");
		evento2.addParticipante(usuario2);
		
		System.out.println("--- FIM ---");

	}

}
