package RelatorioDeConsignacao;

public class ContextoRelatorioDeConsignacao {

	public Estado estado = Estado.ListandoConsignacoes;

	public void handleEvent(String evento) {
		// TODO Auto-generated method stub
		Adaptador adaptador = ProvedorDeAdaptador.getInstance();
		
		switch (evento) {
		case "EventoGerarRelatorio":
			adaptador.executarEventoGerarRelatorio(this);
			break;
		case "EventoCancelar":
			adaptador.executarEventoCancelar(this);
			break;
		case "EventoGerar":
			adaptador.executarEventoGerar(this);
			break;
		case "EventoExportar":
			adaptador.executarEventoExportar(this);
			break;
		default:
			break;
		}
	}

	public void handleEvent(String evento, Integer dataInicial2, Integer dataFinal2) {
		// TODO Auto-generated method stub
		this.handleEvent(evento);		
	}
}
