package GerenciamentoDeItem;

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
		assertEquals(true, (oTestObject.estado == Estado.ListandoItem));
		oTestObject.handleEvent("EventoCriar");
		assertEquals(true, (oTestObject.estado == Estado.CriandoItem));
		oTestObject.handleEvent("EventoCancelarCriacao");
		assertEquals(true, (oTestObject.estado == Estado.ListandoItem));
		oTestObject.handleEvent("EventoCriar");
		assertEquals(true, (oTestObject.estado == Estado.CriandoItem));
		assertEquals(true, (oTestObject.dadosValidos.booleanValue() == true));
		oTestObject.handleEvent("EventoCriarSucesso");
		assertEquals(true, (oTestObject.estado == Estado.ListandoItem));
		
	}
	
	@Test
	public void test2()
	{
		ContextoGerenciamentoDeItem oTestObject = new ContextoGerenciamentoDeItem();
		assertEquals(true, (oTestObject.estado == Estado.ListandoItem));
		oTestObject.handleEvent("EventoCriar");
		assertEquals(true, (oTestObject.estado == Estado.CriandoItem));
		oTestObject.handleEvent("EventoCancelarCriacao");
		assertEquals(true, (oTestObject.estado == Estado.ListandoItem));
		oTestObject.handleEvent("EventoEditar");
		assertEquals(true, (oTestObject.estado == Estado.EditandoItem));
		assertEquals(true, (oTestObject.dadosValidos.booleanValue() == true));
		oTestObject.handleEvent("EventoEditarSucesso");
		assertEquals(true, (oTestObject.estado == Estado.ListandoItem));
		
	}
	
	@Test
	public void test3()
	{
		ContextoGerenciamentoDeItem oTestObject = new ContextoGerenciamentoDeItem();
		assertEquals(true, (oTestObject.estado == Estado.ListandoItem));
		oTestObject.handleEvent("EventoCriar");
		assertEquals(true, (oTestObject.estado == Estado.CriandoItem));
		assertEquals(true, (oTestObject.dadosValidos.booleanValue() == false));
		oTestObject.handleEvent("EventoCriarErro");
		assertEquals(true, (oTestObject.estado == Estado.CriandoItem));
		
	}
	
	@Test
	public void test4()
	{
		ContextoGerenciamentoDeItem oTestObject = new ContextoGerenciamentoDeItem();
		assertEquals(true, (oTestObject.estado == Estado.ListandoItem));
		oTestObject.handleEvent("EventoEditar");
		assertEquals(true, (oTestObject.estado == Estado.EditandoItem));
		assertEquals(true, (oTestObject.dadosValidos.booleanValue() == false));
		oTestObject.handleEvent("EventoEditarErro");
		assertEquals(true, (oTestObject.estado == Estado.EditandoItem));
		
	}
	
	@Test
	public void test5()
	{
		ContextoGerenciamentoDeItem oTestObject = new ContextoGerenciamentoDeItem();
		assertEquals(true, (oTestObject.estado == Estado.ListandoItem));
		oTestObject.handleEvent("EventoDeletar");
		assertEquals(true, (oTestObject.estado == Estado.ListandoItem));
		
	}
	
	@Test
	public void test6()
	{
		ContextoGerenciamentoDeItem oTestObject = new ContextoGerenciamentoDeItem();
		assertEquals(true, (oTestObject.estado == Estado.ListandoItem));
		oTestObject.handleEvent("EventoBuscar");
		assertEquals(true, (oTestObject.estado == Estado.ListandoItem));
		
	}
	
}