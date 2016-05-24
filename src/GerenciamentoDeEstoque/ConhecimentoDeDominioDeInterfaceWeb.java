package GerenciamentoDeEstoque;

import java.util.HashMap;
import java.util.Map;

public class ConhecimentoDeDominioDeInterfaceWeb {
	protected static Map<String, String> mapa;
	
	public ConhecimentoDeDominioDeInterfaceWeb() {
		mapa = new HashMap<>();
		
		mapa.put("url.inicio", "http://localhost:8100/#/tab/itens");
		
		mapa.put("titulo." + Estado.CriandoEstoque.toString(), "Estoque");
		mapa.put("titulo." + Estado.ListandoEstoque.toString(), "Estoques");
		mapa.put("titulo." + Estado.EditandoEstoque.toString(), "Estoque");
		
		mapa.put("seletor.linkCriar", ".button-add");
		mapa.put("seletor.linkEditar", ".item:nth-of-type(1) a");
		mapa.put("seletor.linkDeletar", ".button-remove:nth-of-type(1)");
		mapa.put("seletor.linkCancelar", ".back-button");
		mapa.put("seletor.linkPesquisar", ".button-search");
		mapa.put("seletor.enviarDados", ".button.button-full");
		
		mapa.put("seletor.campoTitulo", "input[name='titulo']");
		
		mapa.put("seletor.campoConsulta", "input[type='search']");
		mapa.put("seletor.item", ".item");
		
		mapa.put("mensagem.editarErro", "Alguns campos estão com erros");
		mapa.put("mensagem.criarErro", "Alguns campos estão com erros");
		mapa.put("mensagem.editarSucesso", "Estoque salvo com sucesso");
		mapa.put("mensagem.criarSucesso", "Estoque criado com sucesso");
		mapa.put("mensagem.deletarSucesso", "Estoque excluído com sucesso");
		
		mapa.put("dado.valido.titulo", "varejo");
		
		mapa.put("dado.invalido.titulo", "");
		
		mapa.put("dado.consulta", "varejo");
	}
	
	public String get(String chave) {
		return mapa.get(chave);
	}
}
