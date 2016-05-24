package GerenciamentoDeEstoque;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdaptadorInterfaceWeb implements Adaptador {

	public static WebDriver driver;
	public static ConhecimentoDeDominioDeInterfaceWeb conhecimento;
	
	public AdaptadorInterfaceWeb() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		conhecimento = new ConhecimentoDeDominioDeInterfaceWeb();
		
		try {
			driver.get(conhecimento.get("url.inicio"));
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			Assert.fail(e.getMessage());
		}
	}
	
	@Override
	public void executarEventoCriar(ContextoGerenciamentoDeItem contexto) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(By.cssSelector(conhecimento.get("seletor.linkCriar"))).click();
			Thread.sleep(3000);
			
			Assert.assertEquals("O título mudou para o da tela de criação? ", conhecimento.get("titulo." + Estado.CriandoEstoque.toString()), driver.getTitle());
			
			contexto.estado = Estado.CriandoEstoque;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail(e.getMessage());
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
			Thread.sleep(3000);
			
			Assert.assertEquals("O título mudou para o da tela de edição? ", conhecimento.get("titulo." + Estado.EditandoEstoque.toString()), driver.getTitle());
			
			contexto.estado = Estado.EditandoEstoque;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail(e.getMessage());
		}
	}

	@Override
	public void executarEventoCancelarEdicao(ContextoGerenciamentoDeItem contexto) {
		this.executarEventoCancelar(contexto);
	}

	@Override
	public void executarEventoCriarErro(ContextoGerenciamentoDeItem contexto) {
		this.executarEventoSalvarDadosErro(contexto, Estado.CriandoEstoque, "mensagem.criarErro");
	}

	@Override
	public void executarEventoCriarSucesso(ContextoGerenciamentoDeItem contexto) {
		this.executarEventoSalvarDadosSucesso(contexto, "mensagem.criarSucesso");
	}

	@Override
	public void executarEventoEditarErro(ContextoGerenciamentoDeItem contexto) {
		this.executarEventoSalvarDadosErro(contexto, Estado.EditandoEstoque, "mensagem.editarErro");
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
			Thread.sleep(3000);
			
			Assert.assertEquals("O título continuou igual? ", conhecimento.get("titulo." + Estado.ListandoEstoque.toString()), driver.getTitle());
			Assert.assertTrue("Os resultados foram exibidos? ", driver.findElement(By.cssSelector(conhecimento.get("seletor.item"))).isDisplayed());
			
			contexto.estado = Estado.ListandoEstoque;
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@Override
	public void executarEventoDeletar(ContextoGerenciamentoDeItem contexto) {
		try {
			driver.findElement(By.cssSelector(conhecimento.get("seletor.linkDeletar"))).click();
			Thread.sleep(3000);
			
			Assert.assertEquals("O título continuou igual? ", conhecimento.get("titulo." + Estado.ListandoEstoque.toString()), driver.getTitle());
			Assert.assertTrue("A mensagem de sucesso foi exibida? ", driver.getPageSource().contains(conhecimento.get("mensagem.deletarSucesso")));
			
			contexto.estado = Estado.ListandoEstoque;
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	private void executarEventoCancelar(ContextoGerenciamentoDeItem contexto) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(By.cssSelector(conhecimento.get("seletor.linkCancelar"))).click();
			Thread.sleep(3000);
			
			Assert.assertEquals("O título mudou para o da tela de listagem? ", conhecimento.get("titulo." + Estado.ListandoEstoque.toString()), driver.getTitle());
			
			contexto.estado = Estado.ListandoEstoque;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail(e.getMessage());
		}
	}
	
	private void executarEventoSalvarDadosErro(ContextoGerenciamentoDeItem contexto, Estado estado, String seletorMensagem) {
		try {
			Assert.assertFalse("Os dados são válidos?", contexto.dadosValidos.booleanValue());
			
			WebElement nome = driver.findElement(By.cssSelector(conhecimento.get("seletor.campoTitulo")));
			nome.clear();	
			nome.sendKeys(conhecimento.get("dado.invalido.titulo"));
					
			driver.findElement(By.cssSelector(conhecimento.get("seletor.enviarDados"))).click();
			Thread.sleep(3000);
			
			Assert.assertEquals("O título continuou igual? ", conhecimento.get("titulo." + estado.toString()), driver.getTitle());
			
			Assert.assertFalse("A mensagem de erro foi exibida? ", !driver.getPageSource().contains(conhecimento.get(seletorMensagem)));
			
			contexto.estado = estado;
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}
	
	private void executarEventoSalvarDadosSucesso(ContextoGerenciamentoDeItem contexto, String seletorMensagem) {
		try {
			Assert.assertTrue("Os dados são válidos?", contexto.dadosValidos.booleanValue());
			
			WebElement nome = driver.findElement(By.cssSelector(conhecimento.get("seletor.campoTitulo")));
			nome.clear();	
			nome.sendKeys(conhecimento.get("dado.valido.titulo"));
			
			driver.findElement(By.cssSelector(conhecimento.get("seletor.enviarDados"))).click();
			Thread.sleep(3000);
			
			Assert.assertEquals("O título mudou para o de listagem? ", conhecimento.get("titulo." + Estado.ListandoEstoque), driver.getTitle());
			
			Assert.assertFalse("A mensagem de sucesso foi exibida? ", !driver.getPageSource().contains(conhecimento.get(seletorMensagem)));
			
			contexto.estado = Estado.ListandoEstoque;
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

}
