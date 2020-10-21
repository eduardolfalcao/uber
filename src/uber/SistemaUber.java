package uber;

import java.util.ArrayList;
import java.util.List;

public class SistemaUber {
	
	private List<Corrida> corridas;
	
	public SistemaUber() {
		this.corridas = new ArrayList<Corrida>();
	}
	
	public void addCorrida(Corrida corrida) {
		this.corridas.add(corrida);
	}
	
	public double getValorCorridas() {
		double valorTotal = 0;
		for(Corrida corrida: corridas)
			valorTotal += corrida.getValor();
		return valorTotal;
	}
	
	public static void main(String[] args) {
		SistemaUber uber = new SistemaUber();
		uber.addCorrida(new UberX(5));
		uber.addCorrida(new UberBlack(8));
		uber.addCorrida(new UberXVip(3.4));	
		
		System.out.println("Valor total: "+uber.getValorCorridas());
	}

}

