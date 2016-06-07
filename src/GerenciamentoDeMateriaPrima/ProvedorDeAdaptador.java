package GerenciamentoDeMateriaPrima;

public class ProvedorDeAdaptador {

	private static Adaptador instance = null;
	
	private ProvedorDeAdaptador(){}
	
	public static Adaptador getInstance() {
		if(instance == null) {
			instance = new AdaptadorInterfaceWeb();
		}
		
		return instance;
	}

	public static void reset() {
		instance = new AdaptadorInterfaceWeb();
	}

}
