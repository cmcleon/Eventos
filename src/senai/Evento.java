package senai;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Evento implements Agendamento {
	private String nome;
	private LocalDate data;
	private Usuario organizador;
	private List<Usuario> participantes;
//	private int posicaoParticipantes = 0;
	private String descricao;

	/**
	 * Construtor padrão
	 * 
	 * @param nome        nome do evento
	 * @param data        data do evento
	 * @param organizador organizador do evento
	 */

	public Evento(String nome, LocalDate data, Usuario organizador) {
		this.nome = nome;
		this.data = data;
		this.organizador = organizador;
		this.participantes = new ArrayList<Usuario>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(String data) {
		String format = "dd/MM/yyyy";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		this.data = LocalDate.parse(data, formatter);
	}

	public Usuario getOrganizador() {
		return organizador;
	}

	public void setOrganizador(Usuario organizador) {
		this.organizador = organizador;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void addParticipante(Usuario participante) {
		this.participantes.add(participante);
//		this.participantes[this.posicaoParticipantes] = participante;
//		this.posicaoParticipantes++;
	}

	@Override
	public String toString() {
		return "Evento [nome=" + nome + ", data=" + data + ", organizador=" + organizador + "]";
	}

	public String listaParticipantes() {
		String lista = "";
		for (Usuario participante : participantes) {
			if (participante != null) {
				lista += participante.getNome() + "\n";
			}
		return lista;
		}
		return lista;
	}

	public int getQuantidadeParticipantes() {
		return this.participantes.size();
	}

}

// desafio 7
//	public void removerParticipante(String nomeExcluir) {		
//		for (int i = 0; i < participantes.length; i++) {
//			if (participantes[i].getNome()== nomeExcluir) {
//				for (int j = i; j < participantes.length - 1; j++) {
//					participantes[j] = participantes[j + 1];
//				}
//				break;
//			}
