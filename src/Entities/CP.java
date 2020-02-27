package Entities;

public class CP {
	private String name;
	private double renda;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	public CP(String name, double renda) {
		this.name = name;
		this.renda = renda;
	}
	public CP() {		
	}
	public Double imposto() {
		return null;
	}
}
