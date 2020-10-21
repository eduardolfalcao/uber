package uber;

public class UberX extends Carona {

	public UberX(double kmCorrida) {
		super(kmCorrida, 4, 1.2);
	}

	@Override
	public double getValor() {
		return super.precoBase + super.kmCorrida * super.precoKm;
	}

}

