package eletrodominio;

public class Forms {
	private int resistencia;
	private int corrente;
	private int tensao;
	
	
	public void tensaoCalculo(int corrente, int resistencia) {
		tensao = corrente * resistencia;
		System.out.println("Tensao = " + tensao);
	}
	
	public void resistenciaCalculo(int tensao, int corrente) {
		resistencia = tensao/corrente;
		System.out.println("Resistencia = " + resistencia);
	}
	
	public void correnteCalculo(int tensao, int resistencia) {
		corrente = tensao/resistencia;
		System.out.println("Corrente = " + corrente);
	}
	
	public int getCorrente() {
		return corrente;
	}
	
	public void setCorrente(int corrente) {
		this.corrente = corrente;
	}
	
	public int getTensao() {
		return tensao;
	}
	
	public void setTensao(int tensao) {
		this.tensao = tensao;
	}
	
	public int getResistencia() {
		return resistencia;
	}
	
	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	
	
	
	
}
