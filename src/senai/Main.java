package senai;

import java.time.LocalDate;

import sun.text.resources.cldr.FormatData;

public class Main {

	public static void main(String[] args) {
		System.out.println("--- Sistema de eventos ---");
		Usuario usuario1 = new Usuario("João Dantas");
		Usuario usuario2 = new Usuario("Maria Gonçalves");
		Usuario usuario3 = new Usuario("Roberto Cardoso");
		Usuario usuario4 = new Usuario("Jessica Almeida");
		Usuario usuario5 = new Usuario("Carlos Silva");
		
		System.out.println("--- Evento Presencial ---"); 
		EventoPresencial evento1 = new EventoPresencial("Java for Dummies", LocalDate.of(2020, 8, 10), usuario1, "SENAI/SC",20);
		evento1.addParticipante(usuario1);
		evento1.addParticipante(usuario2);
		evento1.setData("12/10/2020");
		
		
		System.out.println("Participantes:\n" + evento1.listaParticipantes());
		
		System.out.println("--- Evento Virtual ---");
		EventoVirtual evento2 = new EventoVirtual("PostgreSQL for Dummies", LocalDate.of(2020, 9, 7), usuario2, "http://evento virtual.org.br/123");
		evento2.addParticipante(usuario2);
		evento2.addParticipante(usuario3);
		evento2.addParticipante(usuario4);
		evento2.addParticipante(usuario5);
		
		System.out.println("Participantes:\n" + evento2.listaParticipantes());
		
//		evento2.removerParticipante("Roberto Cardoso");
		
		System.out.println("Participantes atuais - Envento Virtual:\n" + evento2.listaParticipantes());
		
		System.out.println("--- Compromisso ---");
		Compromisso compromisso = new Compromisso("Reunião de Plaejamento", LocalDate.of(2020, 10, 20));
		
		Agendamento[] agendamentos = new Agendamento[3];
		agendamentos[0] = evento1;
		agendamentos[1] = evento2;
		agendamentos[2] = compromisso;
		for (Agendamento agendamento : agendamentos) {
			System.out.println(agendamento);
			
		}
		 
		
		System.out.println("--- FIM ---");

	}

}
