package GerenciamentoDeConsignacao;

import java.util.HashMap;
import java.util.Map;

public class ConhecimentoDeDominioDeInterfaceWeb {
	protected static Map<String, String> mapa;
	
	public ConhecimentoDeDominioDeInterfaceWeb() {
		mapa = new HashMap<>();
		
		mapa.put("url.inicio", "file:///Users/romulozanconeto/Documents/Unicamp/Disciplines/2016-1sem-Engenharia%20de%20Software%20I%20-%20MO409A/Trabalho/Development/Interface/purplefitness-interface/consignacao.html");
		
		mapa.put("seletor.linkCriar", ".button-add");
		mapa.put("seletor.linkEditar", ".item a.linkEditar");
		mapa.put("seletor.linkCancelar", ".back-button");
		mapa.put("seletor.linkBaixa", ".consig .item .baixa");
		mapa.put("seletor.enviarDados", ".button.button-full");
		mapa.put("seletor.salvarDados", "#salvarDados");
		mapa.put("seletor.inserir", "#buttonInsert");
		mapa.put("seletor.itensBaixa", "tr.item-baixa input");
				
		mapa.put("seletor.campoCliente", "select[name='cliente']");		
		mapa.put("seletor.resultadoCliente", ".client-form-group .result");
		mapa.put("seletor.campoEstoque", "#estoque");		
		mapa.put("seletor.resultadoEstoque", ".estoque-form-group .result");
		mapa.put("seletor.campoItem", "#item");		
		mapa.put("seletor.resultadoItem", ".item-form-group .result");
		mapa.put("seletor.campoData", "#finalDate");
		mapa.put("seletor.campoQuantidadeItem", "#quantidadeItem");
				
		mapa.put("seletor.item", ".item");
		
		mapa.put("mensagem.editarErro", "Alguns campos estao com erros");
		mapa.put("mensagem.criarErro", "Alguns campos estao com erros");
		mapa.put("mensagem.editarSucesso", "Consignacao salva com sucesso");
		mapa.put("mensagem.criarSucesso", "Consignacao criada com sucesso");
		mapa.put("mensagem.darBaixaSucesso", "Baixa efetuada com sucesso");
			
		mapa.put("dado.valido.cliente", "jose");
		mapa.put("dado.valido.estoque", "Atacado");
		mapa.put("dado.valido.item", "camiseta");
		mapa.put("dado.valido.nome", "jose");
		mapa.put("dado.valido.quantidadeItem", "5");
		mapa.put("dado.valido.data", "29/05/2016");
		mapa.put("dados.quantidade", "1");
				
		mapa.put("dado.invalido.data", "");		
				
		mapa.put("dado.consulta", "jose");
	}
	
	public String get(String chave) {
		return mapa.get(chave);
	}
}
