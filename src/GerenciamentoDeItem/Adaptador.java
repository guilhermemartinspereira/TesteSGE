package GerenciamentoDeItem;

public interface Adaptador {

	public void executarEventoCriar(Estado estado, Boolean dadosValidos);

	public void executarEventoCancelarCriacao(Estado estado, Boolean dadosValidos);

	public void executarEventoEditar(Estado estado, Boolean dadosValidos);

	public void executarEventoCancelarEdicao(Estado estado, Boolean dadosValidos);

	public void executarEventoCriarErro(Estado estado, Boolean dadosValidos);

	public void executarEventoCriarSucesso(Estado estado, Boolean dadosValidos);

	public void executarEventoEditarErro(Estado estado, Boolean dadosValidos);

	public void executarEventoEditarSucesso(Estado estado, Boolean dadosValidos);

	public void executarEventoBuscar(Estado estado, Boolean dadosValidos);

	public void executarEventoDeletar(Estado estado, Boolean dadosValidos);

}
