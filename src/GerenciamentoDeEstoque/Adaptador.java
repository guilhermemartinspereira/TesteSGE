package GerenciamentoDeEstoque;

public interface Adaptador {

	public void executarEventoCriar(ContextoGerenciamentoDeItem contexto);

	public void executarEventoCancelarCriacao(ContextoGerenciamentoDeItem contexto);

	public void executarEventoEditar(ContextoGerenciamentoDeItem contexto);

	public void executarEventoCancelarEdicao(ContextoGerenciamentoDeItem contexto);

	public void executarEventoCriarErro(ContextoGerenciamentoDeItem contexto);

	public void executarEventoCriarSucesso(ContextoGerenciamentoDeItem contexto);

	public void executarEventoEditarErro(ContextoGerenciamentoDeItem contexto);

	public void executarEventoEditarSucesso(ContextoGerenciamentoDeItem contexto);

	public void executarEventoBuscar(ContextoGerenciamentoDeItem contexto);

	public void executarEventoDeletar(ContextoGerenciamentoDeItem contexto);

}
