package LembreteFimConsignacao;

import java.util.HashMap;
import java.util.Map;

public class ConhecimentoDeDominioDeInterfaceWeb {
	protected static Map<String, String> mapa;
	
	public ConhecimentoDeDominioDeInterfaceWeb() {
		mapa = new HashMap<>();
		
		mapa.put("url.inicio", "http://localhost:8100/#/tab/itens");
			
		
		mapa.put("seletor.itemNormal", ".item");
		mapa.put("seletor.itemAVencer", ".item a.finalizing");
		mapa.put("seletor.itemVencido", ".item a.finalized");
	}
	
	public String get(String chave) {
		return mapa.get(chave);
	}
}
