package GerenciamentoDeMateriaPrima;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdaptadorInterfaceWeb implements Adaptador {

	public static WebDriver driver;
	public static ConhecimentoDeDominioDeInterfaceWeb conhecimento;
	
	public AdaptadorInterfaceWeb() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
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
	public void executarEventoCriar(ContextoGerenciamentoDeMateriaPrima contexto) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(By.cssSelector(conhecimento.get("seletor.linkCriar"))).click();
			Thread.sleep(3000);

			contexto.estado = Estado.CriandoMateriaPrima;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail(e.getMessage());
		}
	}

	@Override
	public void executarEventoEditar(ContextoGerenciamentoDeMateriaPrima contexto) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(By.cssSelector(conhecimento.get("seletor.linkEditar"))).click();
			Thread.sleep(3000);
			
			contexto.estado = Estado.EditandoMateriaPrima;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail(e.getMessage());
		}
	}

	@Override
	public void executarEventoCriarErro(ContextoGerenciamentoDeMateriaPrima contexto) {
		this.executarEventoSalvarDadosErro(contexto, Estado.CriandoMateriaPrima, "mensagem.criarErro");
	}

	@Override
	public void executarEventoCriarSucesso(ContextoGerenciamentoDeMateriaPrima contexto) {
		this.executarEventoSalvarDadosSucesso(contexto, "mensagem.criarSucesso");
	}

	@Override
	public void executarEventoEditarErro(ContextoGerenciamentoDeMateriaPrima contexto) {
		this.executarEventoSalvarDadosErro(contexto, Estado.EditandoMateriaPrima, "mensagem.editarErro");
	}

	@Override
	public void executarEventoEditarSucesso(ContextoGerenciamentoDeMateriaPrima contexto) {
		this.executarEventoSalvarDadosSucesso(contexto, "mensagem.editarSucesso");
	}

	@Override
	public void executarEventoBuscar(ContextoGerenciamentoDeMateriaPrima contexto) {
		try {
			driver.findElement(By.cssSelector(conhecimento.get("seletor.campoConsulta")))
				.sendKeys(conhecimento.get("dado.consulta"));
			driver.findElement(By.cssSelector(conhecimento.get("seletor.linkPesquisar"))).click();
			Thread.sleep(3000);
		
			Assert.assertTrue("Os resultados foram exibidos? ", driver.findElement(By.cssSelector(conhecimento.get("seletor.item"))).isDisplayed());
			
			contexto.estado = Estado.ListandoMateriaPrima;
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@Override
	public void executarEventoDeletar(ContextoGerenciamentoDeMateriaPrima contexto) {
		try {
			driver.findElement(By.cssSelector(conhecimento.get("seletor.linkDeletar"))).click();
			Thread.sleep(3000);
			
			Assert.assertTrue("A mensagem de sucesso foi exibida? ", driver.getPageSource().contains(conhecimento.get("mensagem.deletarSucesso")));
			
			contexto.estado = Estado.ListandoMateriaPrima;
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	public void executarEventoCancelar(ContextoGerenciamentoDeMateriaPrima contexto) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(By.cssSelector(conhecimento.get("seletor.linkCancelar"))).click();
			Thread.sleep(3000);
			contexto.estado = Estado.ListandoMateriaPrima;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail(e.getMessage());
		}
	}
	
	private void executarEventoSalvarDadosErro(ContextoGerenciamentoDeMateriaPrima contexto, Estado estado, String seletorMensagem) {
		try {
			Assert.assertFalse("Os dados s�o v�lidos?", contexto.dadosValidos.booleanValue());
			
			WebElement nome = driver.findElement(By.cssSelector(conhecimento.get("seletor.campoNome")));
			nome.clear();	
			nome.sendKeys(conhecimento.get("dado.invalido.nome"));
			
			WebElement descricao = driver.findElement(By.cssSelector(conhecimento.get("seletor.campoDescricao")));
			descricao.clear();	
			descricao.sendKeys(conhecimento.get("dado.invalido.descricao"));
			
			WebElement unidade = driver.findElement(By.cssSelector(conhecimento.get("seletor.campoUnidade")));
			unidade.clear();	
			unidade.sendKeys(conhecimento.get("dado.invalido.unidade"));
					
			driver.findElement(By.cssSelector(conhecimento.get("seletor.enviarDados"))).click();
			Thread.sleep(3000);
			
			Assert.assertFalse("A mensagem de erro foi exibida? ", !driver.getPageSource().contains(conhecimento.get(seletorMensagem)));
			
			contexto.estado = estado;
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}
	
	private void executarEventoSalvarDadosSucesso(ContextoGerenciamentoDeMateriaPrima contexto, String seletorMensagem) {
		try {
			Assert.assertTrue("Os dados s�o v�lidos?", contexto.dadosValidos.booleanValue());
			
			WebElement nome = driver.findElement(By.cssSelector(conhecimento.get("seletor.campoNome")));
			nome.clear();	
			nome.sendKeys(conhecimento.get("dado.valido.nome"));
			
			WebElement descricao = driver.findElement(By.cssSelector(conhecimento.get("seletor.campoDescricao")));
			descricao.clear();	
			descricao.sendKeys(conhecimento.get("dado.valido.descricao"));
			
			WebElement unidade = driver.findElement(By.cssSelector(conhecimento.get("seletor.campoUnidade")));
			unidade.clear();	
			unidade.sendKeys(conhecimento.get("dado.valido.unidade"));
			
			driver.findElement(By.cssSelector(conhecimento.get("seletor.enviarDados"))).click();
			Thread.sleep(3000);
						
			Assert.assertFalse("A mensagem de sucesso foi exibida? ", !driver.getPageSource().contains(conhecimento.get(seletorMensagem)));
			
			contexto.estado = Estado.ListandoMateriaPrima;
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

}
