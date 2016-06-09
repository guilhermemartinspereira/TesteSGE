package RelatorioDeConsignacao;

public interface Adaptador {

	public void executarEventoCancelar(ContextoRelatorioDeConsignacao contexto);

	public void executarEventoGerarRelatorio(ContextoRelatorioDeConsignacao contextoGerenciamentoDeMateriaPrima);

	public void executarEventoGerar(ContextoRelatorioDeConsignacao contextoGerenciamentoDeMateriaPrima);

	public void executarEventoExportar(ContextoRelatorioDeConsignacao contextoGerenciamentoDeMateriaPrima);

}
