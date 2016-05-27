package EntradaSaidaDeEstoque;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import GerenciamentoDeEstoque.Estado;

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
	public void executarEventoGerenciarItensNoEstoque(ContextoEntradaSaidaDeEstoque contexto) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(By.cssSelector(conhecimento.get("seletor.linkAbrirEstoque"))).click();
			Thread.sleep(3000);
			
			Assert.assertEquals("O título mudou para o da tela do estoque? ", conhecimento.get("titulo." + Estado.GerenciandoItens.toString()), driver.getTitle());
			
			contexto.estado = Estado.GerenciandoItens;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail(e.getMessage());
		}
	}

	@Override
	public void executarEventoGerenciarItemExistente(ContextoEntradaSaidaDeEstoque contexto) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(By.cssSelector(conhecimento.get("seletor.linkIncrementarDecrementar"))).click();
			Thread.sleep(3000);
			
			Assert.assertEquals("O título mudou para o da tela de gerenciamento de item existente? ", conhecimento.get("titulo." + Estado.IncrementandoDecrementandoQuantidade.toString()), driver.getTitle());
			
			contexto.estado = Estado.IncrementandoDecrementandoQuantidade;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail(e.getMessage());
		}
	}

	@Override
	public void executarEventoRemover(ContextoEntradaSaidaDeEstoque contexto) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(By.cssSelector(conhecimento.get("seletor.linkRemover"))).click();
			Thread.sleep(3000);
			
			if(contexto.quantidade > 0) {
				Assert.assertEquals("O título mudou para o da tela de gerenciamento de itens? ", conhecimento.get("titulo." + Estado.GerenciandoItens.toString()), driver.getTitle());
				Assert.assertTrue("A mensagem de sucesso foi exibida? ", driver.getPageSource().contains(conhecimento.get("mensagem.removerSucesso")));
				contexto.estado = Estado.GerenciandoItens;				
			} else {
				Assert.assertEquals("O título continua igual? ", conhecimento.get("titulo." + Estado.IncrementandoDecrementandoQuantidade.toString()), driver.getTitle());
				Assert.assertTrue("A mensagem de sucesso foi exibida? ", driver.getPageSource().contains(conhecimento.get("mensagem.removerErro")));
				contexto.estado = Estado.IncrementandoDecrementandoQuantidade;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail(e.getMessage());
		}
	}

	@Override
	public void executarEventoAdicionar(ContextoEntradaSaidaDeEstoque contexto) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(By.cssSelector(conhecimento.get("seletor.linkAdicionar"))).click();
			Thread.sleep(3000);
			
			Estado aux = contexto.estado;
			
			if(contexto.quantidade > 0) {
				Assert.assertEquals("O título mudou para o da tela de gerenciamento de itens? ", conhecimento.get("titulo." + Estado.GerenciandoItens.toString()), driver.getTitle());
				Assert.assertTrue("A mensagem de sucesso foi exibida? ", driver.getPageSource().contains(conhecimento.get("mensagem.adicionarSucesso")));
				contexto.estado = Estado.GerenciandoItens;				
			} else {
				Assert.assertEquals("O título continua igual? ", conhecimento.get("titulo." + aux.toString()), driver.getTitle());
				Assert.assertTrue("A mensagem de sucesso foi exibida? ", driver.getPageSource().contains(conhecimento.get("mensagem.adicionarErro")));
				contexto.estado = aux;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail(e.getMessage());
		}
	}

	@Override
	public void executarEventoCancelar(ContextoEntradaSaidaDeEstoque contexto) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(By.cssSelector(conhecimento.get("seletor.linkCancelar"))).click();
			Thread.sleep(3000);
			
			Assert.assertEquals("O título mudou para o da tela de gerenciamento de item existente? ", conhecimento.get("titulo." + Estado.GerenciandoItens.toString()), driver.getTitle());
			
			contexto.estado = Estado.GerenciandoItens;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail(e.getMessage());
		}
	}

	@Override
	public void executarEventoBuscar(ContextoEntradaSaidaDeEstoque contextoEntradaSaidaDeEstoque) {
		// TODO Auto-generated method stub
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
	public void executarEventoVoltar(ContextoEntradaSaidaDeEstoque contextoEntradaSaidaDeEstoque) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executarEventoAdicionarItemExistente(ContextoEntradaSaidaDeEstoque contextoEntradaSaidaDeEstoque) {
		// TODO Auto-generated method stub
		
	}
	

}
