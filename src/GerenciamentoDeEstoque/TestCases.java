package GerenciamentoDeEstoque;

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
		ContextoGerenciamentoDeEstoque oTestObject = new ContextoGerenciamentoDeEstoque();
		Boolean dadosValidos2 = false;
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoque));
		oTestObject.handleEvent("EventoEditar");
		assertEquals(true, (oTestObject.estado == Estado.EditandoEstoque));
		assertEquals(true, (dadosValidos2.booleanValue() == false));
		oTestObject.handleEvent("EventoEditarErro", dadosValidos2);
		assertEquals(true, (oTestObject.estado == Estado.EditandoEstoque));
		
	}
	
	@Test
	public void test2()
	{
		ContextoGerenciamentoDeEstoque oTestObject = new ContextoGerenciamentoDeEstoque();
		Boolean dadosValidos2 = true;
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoque));
		oTestObject.handleEvent("EventoEditar");
		assertEquals(true, (oTestObject.estado == Estado.EditandoEstoque));
		assertEquals(true, (dadosValidos2.booleanValue() == true));
		oTestObject.handleEvent("EventoEditarSucesso", dadosValidos2);
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoque));
		
	}
	
	@Test
	public void test3()
	{
		ContextoGerenciamentoDeEstoque oTestObject = new ContextoGerenciamentoDeEstoque();
		Boolean dadosValidos2 = false;
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoque));
		oTestObject.handleEvent("EventoCriar");
		assertEquals(true, (oTestObject.estado == Estado.CriandoEstoque));
		assertEquals(true, (dadosValidos2.booleanValue() == false));
		oTestObject.handleEvent("EventoCriarErro", dadosValidos2);
		assertEquals(true, (oTestObject.estado == Estado.CriandoEstoque));
		
	}
	
	@Test
	public void test4()
	{
		ContextoGerenciamentoDeEstoque oTestObject = new ContextoGerenciamentoDeEstoque();
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoque));
		oTestObject.handleEvent("EventoCriar");
		assertEquals(true, (oTestObject.estado == Estado.CriandoEstoque));
		oTestObject.handleEvent("EventoCancelarCriacao");
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoque));
		
	}
	
	@Test
	public void test5()
	{
		ContextoGerenciamentoDeEstoque oTestObject = new ContextoGerenciamentoDeEstoque();
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoque));
		oTestObject.handleEvent("EventoEditar");
		assertEquals(true, (oTestObject.estado == Estado.EditandoEstoque));
		oTestObject.handleEvent("EventoCancelarEdicao");
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoque));
		
	}
	
	@Test
	public void test6()
	{
		ContextoGerenciamentoDeEstoque oTestObject = new ContextoGerenciamentoDeEstoque();
		Boolean dadosValidos2 = true;
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoque));
		oTestObject.handleEvent("EventoCriar");
		assertEquals(true, (oTestObject.estado == Estado.CriandoEstoque));
		assertEquals(true, (dadosValidos2.booleanValue() == true));
		oTestObject.handleEvent("EventoCriarSucesso", dadosValidos2);
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoque));
		
	}
	
	@Test
	public void test7()
	{
		ContextoGerenciamentoDeEstoque oTestObject = new ContextoGerenciamentoDeEstoque();
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoque));
		oTestObject.handleEvent("EventoBuscar");
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoque));
		
	}
	
	@Test
	public void test8()
	{
		ContextoGerenciamentoDeEstoque oTestObject = new ContextoGerenciamentoDeEstoque();
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoque));
		oTestObject.handleEvent("EventoDeletar");
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoque));
		
	}
	
}