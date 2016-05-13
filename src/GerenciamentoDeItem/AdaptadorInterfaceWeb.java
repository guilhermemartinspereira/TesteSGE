package GerenciamentoDeItem;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdaptadorInterfaceWeb implements Adaptador {

	public static WebDriver driver;
	public static String inicio = "https://www.google.com/";
	public static Map<Estado, String> titulos;
	public static Map<String, String> selectors;
	static {
		titulos = new HashMap<>();
		titulos.put(Estado.CriandoItem, "SGE - Criação de Item");
		titulos.put(Estado.ListandoItem, "SGE - Lista de Itens");
		titulos.put(Estado.EditandoItem, "SGE - Edição de Item");
		
		selectors = new HashMap<>();
		selectors.put("Botao Criar", ".jhp input[type='submit']");
		selectors.put("Link de Item", ".item:nth-of-type(1)");
		selectors.put("Botao Deletar", ".deletar:nth-of-type(1)");
	}
	
	@Override
	public void executarEventoCriar(ContextoGerenciamentoDeItem contexto) {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.get(inicio);
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(selectors.get("Botao Criar"))).click();
			Thread.sleep(2000);
			
			Assert.assertEquals("O título mudou para o da tela de criação? ", titulos.get(Estado.CriandoItem), driver.getTitle());
			
			contexto.estado = Estado.CriandoItem;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void executarEventoCancelarCriacao(ContextoGerenciamentoDeItem contexto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void executarEventoEditar(ContextoGerenciamentoDeItem contexto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void executarEventoCancelarEdicao(ContextoGerenciamentoDeItem contexto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void executarEventoCriarErro(ContextoGerenciamentoDeItem contexto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void executarEventoCriarSucesso(ContextoGerenciamentoDeItem contexto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void executarEventoEditarErro(ContextoGerenciamentoDeItem contexto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void executarEventoEditarSucesso(ContextoGerenciamentoDeItem contexto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void executarEventoBuscar(ContextoGerenciamentoDeItem contexto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void executarEventoDeletar(ContextoGerenciamentoDeItem contexto) {
		// TODO Auto-generated method stub

	}

}
