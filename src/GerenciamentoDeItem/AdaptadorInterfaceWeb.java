package GerenciamentoDeItem;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdaptadorInterfaceWeb implements Adaptador {

	public static WebDriver driver;
	public static ConhecimentoDeDominioDeInterfaceWeb conhecimento;
	
	static {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		conhecimento = new ConhecimentoDeDominioDeInterfaceWeb();

		try {
			driver.get(conhecimento.get("url.inicio"));
			driver.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void executarEventoCriar(ContextoGerenciamentoDeItem contexto) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(By.cssSelector(conhecimento.get("seletor.linkCriar"))).click();
			driver.wait();
			
			Assert.assertEquals("O título mudou para o da tela de criação? ", conhecimento.get("titulo." + Estado.CriandoItem.toString()), driver.getTitle());
			
			contexto.estado = Estado.CriandoItem;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public void executarEventoCancelarCriacao(ContextoGerenciamentoDeItem contexto) {
		this.executarEventoCancelar(contexto);
	}

	@Override
	public void executarEventoEditar(ContextoGerenciamentoDeItem contexto) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(By.cssSelector(conhecimento.get("seletor.linkEditar"))).click();
			driver.wait();
			
			Assert.assertEquals("O título mudou para o da tela de edição? ", conhecimento.get("titulo." + Estado.EditandoItem.toString()), driver.getTitle());
			
			contexto.estado = Estado.EditandoItem;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void executarEventoCancelarEdicao(ContextoGerenciamentoDeItem contexto) {
		this.executarEventoCancelar(contexto);
	}

	@Override
	public void executarEventoCriarErro(ContextoGerenciamentoDeItem contexto) {
		this.executarEventoSalvarDadosErro(contexto, Estado.CriandoItem, "mensagem.criarErro");
	}

	@Override
	public void executarEventoCriarSucesso(ContextoGerenciamentoDeItem contexto) {
		this.executarEventoSalvarDadosSucesso(contexto, "mensagem.criarSucesso");
	}

	@Override
	public void executarEventoEditarErro(ContextoGerenciamentoDeItem contexto) {
		this.executarEventoSalvarDadosErro(contexto, Estado.EditandoItem, "mensagem.editarErro");
	}

	@Override
	public void executarEventoEditarSucesso(ContextoGerenciamentoDeItem contexto) {
		this.executarEventoSalvarDadosSucesso(contexto, "mensagem.editarSucesso");
	}

	@Override
	public void executarEventoBuscar(ContextoGerenciamentoDeItem contexto) {
		try {
			driver.findElement(By.cssSelector(conhecimento.get("seletor.campoConsulta")))
				.sendKeys(conhecimento.get("dado.consulta"));
			driver.findElement(By.cssSelector(conhecimento.get("seletor.linkPesquisar"))).click();
			driver.wait();
			
			Assert.assertEquals("O título continuou igual? ", conhecimento.get("titulo." + Estado.ListandoItem), driver.getTitle());
			Assert.assertTrue("Os resultados foram exibidos? ", driver.findElement(By.cssSelector(conhecimento.get("seletor.item"))).getText().contains(conhecimento.get("dado.consulta")));
			
			contexto.estado = Estado.ListandoItem;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void executarEventoDeletar(ContextoGerenciamentoDeItem contexto) {
		try {
			driver.findElement(By.cssSelector(conhecimento.get("seletor.linkDeletar"))).click();
			driver.wait();
			
			Assert.assertEquals("O título continuou igual? ", conhecimento.get("titulo." + Estado.ListandoItem), driver.getTitle());
			Assert.assertTrue("A mensagem de sucesso foi exibida? ", driver.getPageSource().contains(conhecimento.get(conhecimento.get("mensagem.deletarSucesso"))));
			
			contexto.estado = Estado.ListandoItem;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void executarEventoCancelar(ContextoGerenciamentoDeItem contexto) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(By.cssSelector(conhecimento.get("seletor.linkCancelar"))).click();
			driver.wait();
			
			Assert.assertEquals("O título mudou para o da tela de listagem? ", conhecimento.get("titulo." + Estado.ListandoItem), driver.getTitle());
			
			contexto.estado = Estado.ListandoItem;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void executarEventoSalvarDadosErro(ContextoGerenciamentoDeItem contexto, Estado estado, String seletorMensagem) {
		try {
			Assert.assertFalse("Os dados são válidos?", contexto.dadosValidos.booleanValue());
			
			driver.findElement(By.cssSelector(conhecimento.get("seletor.campoNome")))
				.sendKeys(conhecimento.get("dado.invalido.nome"));
			driver.findElement(By.cssSelector(conhecimento.get("seletor.campoQuantidade")))
				.sendKeys(conhecimento.get("dado.invalido.quantidade"));
			driver.findElement(By.cssSelector(conhecimento.get("seletor.campoUnidade")))
				.sendKeys(conhecimento.get("dado.valido.unidade"));
			driver.findElement(By.cssSelector(conhecimento.get("seletor.campoPreco")))
				.sendKeys(conhecimento.get("dado.valido.precoVenda"));
			
			driver.findElement(By.cssSelector(conhecimento.get("seletor.enviarDados"))).click();
			driver.wait();
			
			Assert.assertEquals("O título continuou igual? ", conhecimento.get("titulo." + estado), driver.getTitle());
			
			Assert.assertFalse("A mensagem de erro foi exibida? ", !driver.getPageSource().contains(conhecimento.get(seletorMensagem)));
			
			contexto.estado = estado;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void executarEventoSalvarDadosSucesso(ContextoGerenciamentoDeItem contexto, String seletorMensagem) {
		try {
			Assert.assertFalse("Os dados são válidos?", contexto.dadosValidos.booleanValue());
			
			driver.findElement(By.cssSelector(conhecimento.get("seletor.campoNome")))
				.sendKeys(conhecimento.get("dado.valido.nome"));
			driver.findElement(By.cssSelector(conhecimento.get("seletor.campoQuantidade")))
				.sendKeys(conhecimento.get("dado.valido.quantidade"));
			driver.findElement(By.cssSelector(conhecimento.get("seletor.campoUnidade")))
				.sendKeys(conhecimento.get("dado.valido.unidade"));
			driver.findElement(By.cssSelector(conhecimento.get("seletor.campoPreco")))
				.sendKeys(conhecimento.get("dado.valido.precoVenda"));
			
			driver.findElement(By.cssSelector(conhecimento.get("seletor.enviarDados"))).click();
			driver.wait();
			
			Assert.assertEquals("O título mudou para o de listagem? ", conhecimento.get("titulo." + Estado.ListandoItem), driver.getTitle());
			
			Assert.assertFalse("A mensagem de erro foi exibida? ", !driver.getPageSource().contains(conhecimento.get(seletorMensagem)));
			
			contexto.estado = Estado.ListandoItem;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
