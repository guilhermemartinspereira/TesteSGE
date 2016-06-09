package LembreteFimConsignacao;

public class ContextoLembreteFimConsignacao {

	public Integer data;
	public Boolean filtroAplicado = true;

	public void handleEvent(String evento) {
		// TODO Auto-generated method stub
		Adaptador adaptador = ProvedorDeAdaptador.getInstance();
		
		switch (evento) {
			case "EventoBuscar":
				adaptador.executarEventoVerificar(this);
				break;
			default:
				break;
		}
	}

	public void handleEvent(String evento, Integer data) {
		// TODO Auto-generated method stub
		this.data = data;
		this.handleEvent(evento);		
	}

}
