package RelatorioDeConsignacao;

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
		ContextoRelatorioDeConsignacao oTestObject = new ContextoRelatorioDeConsignacao();
		Integer dataInicial2 = -151826;
		Integer dataFinal2 = -182681;
		assertEquals(true, (oTestObject.estado == Estado.ListandoConsignacoes));
		oTestObject.handleEvent("EventoGerarRelatorio");
		assertEquals(true, (oTestObject.estado == Estado.GerandoRelatorio));
		oTestObject.handleEvent("EventoGerar", dataInicial2, dataFinal2);
		assertEquals(true, (oTestObject.estado == Estado.VisualizandoRelatorio));
		oTestObject.handleEvent("EventoExportar");
		assertEquals(true, (oTestObject.estado == Estado.VisualizandoRelatorio));
		
	}
	
	@Test
	public void test2()
	{
		ContextoRelatorioDeConsignacao oTestObject = new ContextoRelatorioDeConsignacao();
		Integer dataInicial2 = -21977;
		Integer dataFinal2 = -693688;
		assertEquals(true, (oTestObject.estado == Estado.ListandoConsignacoes));
		oTestObject.handleEvent("EventoGerarRelatorio");
		assertEquals(true, (oTestObject.estado == Estado.GerandoRelatorio));
		oTestObject.handleEvent("EventoGerar", dataInicial2, dataFinal2);
		assertEquals(true, (oTestObject.estado == Estado.VisualizandoRelatorio));
		oTestObject.handleEvent("EventoCancelar");
		assertEquals(true, (oTestObject.estado == Estado.ListandoConsignacoes));
		
	}
	
	@Test
	public void test3()
	{
		ContextoRelatorioDeConsignacao oTestObject = new ContextoRelatorioDeConsignacao();
		Integer dataInicial2 = 39936;
		Integer dataFinal2 = -276262;
		Integer dataInicial3 = 455003;
		Integer dataFinal3 = -226858;
		assertEquals(true, (oTestObject.estado == Estado.ListandoConsignacoes));
		oTestObject.handleEvent("EventoGerarRelatorio");
		assertEquals(true, (oTestObject.estado == Estado.GerandoRelatorio));
		oTestObject.handleEvent("EventoGerar", dataInicial2, dataFinal2);
		assertEquals(true, (oTestObject.estado == Estado.VisualizandoRelatorio));
		oTestObject.handleEvent("EventoGerar", dataInicial3, dataFinal3);
		assertEquals(true, (oTestObject.estado == Estado.VisualizandoRelatorio));
		
	}
	
	@Test
	public void test4()
	{
		ContextoRelatorioDeConsignacao oTestObject = new ContextoRelatorioDeConsignacao();
		assertEquals(true, (oTestObject.estado == Estado.ListandoConsignacoes));
		oTestObject.handleEvent("EventoGerarRelatorio");
		assertEquals(true, (oTestObject.estado == Estado.GerandoRelatorio));
		oTestObject.handleEvent("EventoCancelar");
		assertEquals(true, (oTestObject.estado == Estado.ListandoConsignacoes));
		
	}
	
}