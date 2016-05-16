package GerenciamentoDeItem;

import java.util.HashMap;
import java.util.Map;

public class ConhecimentoDeDominioDeInterfaceWeb {
	protected static Map<String, String> mapa;
	
	public ConhecimentoDeDominioDeInterfaceWeb() {
		mapa = new HashMap<>();
		
		mapa.put("url.inicio", "http://localhost:8100/#/tab/itens");
		
		mapa.put("titulo." + Estado.CriandoItem.toString(), "Item");
		mapa.put("titulo." + Estado.ListandoItem.toString(), "Itens");
		mapa.put("titulo." + Estado.EditandoItem.toString(), "Item");
		
		mapa.put("seletor.linkCriar", ".button-add");
		mapa.put("seletor.linkEditar", ".item:nth-of-type(1) a");
		mapa.put("seletor.linkDeletar", ".button-remove:nth-of-type(1)");
		mapa.put("seletor.linkCancelar", ".back-button");
		mapa.put("seletor.linkPesquisar", ".button-search");
		mapa.put("seletor.enviarDados", ".button.button-full");
		
		mapa.put("seletor.campoNome", "input[name='nome']");
		mapa.put("seletor.campoPreco", "input[name='preco']");
		mapa.put("seletor.campoUnidade", "input[name='unidade']");
		
		mapa.put("seletor.campoConsulta", "input[type='search']");
		mapa.put("seletor.item", ".item");
		
		mapa.put("mensagem.editarErro", "Alguns campos estão com erros");
		mapa.put("mensagem.criarErro", "Alguns campos estão com erros");
		mapa.put("mensagem.editarSucesso", "Item salvo com sucesso");
		mapa.put("mensagem.criarSucesso", "Item criado com sucesso");
		mapa.put("mensagem.deletarSucesso", "Item excluído com sucesso");
		
		mapa.put("dado.valido.nome", "camiseta");
		mapa.put("dado.valido.quantidade", "50");
		mapa.put("dado.valido.unidade", "UN");
		mapa.put("dado.valido.precoVenda", "50,00");
		
		mapa.put("dado.invalido.nome", "");
		mapa.put("dado.invalido.quantidade", "X");
		mapa.put("dado.invalido.unidade", "");
		mapa.put("dado.invalido.precoVenda", "X");
		
		mapa.put("dado.consulta", "camiseta");
	}
	
	public String get(String chave) {
		return mapa.get(chave);
	}
}
