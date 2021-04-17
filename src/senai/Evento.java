package senai;

import java.time.LocalDate;


public class Evento {
	private String nome;
	private LocalDate data;
	private Usuario organizador;
	private Usuario[] participantes;
	private int posicaoParticipantes = 0;
	private String descricao;

	public Evento(String nome, LocalDate data, Usuario organizador) {
		this.nome = nome;
		this.data = data;
		this.organizador = organizador;
		this.participantes = new Usuario[10];
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

	public void setData(LocalDate data) {
		this.data = data;
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
		this.participantes[this.posicaoParticipantes] = participante;
		this.posicaoParticipantes++;
	}

	public String listaParticipantes() {
		String lista = "";
		for (Usuario participante : participantes) {
			if (participante != null) {
				lista += participante.getNome() + "\n";
			}
		}
		return lista;
	}

	//desafio 7
	public void removerParticipante(String nomeExcluir) {		
		for (int i = 0; i < participantes.length; i++) {
			if (participantes[i].getNome()== nomeExcluir) {
				for (int j = i; j < participantes.length - 1; j++) {
					participantes[j] = participantes[j + 1];
				}
				break;
			}
		}
	}
}
