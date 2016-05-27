package EntradaSaidaDeEstoque;

import java.util.HashMap;
import java.util.Map;

public class ConhecimentoDeDominioDeInterfaceWeb {
	protected static Map<String, String> mapa;
	
	public ConhecimentoDeDominioDeInterfaceWeb() {
		mapa = new HashMap<>();
		
		mapa.put("url.inicio", "http://localhost:8100/#/tab/itens");
		
		mapa.put("titulo." + Estado.GerenciandoItens.toString(), "Estoque");
		mapa.put("titulo." + Estado.IncrementandoDecrementandoQuantidade.toString(), "Incrementando/Decrementando Item");
		mapa.put("titulo." + Estado.ListandoEstoques.toString(), "Estoques");
		mapa.put("titulo." + Estado.AdicionandoItem.toString(), "Adicionando Item Existente");
		
		mapa.put("seletor.linkAbrirEstoque", ".button-open");
		mapa.put("seletor.linkIncrementarDecrementar", ".button-open");
		mapa.put("seletor.linkRemover", ".button-decrement");
		mapa.put("seletor.linkAdicionar", ".button-increment");
		mapa.put("seletor.linkCancelar", ".button-cancel");
		
		mapa.put("seletor.campoTitulo", "input[name='titulo']");
		
		mapa.put("seletor.campoConsulta", "input[type='search']");
		mapa.put("seletor.item", ".item");
		
		mapa.put("mensagem.removerSucesso", "Item removido com sucesso");
		mapa.put("mensagem.removerErro", "Erro ao remover item");
		mapa.put("mensagem.adicionarSucesso", "Item adicionado com sucesso");
		mapa.put("mensagem.adicioanrErro", "Erro ao adicionar item");
		
		mapa.put("dado.valido.titulo", "varejo");
		
		mapa.put("dado.invalido.titulo", "");
		
		mapa.put("dado.consulta", "varejo");
	}
	
	public String get(String chave) {
		return mapa.get(chave);
	}
}
