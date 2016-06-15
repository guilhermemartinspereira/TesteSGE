package RelatorioDeConsignacao;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ConhecimentoDeDominioDeInterfaceWeb {
	protected static Map<String, String> mapa;
	
	public ConhecimentoDeDominioDeInterfaceWeb() {
		mapa = new HashMap<>();
		
		mapa.put("url.inicio", "file:///Users/romulozanconeto/Documents/Unicamp/Disciplines/2016-1sem-Engenharia%20de%20Software%20I%20-%20MO409A/Trabalho/Development/Interface/purplefitness-interface/consignacao_relatorio.html");
			
		mapa.put("seletor.linkGerarRelatorio", ".button-generate");
		mapa.put("seletor.linkGerar", ".button-generate");
		mapa.put("seletor.linkExportar", ".button-export");
		mapa.put("seletor.linkCancelar", ".back-button");
		mapa.put("seletor.enviarDados", ".button.button-full");
		
		mapa.put("seletor.campoDataInicial", "input[name='data-inicial']");
		mapa.put("seletor.campoDataFinal", "input[name='data-final']");

		mapa.put("mensagem.sucesso", "Relatorio exportado com sucesso");
		
		Date dataFinal = new Date(System.currentTimeMillis());
		Date dataInicial = new Date(System.currentTimeMillis()-30*24*60*60*1000);
		
		mapa.put("dado.valido.dataInicial", "09/06/2016");
		mapa.put("dado.valido.dataFinal", "14/06/2016");
		
	}
	
	public String get(String chave) {
		return mapa.get(chave);
	}
}
