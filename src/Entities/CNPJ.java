package Entities;

public class CNPJ extends CP{
	private int funcionarios;

	public int getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(int funcionarios) {
		this.funcionarios = funcionarios;
	}
	public CNPJ(String name, double renda, int funcionarios) {
		super(name, renda);
		this.funcionarios = funcionarios;
	}
	@Override
	public final Double imposto() {
		if (funcionarios > 10) {
			return 0.14 * getRenda();
		}
		else {
			return 0.16 * getRenda();
		}
	}
	@Override
	public final String toString() {
		return getName() + ", R$ " + getRenda() + " e R$ " + imposto() + " de imposto, com " + funcionarios + " funcionarios.";
}
}
