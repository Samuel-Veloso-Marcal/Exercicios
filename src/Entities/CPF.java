package Entities;

public class CPF extends CP{
	private double saude;
	public double getSaude() {
		return saude;
	}
	public void setSaude(double saude) {
		this.saude = saude;
	}
	public CPF(String name, double renda, double saude) {
		super(name, renda);
		this.saude = saude;
	}
	public CPF() {
		super();
	}
	@Override
	public final Double imposto() {
		double abate = 0.5 * saude;
		if (getRenda()<20000) {
			return getRenda() * 0.15 - abate;
		}
		else {
			return getRenda() * 0.25 - abate;
		}
	}
	@Override
	public final String toString() {
		return getName() + ", R$ " + getRenda() + " e R$ " + imposto() + " de imposto, com R$" + saude + "gasto em saúde.";
	}
	
}
