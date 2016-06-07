package GerenciamentoDeMateriaPrima;

public interface Adaptador {

	public void executarEventoCriar(ContextoGerenciamentoDeMateriaPrima contexto);

	public void executarEventoEditar(ContextoGerenciamentoDeMateriaPrima contexto);

	public void executarEventoCancelar(ContextoGerenciamentoDeMateriaPrima contexto);

	public void executarEventoCriarErro(ContextoGerenciamentoDeMateriaPrima contexto);

	public void executarEventoCriarSucesso(ContextoGerenciamentoDeMateriaPrima contexto);

	public void executarEventoEditarErro(ContextoGerenciamentoDeMateriaPrima contexto);

	public void executarEventoEditarSucesso(ContextoGerenciamentoDeMateriaPrima contexto);

	public void executarEventoBuscar(ContextoGerenciamentoDeMateriaPrima contexto);

	public void executarEventoDeletar(ContextoGerenciamentoDeMateriaPrima contexto);

}
