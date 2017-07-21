package br.com.money.gatway.model;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String sobrenome;

	private String cpf; 
	
	private Calendar dataNacimento;
	
	private ContaCorrente contaCorrente;
	
	private List<Operacao> operacao;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Calendar getDataNacimento() {
		return dataNacimento;
	}

	public void setDataNacimento(Calendar dataNacimento) {
		this.dataNacimento = dataNacimento;
	}

	public ContaCorrente getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(ContaCorrente contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

	public List<Operacao> getOperacao() {
		return operacao;
	}

	public void setOperacao(List<Operacao> operacao) {
		this.operacao = operacao;
	}

}
