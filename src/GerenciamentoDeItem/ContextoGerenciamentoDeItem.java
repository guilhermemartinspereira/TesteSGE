package GerenciamentoDeItem;

public class ContextoGerenciamentoDeItem {

	public Estado estado;
	public Boolean dadosValidos;
	private Adaptador adaptador;
	
	public void setup(Adaptador adaptador) {
		this.adaptador = adaptador;
	}	

	public void handleEvent(String evento) {
		// TODO Auto-generated method stub
		
		switch (evento) {
		case "EventoCriar":
			adaptador.executarEventoCriar(estado, dadosValidos);
			break;
		case "EventoCancelarCriacao":
			adaptador.executarEventoCancelarCriacao(estado, dadosValidos);
			break;
		case "EventoEditar":
			adaptador.executarEventoEditar(estado, dadosValidos);
			break;
		case "EventoCancelarEdicao":
			adaptador.executarEventoCancelarEdicao(estado, dadosValidos);
			break;
		case "EventoCriarErro":
			adaptador.executarEventoCriarErro(estado, dadosValidos);
			break;
		case "EventoCriarSucesso":
			adaptador.executarEventoCriarSucesso(estado, dadosValidos);
			break;
		case "EventoEditarErro":
			adaptador.executarEventoEditarErro(estado, dadosValidos);
			break;
		case "EventoEditarSucesso":
			adaptador.executarEventoEditarSucesso(estado, dadosValidos);
			break;
		case "EventoBuscar":
			adaptador.executarEventoBuscar(estado, dadosValidos);
			break;
		case "EventoDeletar":
			adaptador.executarEventoDeletar(estado, dadosValidos);
			break;

		default:
			break;
		}
	}

}
