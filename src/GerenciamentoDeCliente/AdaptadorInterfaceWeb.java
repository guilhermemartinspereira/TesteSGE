package GerenciamentoDeCliente;

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
	public void executarEventoCriar(ContextoGerenciamentoDeCliente contexto) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(By.cssSelector(conhecimento.get("seletor.linkCriar"))).click();
			Thread.sleep(3000);
			
			Assert.assertEquals("O título mudou para o da tela de criação? ", conhecimento.get("titulo." + Estado.CriandoCliente.toString()), driver.getTitle());
			
			contexto.estado = Estado.CriandoCliente;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail(e.getMessage());
		}
	}

	@Override
	public void executarEventoCancelarCriacao(ContextoGerenciamentoDeCliente contexto) {
		this.executarEventoCancelar(contexto);
	}

	@Override
	public void executarEventoEditar(ContextoGerenciamentoDeCliente contexto) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(By.cssSelector(conhecimento.get("seletor.linkEditar"))).click();
			Thread.sleep(3000);
			
			Assert.assertEquals("O título mudou para o da tela de edição? ", conhecimento.get("titulo." + Estado.EditandoCliente.toString()), driver.getTitle());
			
			contexto.estado = Estado.EditandoCliente;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail(e.getMessage());
		}
	}

	@Override
	public void executarEventoCancelarEdicao(ContextoGerenciamentoDeCliente contexto) {
		this.executarEventoCancelar(contexto);
	}

	@Override
	public void executarEventoCriarErro(ContextoGerenciamentoDeCliente contexto) {
		this.executarEventoSalvarDadosErro(contexto, Estado.CriandoCliente, "mensagem.criarErro");
	}

	@Override
	public void executarEventoCriarSucesso(ContextoGerenciamentoDeCliente contexto) {
		this.executarEventoSalvarDadosSucesso(contexto, "mensagem.criarSucesso");
	}

	@Override
	public void executarEventoEditarErro(ContextoGerenciamentoDeCliente contexto) {
		this.executarEventoSalvarDadosErro(contexto, Estado.EditandoCliente, "mensagem.editarErro");
	}

	@Override
	public void executarEventoEditarSucesso(ContextoGerenciamentoDeCliente contexto) {
		this.executarEventoSalvarDadosSucesso(contexto, "mensagem.editarSucesso");
	}

	@Override
	public void executarEventoBuscar(ContextoGerenciamentoDeCliente contexto) {
		try {
			driver.findElement(By.cssSelector(conhecimento.get("seletor.campoConsulta")))
				.sendKeys(conhecimento.get("dado.consulta"));
			driver.findElement(By.cssSelector(conhecimento.get("seletor.linkPesquisar"))).click();
			Thread.sleep(3000);
			
			Assert.assertEquals("O título continuou igual? ", conhecimento.get("titulo." + Estado.ListandoClientes.toString()), driver.getTitle());
			Assert.assertTrue("Os resultados foram exibidos? ", driver.findElement(By.cssSelector(conhecimento.get("seletor.item"))).isDisplayed());
			
			contexto.estado = Estado.ListandoClientes;
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@Override
	public void executarEventoDeletar(ContextoGerenciamentoDeCliente contexto) {
		try {
			driver.findElement(By.cssSelector(conhecimento.get("seletor.linkDeletar"))).click();
			Thread.sleep(3000);
			
			Assert.assertEquals("O título continuou igual? ", conhecimento.get("titulo." + Estado.ListandoClientes.toString()), driver.getTitle());
			Assert.assertTrue("A mensagem de sucesso foi exibida? ", driver.getPageSource().contains(conhecimento.get("mensagem.deletarSucesso")));
			
			contexto.estado = Estado.ListandoClientes;
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	private void executarEventoCancelar(ContextoGerenciamentoDeCliente contexto) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(By.cssSelector(conhecimento.get("seletor.linkCancelar"))).click();
			Thread.sleep(3000);
			
			Assert.assertEquals("O título mudou para o da tela de listagem? ", conhecimento.get("titulo." + Estado.ListandoClientes.toString()), driver.getTitle());
			
			contexto.estado = Estado.ListandoClientes;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail(e.getMessage());
		}
	}
	
	private void executarEventoSalvarDadosErro(ContextoGerenciamentoDeCliente contexto, Estado estado, String seletorMensagem) {
		try {
			Assert.assertFalse("Os dados são válidos?", contexto.dadosValidos.booleanValue());
			
			WebElement nome = driver.findElement(By.cssSelector(conhecimento.get("seletor.campoNome")));
			nome.clear();	
			nome.sendKeys(conhecimento.get("dado.invalido.nome"));
			
			WebElement doc = driver.findElement(By.cssSelector(conhecimento.get("seletor.campoDocumento")));
			doc.clear();	
			doc.sendKeys(conhecimento.get("dado.invalido.documento"));
			
			WebElement end = driver.findElement(By.cssSelector(conhecimento.get("seletor.campoEndereco")));
			end.clear();	
			end.sendKeys(conhecimento.get("dado.invalido.endereco"));
			
			WebElement bairro = driver.findElement(By.cssSelector(conhecimento.get("seletor.campoBairro")));
			bairro.clear();	
			bairro.sendKeys(conhecimento.get("dado.invalido.bairro"));
			
			WebElement city = driver.findElement(By.cssSelector(conhecimento.get("seletor.campoCidade")));
			city.clear();	
			city.sendKeys(conhecimento.get("dado.invalido.cidade"));
			
			WebElement uf = driver.findElement(By.cssSelector(conhecimento.get("seletor.campoUf")));
			uf.clear();	
			uf.sendKeys(conhecimento.get("dado.invalido.uf"));
			
			WebElement fone = driver.findElement(By.cssSelector(conhecimento.get("seletor.campoTelefone")));
			fone.clear();	
			fone.sendKeys(conhecimento.get("dado.invalido.telefone"));
			
			WebElement mail = driver.findElement(By.cssSelector(conhecimento.get("seletor.campoEmail")));
			mail.clear();	
			mail.sendKeys(conhecimento.get("dado.invalido.email"));
			
			driver.findElement(By.cssSelector(conhecimento.get("seletor.enviarDados"))).click();
			Thread.sleep(3000);
			
			Assert.assertEquals("O título continuou igual? ", conhecimento.get("titulo." + estado.toString()), driver.getTitle());
			
			Assert.assertFalse("A mensagem de erro foi exibida? ", !driver.getPageSource().contains(conhecimento.get(seletorMensagem)));
			
			contexto.estado = estado;
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}
	
	private void executarEventoSalvarDadosSucesso(ContextoGerenciamentoDeCliente contexto, String seletorMensagem) {
		try {
			Assert.assertTrue("Os dados são válidos?", contexto.dadosValidos.booleanValue());
			
			WebElement nome = driver.findElement(By.cssSelector(conhecimento.get("seletor.campoNome")));
			nome.clear();	
			nome.sendKeys(conhecimento.get("dado.valido.nome"));
			
			WebElement doc = driver.findElement(By.cssSelector(conhecimento.get("seletor.campoDocumento")));
			doc.clear();	
			doc.sendKeys(conhecimento.get("dado.valido.documento"));
			
			WebElement end = driver.findElement(By.cssSelector(conhecimento.get("seletor.campoEndereco")));
			end.clear();	
			end.sendKeys(conhecimento.get("dado.valido.endereco"));
			
			WebElement bairro = driver.findElement(By.cssSelector(conhecimento.get("seletor.campoBairro")));
			bairro.clear();	
			bairro.sendKeys(conhecimento.get("dado.valido.bairro"));
			
			WebElement city = driver.findElement(By.cssSelector(conhecimento.get("seletor.campoCidade")));
			city.clear();	
			city.sendKeys(conhecimento.get("dado.valido.cidade"));
			
			WebElement uf = driver.findElement(By.cssSelector(conhecimento.get("seletor.campoUf")));
			uf.clear();	
			uf.sendKeys(conhecimento.get("dado.valido.uf"));
			
			WebElement fone = driver.findElement(By.cssSelector(conhecimento.get("seletor.campoTelefone")));
			fone.clear();	
			fone.sendKeys(conhecimento.get("dado.valido.telefone"));
			
			WebElement mail = driver.findElement(By.cssSelector(conhecimento.get("seletor.campoEmail")));
			mail.clear();	
			mail.sendKeys(conhecimento.get("dado.valido.email"));
			
			driver.findElement(By.cssSelector(conhecimento.get("seletor.enviarDados"))).click();
			Thread.sleep(3000);
			
			Assert.assertEquals("O título mudou para o de listagem? ", conhecimento.get("titulo." + Estado.ListandoClientes), driver.getTitle());
			
			Assert.assertFalse("A mensagem de sucesso foi exibida? ", !driver.getPageSource().contains(conhecimento.get(seletorMensagem)));
			
			contexto.estado = Estado.ListandoClientes;
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

}
