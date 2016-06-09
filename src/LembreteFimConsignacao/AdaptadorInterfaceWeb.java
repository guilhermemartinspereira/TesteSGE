package LembreteFimConsignacao;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
	public void executarEventoVerificar(ContextoLembreteFimConsignacao contexto) {
		try {
			if(contexto.data < -604800) {
				Assert.assertTrue("Os resultados normais foram exibidos? ", driver.findElement(By.cssSelector(conhecimento.get("seletor.itemNormal"))).isDisplayed());
			} else if(contexto.data < 0) {
				Assert.assertTrue("Os resultados a vencer foram exibidos? ", driver.findElement(By.cssSelector(conhecimento.get("seletor.itemAVencer"))).isDisplayed());
			} else {
				Assert.assertTrue("Os resultados vencidos foram exibidos? ", driver.findElement(By.cssSelector(conhecimento.get("seletor.itemVencido"))).isDisplayed());
			}
		
			contexto.filtroAplicado = true;
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}
}
