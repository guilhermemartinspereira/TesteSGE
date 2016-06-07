package GerenciamentoDeMateriaPrima;

import java.util.HashMap;
import java.util.Map;

public class ConhecimentoDeDominioDeInterfaceWeb {
	protected static Map<String, String> mapa;
	
	public ConhecimentoDeDominioDeInterfaceWeb() {
		mapa = new HashMap<>();
		
		mapa.put("url.inicio", "http://localhost:8100/#/tab/itens");
			
		mapa.put("seletor.linkCriar", ".button-add");
		mapa.put("seletor.linkEditar", ".item:nth-of-type(1) a");
		mapa.put("seletor.linkDeletar", ".button-remove:nth-of-type(1)");
		mapa.put("seletor.linkCancelar", ".back-button");
		mapa.put("seletor.linkPesquisar", ".button-search");
		mapa.put("seletor.enviarDados", ".button.button-full");
		
		mapa.put("seletor.campoNome", "input[name='nome']");
		mapa.put("seletor.campoDescricao", "input[name='descricao']");
		mapa.put("seletor.campoUnidade", "input[name='unidade']");
		
		mapa.put("seletor.campoConsulta", "input[type='search']");
		mapa.put("seletor.item", ".item");
		
		mapa.put("mensagem.editarErro", "Alguns campos estão com erros");
		mapa.put("mensagem.criarErro", "Alguns campos estão com erros");
		mapa.put("mensagem.editarSucesso", "Matéria-prima salva com sucesso");
		mapa.put("mensagem.criarSucesso", "Matéria-prima criada com sucesso");
		mapa.put("mensagem.deletarSucesso", "Matéria-prima excluída com sucesso");
		
		mapa.put("dado.valido.nome", "tecido");
		mapa.put("dado.valido.descricao", "tecido vermelho");
		mapa.put("dado.valido.unidade", "kg");

		mapa.put("dado.valido.nome", "");
		mapa.put("dado.valido.descricao", "");
		mapa.put("dado.valido.unidade", "");
		
		mapa.put("dado.consulta", "tecido");
	}
	
	public String get(String chave) {
		return mapa.get(chave);
	}
}
