package GerenciamentoDeConsignacao;

public interface Adaptador {

	public void executarEventoCriar(ContextoGerenciamentoDeConsignacao contexto);

	public void executarEventoEditar(ContextoGerenciamentoDeConsignacao contexto);

	public void executarEventoCriarErro(ContextoGerenciamentoDeConsignacao contexto);

	public void executarEventoCriarSucesso(ContextoGerenciamentoDeConsignacao contexto);

	public void executarEventoEditarErro(ContextoGerenciamentoDeConsignacao contexto);

	public void executarEventoEditarSucesso(ContextoGerenciamentoDeConsignacao contexto);

	public void executarEventoDarBaixa(ContextoGerenciamentoDeConsignacao contextoGerenciamentoDeConsignacao);

	public void executarEventoDarBaixaSucesso(ContextoGerenciamentoDeConsignacao contextoGerenciamentoDeConsignacao);

	public void executarEventoCancelar(ContextoGerenciamentoDeConsignacao contextoGerenciamentoDeConsignacao);

}
