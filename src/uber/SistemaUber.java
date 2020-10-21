package uber;

import java.util.ArrayList;
import java.util.List;

public class SistemaUber {
	
	private List<Carona> caronas;
	
	public SistemaUber() {
		this.caronas = new ArrayList<Carona>();
	}
	
	public void addCarona(Carona carona) {
		this.caronas.add(carona);
	}
	
	public double getValorCaronas() {
		double valorTotal = 0;
		for(Carona carona: caronas)
			valorTotal += carona.getValor();
		return valorTotal;
	}
	
	public static void main(String[] args) {
		SistemaUber uber = new SistemaUber();
		uber.addCarona(new UberX(5));
		uber.addCarona(new UberBlack(8));
		uber.addCarona(new UberXVip(3.4));	
		
		System.out.println("Valor total: "+uber.getValorCaronas());
	}

}

