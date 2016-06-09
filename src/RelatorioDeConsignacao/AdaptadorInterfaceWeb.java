package RelatorioDeConsignacao;

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
	public void executarEventoGerarRelatorio(ContextoRelatorioDeConsignacao contexto) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(By.cssSelector(conhecimento.get("seletor.linkGerar"))).click();
			Thread.sleep(3000);

			contexto.estado = Estado.GerandoRelatorio;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail(e.getMessage());
		}
	}

	@Override
	public void executarEventoCancelar(ContextoRelatorioDeConsignacao contexto) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(By.cssSelector(conhecimento.get("seletor.linkCancelar"))).click();
			Thread.sleep(3000);
						
			contexto.estado = Estado.ListandoConsignacoes;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail(e.getMessage());
		}
	}
	
	@Override
	public void executarEventoGerar(ContextoRelatorioDeConsignacao contexto) {
		// TODO Auto-generated method stub
		try {
			WebElement dataInicial = driver.findElement(By.cssSelector(conhecimento.get("seletor.campoDataInicial")));
			dataInicial.clear();	
			dataInicial.sendKeys(conhecimento.get("dado.valido.dataInicial"));

			WebElement dataFinal = driver.findElement(By.cssSelector(conhecimento.get("seletor.campoDataFinal")));
			dataFinal.clear();	
			dataFinal.sendKeys(conhecimento.get("dado.valido.dataFinal"));
			
			driver.findElement(By.cssSelector(conhecimento.get("seletor.enviarDados"))).click();
			Thread.sleep(3000);
						
			contexto.estado = Estado.VisualizandoRelatorio;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail(e.getMessage());
		}
	}
	
	@Override
	public void executarEventoExportar(ContextoRelatorioDeConsignacao contexto) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(By.cssSelector(conhecimento.get("seletor.linkExportar"))).click();
			Thread.sleep(3000);
			
			Assert.assertTrue("A mensagem de sucesso foi exibida? ", driver.getPageSource().contains(conhecimento.get("mensagem.sucesso")));
			
			contexto.estado = Estado.VisualizandoRelatorio;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail(e.getMessage());
		}
	}
}
