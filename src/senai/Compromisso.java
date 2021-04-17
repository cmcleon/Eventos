package senai;

import java.time.LocalDate;

public class Compromisso implements Agendamento{
	private String nome;
	private LocalDate data;
	
	public Compromisso(String nome, LocalDate data) {
		this.nome = nome;
		this.data = data;
	}
	
	@Override
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}	

}
