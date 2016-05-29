package GerenciamentoDeCliente;

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
		ContextoGerenciamentoDeCliente oTestObject = new ContextoGerenciamentoDeCliente();
		Boolean dadosValidos2 = true;
		assertEquals(true, (oTestObject.estado == Estado.ListandoClientes));
		oTestObject.handleEvent("EventoCriar");
		assertEquals(true, (oTestObject.estado == Estado.CriandoCliente));
		assertEquals(true, (dadosValidos2.booleanValue() == true));
		oTestObject.handleEvent("EventoCriarSucesso", dadosValidos2);
		assertEquals(true, (oTestObject.estado == Estado.ListandoClientes));
		
	}
	
	@Test
	public void test2()
	{
		ContextoGerenciamentoDeCliente oTestObject = new ContextoGerenciamentoDeCliente();
		assertEquals(true, (oTestObject.estado == Estado.ListandoClientes));
		oTestObject.handleEvent("EventoEditar");
		assertEquals(true, (oTestObject.estado == Estado.EditandoCliente));
		oTestObject.handleEvent("EventoCancelarEdicao");
		assertEquals(true, (oTestObject.estado == Estado.ListandoClientes));
		
	}
	
	@Test
	public void test3()
	{
		ContextoGerenciamentoDeCliente oTestObject = new ContextoGerenciamentoDeCliente();
		assertEquals(true, (oTestObject.estado == Estado.ListandoClientes));
		oTestObject.handleEvent("EventoCriar");
		assertEquals(true, (oTestObject.estado == Estado.CriandoCliente));
		oTestObject.handleEvent("EventoCancelarCriacao");
		assertEquals(true, (oTestObject.estado == Estado.ListandoClientes));
		
	}
	
	@Test
	public void test4()
	{
		ContextoGerenciamentoDeCliente oTestObject = new ContextoGerenciamentoDeCliente();
		Boolean dadosValidos2 = false;
		assertEquals(true, (oTestObject.estado == Estado.ListandoClientes));
		oTestObject.handleEvent("EventoEditar");
		assertEquals(true, (oTestObject.estado == Estado.EditandoCliente));
		assertEquals(true, (dadosValidos2.booleanValue() == false));
		oTestObject.handleEvent("EventoEditarErro", dadosValidos2);
		assertEquals(true, (oTestObject.estado == Estado.EditandoCliente));
		
	}
	
	@Test
	public void test5()
	{
		ContextoGerenciamentoDeCliente oTestObject = new ContextoGerenciamentoDeCliente();
		Boolean dadosValidos2 = false;
		assertEquals(true, (oTestObject.estado == Estado.ListandoClientes));
		oTestObject.handleEvent("EventoCriar");
		assertEquals(true, (oTestObject.estado == Estado.CriandoCliente));
		assertEquals(true, (dadosValidos2.booleanValue() == false));
		oTestObject.handleEvent("EventoCriarErro", dadosValidos2);
		assertEquals(true, (oTestObject.estado == Estado.CriandoCliente));
		
	}
	
	@Test
	public void test6()
	{
		ContextoGerenciamentoDeCliente oTestObject = new ContextoGerenciamentoDeCliente();
		Boolean dadosValidos2 = true;
		assertEquals(true, (oTestObject.estado == Estado.ListandoClientes));
		oTestObject.handleEvent("EventoEditar");
		assertEquals(true, (oTestObject.estado == Estado.EditandoCliente));
		assertEquals(true, (dadosValidos2.booleanValue() == true));
		oTestObject.handleEvent("EventoEditarSucesso", dadosValidos2);
		assertEquals(true, (oTestObject.estado == Estado.ListandoClientes));
		
	}
	
	@Test
	public void test7()
	{
		ContextoGerenciamentoDeCliente oTestObject = new ContextoGerenciamentoDeCliente();
		assertEquals(true, (oTestObject.estado == Estado.ListandoClientes));
		oTestObject.handleEvent("EventoBuscar");
		assertEquals(true, (oTestObject.estado == Estado.ListandoClientes));
		
	}
	
	@Test
	public void test8()
	{
		ContextoGerenciamentoDeCliente oTestObject = new ContextoGerenciamentoDeCliente();
		assertEquals(true, (oTestObject.estado == Estado.ListandoClientes));
		oTestObject.handleEvent("EventoDeletar");
		assertEquals(true, (oTestObject.estado == Estado.ListandoClientes));
		
	}
	
}