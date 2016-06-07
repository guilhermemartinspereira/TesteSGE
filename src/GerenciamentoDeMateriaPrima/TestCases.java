package GerenciamentoDeMateriaPrima;

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
		ContextoGerenciamentoDeMateriaPrima oTestObject = new ContextoGerenciamentoDeMateriaPrima();
		Boolean dadosValidos2 = true;
		assertEquals(true, (oTestObject.estado == Estado.ListandoMateriaPrima));
		oTestObject.handleEvent("EventoCriar");
		assertEquals(true, (oTestObject.estado == Estado.CriandoMateriaPrima));
		assertEquals(true, (dadosValidos2.booleanValue() == true));
		oTestObject.handleEvent("EventoCriarSucesso", dadosValidos2);
		assertEquals(true, (oTestObject.estado == Estado.ListandoMateriaPrima));
		
	}
	
	@Test
	public void test2()
	{
		ContextoGerenciamentoDeMateriaPrima oTestObject = new ContextoGerenciamentoDeMateriaPrima();
		assertEquals(true, (oTestObject.estado == Estado.ListandoMateriaPrima));
		oTestObject.handleEvent("EventoCriar");
		assertEquals(true, (oTestObject.estado == Estado.CriandoMateriaPrima));
		oTestObject.handleEvent("EventoCancelar");
		assertEquals(true, (oTestObject.estado == Estado.ListandoMateriaPrima));
		
	}
	
	@Test
	public void test3()
	{
		ContextoGerenciamentoDeMateriaPrima oTestObject = new ContextoGerenciamentoDeMateriaPrima();
		Boolean dadosValidos2 = false;
		assertEquals(true, (oTestObject.estado == Estado.ListandoMateriaPrima));
		oTestObject.handleEvent("EventoCriar");
		assertEquals(true, (oTestObject.estado == Estado.CriandoMateriaPrima));
		assertEquals(true, (dadosValidos2.booleanValue() == false));
		oTestObject.handleEvent("EventoCriarErro", dadosValidos2);
		assertEquals(true, (oTestObject.estado == Estado.CriandoMateriaPrima));
		
	}
	
	@Test
	public void test4()
	{
		ContextoGerenciamentoDeMateriaPrima oTestObject = new ContextoGerenciamentoDeMateriaPrima();
		assertEquals(true, (oTestObject.estado == Estado.ListandoMateriaPrima));
		oTestObject.handleEvent("EventoEditar");
		assertEquals(true, (oTestObject.estado == Estado.EditandoMateriaPrima));
		oTestObject.handleEvent("EventoCancelar");
		assertEquals(true, (oTestObject.estado == Estado.ListandoMateriaPrima));
		
	}
	
	@Test
	public void test5()
	{
		ContextoGerenciamentoDeMateriaPrima oTestObject = new ContextoGerenciamentoDeMateriaPrima();
		Boolean dadosValidos2 = true;
		assertEquals(true, (oTestObject.estado == Estado.ListandoMateriaPrima));
		oTestObject.handleEvent("EventoEditar");
		assertEquals(true, (oTestObject.estado == Estado.EditandoMateriaPrima));
		assertEquals(true, (dadosValidos2.booleanValue() == true));
		oTestObject.handleEvent("EventoEditarSucesso", dadosValidos2);
		assertEquals(true, (oTestObject.estado == Estado.ListandoMateriaPrima));
		
	}
	
	@Test
	public void test6()
	{
		ContextoGerenciamentoDeMateriaPrima oTestObject = new ContextoGerenciamentoDeMateriaPrima();
		Boolean dadosValidos2 = false;
		assertEquals(true, (oTestObject.estado == Estado.ListandoMateriaPrima));
		oTestObject.handleEvent("EventoEditar");
		assertEquals(true, (oTestObject.estado == Estado.EditandoMateriaPrima));
		assertEquals(true, (dadosValidos2.booleanValue() == false));
		oTestObject.handleEvent("EventoEditarErro", dadosValidos2);
		assertEquals(true, (oTestObject.estado == Estado.EditandoMateriaPrima));
		
	}
	
	@Test
	public void test7()
	{
		ContextoGerenciamentoDeMateriaPrima oTestObject = new ContextoGerenciamentoDeMateriaPrima();
		assertEquals(true, (oTestObject.estado == Estado.ListandoMateriaPrima));
		oTestObject.handleEvent("EventoDeletar");
		assertEquals(true, (oTestObject.estado == Estado.ListandoMateriaPrima));
		
	}
	
	@Test
	public void test8()
	{
		ContextoGerenciamentoDeMateriaPrima oTestObject = new ContextoGerenciamentoDeMateriaPrima();
		assertEquals(true, (oTestObject.estado == Estado.ListandoMateriaPrima));
		oTestObject.handleEvent("EventoBuscar");
		assertEquals(true, (oTestObject.estado == Estado.ListandoMateriaPrima));
		
	}
	
}