package GerenciamentoDeCliente;

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
		
		mapa.put("seletor.campoDocumento", "input[name='documento']");
		mapa.put("seletor.campoNome", "input[name='nome']");
		mapa.put("seletor.campoEndereco", "input[name='endereco']");
		mapa.put("seletor.campoBairro", "input[name='bairro']");
		mapa.put("seletor.campoCidade", "input[name='cidade']");
		mapa.put("seletor.campoUf", "input[name='uf']");
		mapa.put("seletor.campoTelefone", "input[name='telefone']");
		mapa.put("seletor.campoEmail", "input[name='email']");
		
		mapa.put("seletor.campoConsulta", "input[type='search']");
		mapa.put("seletor.item", ".item");
		
		mapa.put("mensagem.editarErro", "Alguns campos estão com erros");
		mapa.put("mensagem.criarErro", "Alguns campos estão com erros");
		mapa.put("mensagem.editarSucesso", "Cliente salvo com sucesso");
		mapa.put("mensagem.criarSucesso", "Cliente criado com sucesso");
		mapa.put("mensagem.deletarSucesso", "Cliente excluído com sucesso");
		
		mapa.put("seletor.campoDocumento", "input[name='documento']");
		mapa.put("seletor.campoNome", "input[name='nome']");
		mapa.put("seletor.campoEndereco", "input[name='endereco']");
		mapa.put("seletor.campoBairro", "input[name='bairro']");
		mapa.put("seletor.campoCidade", "input[name='cidade']");
		mapa.put("seletor.campoUf", "input[name='uf']");
		mapa.put("seletor.campoTelefone", "input[name='telefone']");
		mapa.put("seletor.campoEmail", "input[name='email']");
		
		mapa.put("dado.valido.documento", "11111111111");
		mapa.put("dado.valido.nome", "jose");
		mapa.put("dado.valido.endereco", "rua x");
		mapa.put("dado.valido.bairro", "sao joao");
		mapa.put("dado.valido.cidade", "campinas");
		mapa.put("dado.valido.uf", "SP");
		mapa.put("dado.valido.telefone", "19111111111");
		mapa.put("dado.valido.email", "jose@gmail.com");
				
		mapa.put("dado.invalido.documento", "ascas");
		mapa.put("dado.invalido.nome", "");
		mapa.put("dado.invalido.endereco", "");
		mapa.put("dado.invalido.bairro", "");
		mapa.put("dado.invalido.cidade", "");
		mapa.put("dado.invalido.uf", "ascas");
		mapa.put("dado.invalido.telefone", "ascas");
		mapa.put("dado.invalido.email", "@josegmail.com");
				
		mapa.put("dado.consulta", "jose");
	}
	
	public String get(String chave) {
		return mapa.get(chave);
	}
}
