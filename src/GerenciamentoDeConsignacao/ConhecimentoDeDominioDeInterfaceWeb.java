package GerenciamentoDeConsignacao;

import java.util.HashMap;
import java.util.Map;

public class ConhecimentoDeDominioDeInterfaceWeb {
	protected static Map<String, String> mapa;
	
	public ConhecimentoDeDominioDeInterfaceWeb() {
		mapa = new HashMap<>();
		
		mapa.put("url.inicio", "http://localhost:8100/#/tab/itens");
		
		mapa.put("seletor.linkCriar", ".button-add");
		mapa.put("seletor.linkEditar", ".item:nth-of-type(1) a");
		mapa.put("seletor.linkCancelar", ".back-button");
		mapa.put("seletor.linkBaixa", ".consig .item .baixa");
		mapa.put("seletor.enviarDados", ".button.button-full");
		mapa.put("seletor.itensBaixa", "tr.item-baixa input");
				
		mapa.put("seletor.campoCliente", ".client-form-group .chosen");		
		mapa.put("seletor.resultadoCliente", ".client-form-group .result");
		mapa.put("seletor.campoEstoque", ".estoque-form-group .chosen");		
		mapa.put("seletor.resultadoEstoque", ".estoque-form-group .result");
		mapa.put("seletor.campoItem", ".item-form-group .chosen");		
		mapa.put("seletor.resultadoItem", ".item-form-group .result");
		mapa.put("seletor.campoQuantidadeItem", "table.itens td input");		
				
		mapa.put("seletor.item", ".item");
		
		mapa.put("mensagem.editarErro", "Alguns campos estão com erros");
		mapa.put("mensagem.criarErro", "Alguns campos estão com erros");
		mapa.put("mensagem.editarSucesso", "Consignação salva com sucesso");
		mapa.put("mensagem.criarSucesso", "Consignação criada com sucesso");
		mapa.put("mensagem.darBaixaSucesso", "Baixa efetuada com sucesso");
			
		mapa.put("dado.valido.cliente", "jose");
		mapa.put("dado.valido.estoque", "atacado");
		mapa.put("dado.valido.item", "camiseta");
		mapa.put("dado.valido.nome", "jose");
		mapa.put("dado.valido.quantidadeItem", "5");
		mapa.put("dado.valido.data", "29/05/2016");
		mapa.put("dados.quantidade", "1");
				
		mapa.put("dado.invalido.data", "ascas");		
				
		mapa.put("dado.consulta", "jose");
	}
	
	public String get(String chave) {
		return mapa.get(chave);
	}
}
