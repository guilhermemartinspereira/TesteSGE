package EntradaSaidaDeEstoque;

import org.junit.*;
import static org.junit.Assert.*;

// JUnit 4.3
public class TestCases{
	
	public static junit.framework.Test suite(){
		return new junit.framework.JUnit4TestAdapter(TestCases.class);
	}
	
	@Test
	public void test1()
	{
		ContextoEntradaSaidaDeEstoque oTestObject = new ContextoEntradaSaidaDeEstoque();
		Integer quantidade3 = -882417;
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoques));
		oTestObject.handleEvent("EventoGerenciarItensNoEstoque");
		assertEquals(true, (oTestObject.estado == Estado.GerenciandoItens));
		oTestObject.handleEvent("EventoGerenciarItemExistente");
		assertEquals(true, (oTestObject.estado == Estado.IncrementandoDecrementandoQuantidade));
		assertEquals(true, (quantidade3.intValue() <= 0));
		oTestObject.handleEvent("EventoRemover", quantidade3);
		assertEquals(true, (oTestObject.estado == Estado.IncrementandoDecrementandoQuantidade));
		
	}
	
	@Test
	public void test2()
	{
		ContextoEntradaSaidaDeEstoque oTestObject = new ContextoEntradaSaidaDeEstoque();
		Integer quantidade3 = 0;
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoques));
		oTestObject.handleEvent("EventoGerenciarItensNoEstoque");
		assertEquals(true, (oTestObject.estado == Estado.GerenciandoItens));
		oTestObject.handleEvent("EventoGerenciarItemExistente");
		assertEquals(true, (oTestObject.estado == Estado.IncrementandoDecrementandoQuantidade));
		assertEquals(true, (quantidade3.intValue() <= 0));
		oTestObject.handleEvent("EventoRemover", quantidade3);
		assertEquals(true, (oTestObject.estado == Estado.IncrementandoDecrementandoQuantidade));
		
	}
	
	@Test
	public void test3()
	{
		ContextoEntradaSaidaDeEstoque oTestObject = new ContextoEntradaSaidaDeEstoque();
		Integer quantidade3 = -29959;
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoques));
		oTestObject.handleEvent("EventoGerenciarItensNoEstoque");
		assertEquals(true, (oTestObject.estado == Estado.GerenciandoItens));
		oTestObject.handleEvent("EventoGerenciarItemExistente");
		assertEquals(true, (oTestObject.estado == Estado.IncrementandoDecrementandoQuantidade));
		assertEquals(true, (quantidade3.intValue() <= 0));
		oTestObject.handleEvent("EventoAdicionar", quantidade3);
		assertEquals(true, (oTestObject.estado == Estado.IncrementandoDecrementandoQuantidade));
		
	}
	
	@Test
	public void test4()
	{
		ContextoEntradaSaidaDeEstoque oTestObject = new ContextoEntradaSaidaDeEstoque();
		Integer quantidade3 = 0;
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoques));
		oTestObject.handleEvent("EventoGerenciarItensNoEstoque");
		assertEquals(true, (oTestObject.estado == Estado.GerenciandoItens));
		oTestObject.handleEvent("EventoGerenciarItemExistente");
		assertEquals(true, (oTestObject.estado == Estado.IncrementandoDecrementandoQuantidade));
		assertEquals(true, (quantidade3.intValue() <= 0));
		oTestObject.handleEvent("EventoAdicionar", quantidade3);
		assertEquals(true, (oTestObject.estado == Estado.IncrementandoDecrementandoQuantidade));
		
	}
	
	@Test
	public void test5()
	{
		ContextoEntradaSaidaDeEstoque oTestObject = new ContextoEntradaSaidaDeEstoque();
		Integer quantidade3 = 507905;
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoques));
		oTestObject.handleEvent("EventoGerenciarItensNoEstoque");
		assertEquals(true, (oTestObject.estado == Estado.GerenciandoItens));
		oTestObject.handleEvent("EventoGerenciarItemExistente");
		assertEquals(true, (oTestObject.estado == Estado.IncrementandoDecrementandoQuantidade));
		assertEquals(true, (quantidade3.intValue() > 0));
		oTestObject.handleEvent("EventoAdicionar", quantidade3);
		assertEquals(true, (oTestObject.estado == Estado.GerenciandoItens));
		
	}
	
	@Test
	public void test6()
	{
		ContextoEntradaSaidaDeEstoque oTestObject = new ContextoEntradaSaidaDeEstoque();
		Integer quantidade3 = 1;
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoques));
		oTestObject.handleEvent("EventoGerenciarItensNoEstoque");
		assertEquals(true, (oTestObject.estado == Estado.GerenciandoItens));
		oTestObject.handleEvent("EventoGerenciarItemExistente");
		assertEquals(true, (oTestObject.estado == Estado.IncrementandoDecrementandoQuantidade));
		assertEquals(true, (quantidade3.intValue() > 0));
		oTestObject.handleEvent("EventoAdicionar", quantidade3);
		assertEquals(true, (oTestObject.estado == Estado.GerenciandoItens));
		
	}
	
	@Test
	public void test7()
	{
		ContextoEntradaSaidaDeEstoque oTestObject = new ContextoEntradaSaidaDeEstoque();
		Integer quantidade3 = 832542;
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoques));
		oTestObject.handleEvent("EventoGerenciarItensNoEstoque");
		assertEquals(true, (oTestObject.estado == Estado.GerenciandoItens));
		oTestObject.handleEvent("EventoAdicionarItemExistente");
		assertEquals(true, (oTestObject.estado == Estado.AdicionandoItem));
		assertEquals(true, (quantidade3.intValue() > 0));
		oTestObject.handleEvent("EventoAdicionar", quantidade3);
		assertEquals(true, (oTestObject.estado == Estado.GerenciandoItens));
		
	}
	
	@Test
	public void test8()
	{
		ContextoEntradaSaidaDeEstoque oTestObject = new ContextoEntradaSaidaDeEstoque();
		Integer quantidade3 = 1;
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoques));
		oTestObject.handleEvent("EventoGerenciarItensNoEstoque");
		assertEquals(true, (oTestObject.estado == Estado.GerenciandoItens));
		oTestObject.handleEvent("EventoAdicionarItemExistente");
		assertEquals(true, (oTestObject.estado == Estado.AdicionandoItem));
		assertEquals(true, (quantidade3.intValue() > 0));
		oTestObject.handleEvent("EventoAdicionar", quantidade3);
		assertEquals(true, (oTestObject.estado == Estado.GerenciandoItens));
		
	}
	
	@Test
	public void test9()
	{
		ContextoEntradaSaidaDeEstoque oTestObject = new ContextoEntradaSaidaDeEstoque();
		Integer quantidade3 = 550459;
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoques));
		oTestObject.handleEvent("EventoGerenciarItensNoEstoque");
		assertEquals(true, (oTestObject.estado == Estado.GerenciandoItens));
		oTestObject.handleEvent("EventoGerenciarItemExistente");
		assertEquals(true, (oTestObject.estado == Estado.IncrementandoDecrementandoQuantidade));
		assertEquals(true, (quantidade3.intValue() > 0));
		oTestObject.handleEvent("EventoRemover", quantidade3);
		assertEquals(true, (oTestObject.estado == Estado.GerenciandoItens));
		
	}
	
	@Test
	public void test10()
	{
		ContextoEntradaSaidaDeEstoque oTestObject = new ContextoEntradaSaidaDeEstoque();
		Integer quantidade3 = 1;
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoques));
		oTestObject.handleEvent("EventoGerenciarItensNoEstoque");
		assertEquals(true, (oTestObject.estado == Estado.GerenciandoItens));
		oTestObject.handleEvent("EventoGerenciarItemExistente");
		assertEquals(true, (oTestObject.estado == Estado.IncrementandoDecrementandoQuantidade));
		assertEquals(true, (quantidade3.intValue() > 0));
		oTestObject.handleEvent("EventoRemover", quantidade3);
		assertEquals(true, (oTestObject.estado == Estado.GerenciandoItens));
		
	}
	
	@Test
	public void test11()
	{
		ContextoEntradaSaidaDeEstoque oTestObject = new ContextoEntradaSaidaDeEstoque();
		Integer quantidade3 = -998443;
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoques));
		oTestObject.handleEvent("EventoGerenciarItensNoEstoque");
		assertEquals(true, (oTestObject.estado == Estado.GerenciandoItens));
		oTestObject.handleEvent("EventoAdicionarItemExistente");
		assertEquals(true, (oTestObject.estado == Estado.AdicionandoItem));
		assertEquals(true, (quantidade3.intValue() <= 0));
		oTestObject.handleEvent("EventoAdicionar", quantidade3);
		assertEquals(true, (oTestObject.estado == Estado.AdicionandoItem));
		
	}
	
	@Test
	public void test12()
	{
		ContextoEntradaSaidaDeEstoque oTestObject = new ContextoEntradaSaidaDeEstoque();
		Integer quantidade3 = 0;
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoques));
		oTestObject.handleEvent("EventoGerenciarItensNoEstoque");
		assertEquals(true, (oTestObject.estado == Estado.GerenciandoItens));
		oTestObject.handleEvent("EventoAdicionarItemExistente");
		assertEquals(true, (oTestObject.estado == Estado.AdicionandoItem));
		assertEquals(true, (quantidade3.intValue() <= 0));
		oTestObject.handleEvent("EventoAdicionar", quantidade3);
		assertEquals(true, (oTestObject.estado == Estado.AdicionandoItem));
		
	}
	
	@Test
	public void test13()
	{
		ContextoEntradaSaidaDeEstoque oTestObject = new ContextoEntradaSaidaDeEstoque();
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoques));
		oTestObject.handleEvent("EventoGerenciarItensNoEstoque");
		assertEquals(true, (oTestObject.estado == Estado.GerenciandoItens));
		oTestObject.handleEvent("EventoAdicionarItemExistente");
		assertEquals(true, (oTestObject.estado == Estado.AdicionandoItem));
		oTestObject.handleEvent("EventoCancelar");
		assertEquals(true, (oTestObject.estado == Estado.GerenciandoItens));
		
	}
	
	@Test
	public void test14()
	{
		ContextoEntradaSaidaDeEstoque oTestObject = new ContextoEntradaSaidaDeEstoque();
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoques));
		oTestObject.handleEvent("EventoGerenciarItensNoEstoque");
		assertEquals(true, (oTestObject.estado == Estado.GerenciandoItens));
		oTestObject.handleEvent("EventoGerenciarItemExistente");
		assertEquals(true, (oTestObject.estado == Estado.IncrementandoDecrementandoQuantidade));
		oTestObject.handleEvent("EventoCancelar");
		assertEquals(true, (oTestObject.estado == Estado.GerenciandoItens));
		
	}
	
	@Test
	public void test15()
	{
		ContextoEntradaSaidaDeEstoque oTestObject = new ContextoEntradaSaidaDeEstoque();
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoques));
		oTestObject.handleEvent("EventoGerenciarItensNoEstoque");
		assertEquals(true, (oTestObject.estado == Estado.GerenciandoItens));
		oTestObject.handleEvent("EventoBuscar");
		assertEquals(true, (oTestObject.estado == Estado.GerenciandoItens));
		
	}
	
	@Test
	public void test16()
	{
		ContextoEntradaSaidaDeEstoque oTestObject = new ContextoEntradaSaidaDeEstoque();
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoques));
		oTestObject.handleEvent("EventoGerenciarItensNoEstoque");
		assertEquals(true, (oTestObject.estado == Estado.GerenciandoItens));
		oTestObject.handleEvent("EventoVoltar");
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoques));
		
	}
	
}