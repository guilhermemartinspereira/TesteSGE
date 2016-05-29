package GerenciamentoDeCliente;

public interface Adaptador {

	public void executarEventoCriar(ContextoGerenciamentoDeCliente contexto);

	public void executarEventoCancelarCriacao(ContextoGerenciamentoDeCliente contexto);

	public void executarEventoEditar(ContextoGerenciamentoDeCliente contexto);

	public void executarEventoCancelarEdicao(ContextoGerenciamentoDeCliente contexto);

	public void executarEventoCriarErro(ContextoGerenciamentoDeCliente contexto);

	public void executarEventoCriarSucesso(ContextoGerenciamentoDeCliente contexto);

	public void executarEventoEditarErro(ContextoGerenciamentoDeCliente contexto);

	public void executarEventoEditarSucesso(ContextoGerenciamentoDeCliente contexto);

	public void executarEventoBuscar(ContextoGerenciamentoDeCliente contexto);

	public void executarEventoDeletar(ContextoGerenciamentoDeCliente contexto);

}
