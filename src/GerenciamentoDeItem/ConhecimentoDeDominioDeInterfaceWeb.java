package GerenciamentoDeItem;

import java.util.HashMap;
import java.util.Map;

public class ConhecimentoDeDominioDeInterfaceWeb {
	protected static Map<String, String> mapa;
	
	public ConhecimentoDeDominioDeInterfaceWeb() {
		mapa = new HashMap<>();
		
		mapa.put("url.inicio", "https://www.google.com/");
		
		mapa.put("titulo." + Estado.CriandoItem.toString(), "SGE - Criação de Item");
		mapa.put("titulo." + Estado.ListandoItem.toString(), "SGE - Lista de Itens");
		mapa.put("titulo." + Estado.EditandoItem.toString(), "SGE - Edição de Item");
		
		mapa.put("seletor.linkCriar", "input[type='submit']");
		mapa.put("seletor.linkEditar", ".item:nth-of-type(1)");
		mapa.put("seletor.linkDeletar", ".deletar:nth-of-type(1)");
		mapa.put("seletor.linkCancelar", ".cancelar");
		mapa.put("seletor.linkPesquisar", ".pesquisar");
		mapa.put("seletor.enviarDados", "input[type='submit']");
		
		mapa.put("seletor.campoNome", "input[name='nome']");
		mapa.put("seletor.campoQuantidade", "input[name='quantidade']");
		mapa.put("seletor.campoPreco", "input[name='preco']");
		mapa.put("seletor.campoUnidade", "input[name='unidade']");
		
		mapa.put("seletor.campoConsulta", "input[name='consulta']");

		mapa.put("mensagem.editarErro", "Erro ao Editar");
		mapa.put("mensagem.criarErro", "Erro ao Criar");
		mapa.put("mensagem.editarSucesso", "Editado com sucesso");
		mapa.put("mensagem.criarSucesso", "Criado com sucesso");
		mapa.put("mensagem.deletarSucesso", "Deletado com sucesso");
		
		mapa.put("dado.valido.nome", "Camiseta Florida");
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
