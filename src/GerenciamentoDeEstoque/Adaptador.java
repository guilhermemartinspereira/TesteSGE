package GerenciamentoDeEstoque;

public interface Adaptador {

	public void executarEventoCriar(ContextoGerenciamentoDeEstoque contexto);

	public void executarEventoCancelarCriacao(ContextoGerenciamentoDeEstoque contexto);

	public void executarEventoEditar(ContextoGerenciamentoDeEstoque contexto);

	public void executarEventoCancelarEdicao(ContextoGerenciamentoDeEstoque contexto);

	public void executarEventoCriarErro(ContextoGerenciamentoDeEstoque contexto);

	public void executarEventoCriarSucesso(ContextoGerenciamentoDeEstoque contexto);

	public void executarEventoEditarErro(ContextoGerenciamentoDeEstoque contexto);

	public void executarEventoEditarSucesso(ContextoGerenciamentoDeEstoque contexto);

	public void executarEventoBuscar(ContextoGerenciamentoDeEstoque contexto);

	public void executarEventoDeletar(ContextoGerenciamentoDeEstoque contexto);

}
