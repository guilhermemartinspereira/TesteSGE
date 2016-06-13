package GerenciamentoDeMateriaPrima;

import java.util.HashMap;
import java.util.Map;

public class ConhecimentoDeDominioDeInterfaceWeb {
	protected static Map<String, String> mapa;
	
	public ConhecimentoDeDominioDeInterfaceWeb() {
		mapa = new HashMap<>();
		
		mapa.put("url.inicio", "file:///Users/romulozanconeto/Documents/Unicamp/Disciplines/2016-1sem-Engenharia%20de%20Software%20I%20-%20MO409A/Trabalho/Development/Interface/purplefitness-interface/materia_prima.html");
			
		mapa.put("seletor.linkCriar", ".button-add");
		mapa.put("seletor.linkEditar", ".item a");
		mapa.put("seletor.linkDeletar", ".button-remove");
		mapa.put("seletor.linkCancelar", "#back-button");
		mapa.put("seletor.linkPesquisar", ".button-search");
		mapa.put("seletor.enviarDados", ".button.button-full");
		
		mapa.put("seletor.campoNome", "input[name='nome']");
		mapa.put("seletor.campoDescricao", "input[name='descricao']");
		mapa.put("seletor.campoUnidade", "input[name='unidade']");
		
		mapa.put("seletor.campoConsulta", "input[type='search']");
		mapa.put("seletor.item", ".item");
		
		mapa.put("mensagem.editarErro", "Alguns campos estao com erros");
		mapa.put("mensagem.criarErro", "Alguns campos estao com erros");
		mapa.put("mensagem.editarSucesso", "Materia-prima salva com sucesso");
		mapa.put("mensagem.criarSucesso", "Materia-prima criada com sucesso");
		mapa.put("mensagem.deletarSucesso", "Materia-prima excluida com sucesso");
		
		mapa.put("dado.valido.nome", "tecido");
		mapa.put("dado.valido.descricao", "tecido vermelho");
		mapa.put("dado.valido.unidade", "kg");

		mapa.put("dado.invalido.nome", "");
		mapa.put("dado.invalido.descricao", "");
		mapa.put("dado.invalido.unidade", "");
		
		mapa.put("dado.consulta", "tecido");
	}
	
	public String get(String chave) {
		return mapa.get(chave);
	}
}
