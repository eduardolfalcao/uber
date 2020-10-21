package uber;

public class UberBlack extends UberX{
	
	public UberBlack(double kmCorrida) {
		super(kmCorrida);
	}

	@Override
	public double getValor() {
		return 1.1 * super.getValor();
	}

}


