package br.com.money.gatway.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Operacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

	private ContaCorrente contaCorrente;
	
	private ContaPoupanca contaPoupanca;
	
	private BigDecimal valor;
	private TipoOperacao tipoOperacao;
	
	
	private void Poupanca() {

	}
	
	public TipoOperacao getTipoOperacao() {
		return tipoOperacao;
	}
	
	public void setTipoOperacao(TipoOperacao tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}
	
	public ContaCorrente getContaCorrente() {
		return contaCorrente;
	}
	
	public void setContaCorrente(ContaCorrente contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
	
	public ContaPoupanca getContaPoupanca() {
		return contaPoupanca;
	}
	
	public void setContaPoupanca(ContaPoupanca contaPoupanca) {
		this.contaPoupanca = contaPoupanca;
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
}
