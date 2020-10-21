package uber;

public class UberPool extends UberX{
	
	private int numPassageiros;

	public UberPool(double kmCorrida, int numPassageiros) {
		super(kmCorrida);
		this.numPassageiros = numPassageiros;
	}

	@Override
	public double getValor() {
		return super.getValor()/numPassageiros;
	}

}

