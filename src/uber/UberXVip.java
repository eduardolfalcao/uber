package uber;

public class UberXVip extends UberX{
	
	public UberXVip(double kmCorrida) {
		super(kmCorrida);
	}

	@Override
	public double getValor() {
		return 0.9 * super.getValor();
	}

}

