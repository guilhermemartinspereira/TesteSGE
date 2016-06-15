package RelatorioDeConsignacao;

public interface Adaptador {

	public void executarEventoCancelar(ContextoRelatorioDeConsignacao contexto);

	public void executarEventoGerarRelatorio(ContextoRelatorioDeConsignacao contexto);

	public void executarEventoGerar(ContextoRelatorioDeConsignacao contexto);

	public void executarEventoExportar(ContextoRelatorioDeConsignacao contexto);

}
