package GerenciamentoDeItem;

public class ContextoGerenciamentoDeItem {

	public Estado estado = Estado.ListandoItem;
	public Boolean dadosValidos;

	public void handleEvent(String evento) {
		// TODO Auto-generated method stub
		Adaptador adaptador = ProvedorDeAdaptador.getInstance();
		
		switch (evento) {
		case "EventoCriar":
			adaptador.executarEventoCriar(this);
			break;
		case "EventoCancelarCriacao":
			adaptador.executarEventoCancelarCriacao(this);
			break;
		case "EventoEditar":
			adaptador.executarEventoEditar(this);
			break;
		case "EventoCancelarEdicao":
			adaptador.executarEventoCancelarEdicao(this);
			break;
		case "EventoCriarErro":
			adaptador.executarEventoCriarErro(this);
			break;
		case "EventoCriarSucesso":
			adaptador.executarEventoCriarSucesso(this);
			break;
		case "EventoEditarErro":
			adaptador.executarEventoEditarErro(this);
			break;
		case "EventoEditarSucesso":
			adaptador.executarEventoEditarSucesso(this);
			break;
		case "EventoBuscar":
			adaptador.executarEventoBuscar(this);
			break;
		case "EventoDeletar":
			adaptador.executarEventoDeletar(this);
			break;

		default:
			break;
		}
	}

	public void handleEvent(String evento, Boolean dadosValidos) {
		// TODO Auto-generated method stub
		this.dadosValidos = dadosValidos;
		this.handleEvent(evento);		
	}

}
