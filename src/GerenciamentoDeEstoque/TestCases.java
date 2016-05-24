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
		ContextoGerenciamentoDeItem oTestObject = new ContextoGerenciamentoDeItem();
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoque));
		oTestObject.handleEvent("EventoEditar");
		assertEquals(true, (oTestObject.estado == Estado.EditandoEstoque));
		oTestObject.handleEvent("EventoCancelarEdicao");
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoque));
		
	}
	
	@Test
	public void test2()
	{
		ContextoGerenciamentoDeItem oTestObject = new ContextoGerenciamentoDeItem();
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
		ContextoGerenciamentoDeItem oTestObject = new ContextoGerenciamentoDeItem();
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
		ContextoGerenciamentoDeItem oTestObject = new ContextoGerenciamentoDeItem();
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoque));
		oTestObject.handleEvent("EventoCriar");
		assertEquals(true, (oTestObject.estado == Estado.CriandoEstoque));
		oTestObject.handleEvent("EventoCancelarCriacao");
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoque));
		
	}
	
	@Test
	public void test5()
	{
		ContextoGerenciamentoDeItem oTestObject = new ContextoGerenciamentoDeItem();
		Boolean dadosValidos2 = true;
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoque));
		oTestObject.handleEvent("EventoCriar");
		assertEquals(true, (oTestObject.estado == Estado.CriandoEstoque));
		assertEquals(true, (dadosValidos2.booleanValue() == true));
		oTestObject.handleEvent("EventoCriarSucesso", dadosValidos2);
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoque));
		
	}
	
	@Test
	public void test6()
	{
		ContextoGerenciamentoDeItem oTestObject = new ContextoGerenciamentoDeItem();
		Boolean dadosValidos2 = false;
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoque));
		oTestObject.handleEvent("EventoEditar");
		assertEquals(true, (oTestObject.estado == Estado.EditandoEstoque));
		assertEquals(true, (dadosValidos2.booleanValue() == false));
		oTestObject.handleEvent("EventoEditarErro", dadosValidos2);
		assertEquals(true, (oTestObject.estado == Estado.EditandoEstoque));
		
	}
	
	@Test
	public void test7()
	{
		ContextoGerenciamentoDeItem oTestObject = new ContextoGerenciamentoDeItem();
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoque));
		oTestObject.handleEvent("EventoBuscar");
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoque));
		
	}
	
	@Test
	public void test8()
	{
		ContextoGerenciamentoDeItem oTestObject = new ContextoGerenciamentoDeItem();
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoque));
		oTestObject.handleEvent("EventoDeletar");
		assertEquals(true, (oTestObject.estado == Estado.ListandoEstoque));
		
	}
	
}