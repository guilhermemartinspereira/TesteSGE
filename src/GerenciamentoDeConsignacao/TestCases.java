package GerenciamentoDeConsignacao;

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
		ContextoGerenciamentoDeConsignacao oTestObject = new ContextoGerenciamentoDeConsignacao();
		assertEquals(true, (oTestObject.estado == Estado.ListandoConsignacoes));
		oTestObject.handleEvent("EventoCriar");
		assertEquals(true, (oTestObject.estado == Estado.CriandoConsignacao));
		oTestObject.handleEvent("EventoCancelar");
		assertEquals(true, (oTestObject.estado == Estado.ListandoConsignacoes));
		
	}
	
	@Test
	public void test2()
	{
		ContextoGerenciamentoDeConsignacao oTestObject = new ContextoGerenciamentoDeConsignacao();
		assertEquals(true, (oTestObject.estado == Estado.ListandoConsignacoes));
		oTestObject.handleEvent("EventoDarBaixa");
		oTestObject.handleEvent("EventoCancelar");
		assertEquals(true, (oTestObject.estado == Estado.ListandoConsignacoes));
		
	}
	
	@Test
	public void test3()
	{
		ContextoGerenciamentoDeConsignacao oTestObject = new ContextoGerenciamentoDeConsignacao();
		Boolean dadosValidos2 = true;
		assertEquals(true, (oTestObject.estado == Estado.ListandoConsignacoes));
		oTestObject.handleEvent("EventoEditar");
		assertEquals(true, (oTestObject.estado == Estado.EditandoConsignacao));
		assertEquals(true, (dadosValidos2.booleanValue() == true));
		oTestObject.handleEvent("EventoEditarSucesso", dadosValidos2);
		assertEquals(true, (oTestObject.estado == Estado.ListandoConsignacoes));
		
	}
	
	@Test
	public void test4()
	{
		ContextoGerenciamentoDeConsignacao oTestObject = new ContextoGerenciamentoDeConsignacao();
		assertEquals(true, (oTestObject.estado == Estado.ListandoConsignacoes));
		oTestObject.handleEvent("EventoEditar");
		assertEquals(true, (oTestObject.estado == Estado.EditandoConsignacao));
		oTestObject.handleEvent("EventoCancelar");
		assertEquals(true, (oTestObject.estado == Estado.ListandoConsignacoes));
		
	}
	
	@Test
	public void test5()
	{
		ContextoGerenciamentoDeConsignacao oTestObject = new ContextoGerenciamentoDeConsignacao();
		Boolean dadosValidos2 = false;
		assertEquals(true, (oTestObject.estado == Estado.ListandoConsignacoes));
		oTestObject.handleEvent("EventoEditar");
		assertEquals(true, (oTestObject.estado == Estado.EditandoConsignacao));
		assertEquals(true, (dadosValidos2.booleanValue() == false));
		oTestObject.handleEvent("EventoEditarErro", dadosValidos2);
		assertEquals(true, (oTestObject.estado == Estado.EditandoConsignacao));
		
	}
	
	@Test
	public void test6()
	{
		ContextoGerenciamentoDeConsignacao oTestObject = new ContextoGerenciamentoDeConsignacao();
		assertEquals(true, (oTestObject.estado == Estado.ListandoConsignacoes));
		oTestObject.handleEvent("EventoDarBaixa");
		oTestObject.handleEvent("EventoDarBaixaSucesso");
		assertEquals(true, (oTestObject.estado == Estado.ListandoConsignacoes));
		
	}
	
	@Test
	public void test7()
	{
		ContextoGerenciamentoDeConsignacao oTestObject = new ContextoGerenciamentoDeConsignacao();
		Boolean dadosValidos2 = true;
		assertEquals(true, (oTestObject.estado == Estado.ListandoConsignacoes));
		oTestObject.handleEvent("EventoCriar");
		assertEquals(true, (oTestObject.estado == Estado.CriandoConsignacao));
		assertEquals(true, (dadosValidos2.booleanValue() == true));
		oTestObject.handleEvent("EventoCriarSucesso", dadosValidos2);
		assertEquals(true, (oTestObject.estado == Estado.ListandoConsignacoes));
		
	}
	
	@Test
	public void test8()
	{
		ContextoGerenciamentoDeConsignacao oTestObject = new ContextoGerenciamentoDeConsignacao();
		Boolean dadosValidos2 = false;
		assertEquals(true, (oTestObject.estado == Estado.ListandoConsignacoes));
		oTestObject.handleEvent("EventoCriar");
		assertEquals(true, (oTestObject.estado == Estado.CriandoConsignacao));
		assertEquals(true, (dadosValidos2.booleanValue() == false));
		oTestObject.handleEvent("EventoCriarErro", dadosValidos2);
		assertEquals(true, (oTestObject.estado == Estado.CriandoConsignacao));
		
	}
	
}