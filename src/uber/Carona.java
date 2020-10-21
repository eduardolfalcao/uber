package uber;

public abstract class Carona {
	
	protected double kmCorrida;
	protected double precoBase;
	protected double precoKm;
	
	public Carona(double kmCorrida, double precoBase, double precoKm) {
		this.kmCorrida = kmCorrida;
		this.precoBase = precoBase;
		this.precoKm = precoKm;
	}
	
	public abstract double getValor();

}

