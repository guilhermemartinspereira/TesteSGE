package EntradaSaidaDeEstoque;

public class ContextoEntradaSaidaDeEstoque {

	public Estado estado;
	public Integer quantidade;

	public void handleEvent(String evento) {
		// TODO Auto-generated method stub
		Adaptador adaptador = ProvedorDeAdaptador.getInstance();
		
		switch (evento) {
		case "EventoGerenciarItensNoEstoque":
			adaptador.executarEventoGerenciarItensNoEstoque(this);
			break;
		case "EventoGerenciarItemExistente":
			adaptador.executarEventoGerenciarItemExistente(this);
			break;
		case "EventoAdicionarItemExistente":
			adaptador.executarEventoAdicionarItemExistente(this);
			break;
		case "EventoRemover":
			adaptador.executarEventoRemover(this);
			break;
		case "EventoAdicionar":
			adaptador.executarEventoAdicionar(this);
			break;
		case "EventoCancelar":
			adaptador.executarEventoCancelar(this);
			break;
		case "EventoBuscar":
			adaptador.executarEventoBuscar(this);
			break;
		case "EventoVoltar":
			adaptador.executarEventoVoltar(this);
			break;

		default:
			break;
		}
	}

	public void handleEvent(String string, Integer quantidade3) {
		// TODO Auto-generated method stub
		
	}

}
