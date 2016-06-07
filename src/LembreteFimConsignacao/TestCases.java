package LembreteFimConsignacao;

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
		ContextoLembreteFimConsignacao oTestObject = new ContextoLembreteFimConsignacao();
		Integer data1 = 0;
		assertEquals(true, (oTestObject.filtroAplicado.booleanValue() == true));
		assertEquals(true, (data1.intValue() >= 0));
		oTestObject.handleEvent("EventoBuscar", data1);
		assertEquals(true, (oTestObject.filtroAplicado.booleanValue() == true));
		
	}
	
	@Test
	public void test2()
	{
		ContextoLembreteFimConsignacao oTestObject = new ContextoLembreteFimConsignacao();
		Integer data1 = -604801;
		assertEquals(true, (oTestObject.filtroAplicado.booleanValue() == true));
		assertEquals(true, (data1.intValue() < ( - 604800)));
		oTestObject.handleEvent("EventoBuscar", data1);
		assertEquals(true, (oTestObject.filtroAplicado.booleanValue() == true));
		
	}
	
	@Test
	public void test3()
	{
		ContextoLembreteFimConsignacao oTestObject = new ContextoLembreteFimConsignacao();
		Integer data1 = -604800;
		assertEquals(true, (oTestObject.filtroAplicado.booleanValue() == true));
		assertEquals(true, (data1.intValue() >= ( - 604800)));
		assertEquals(true, (data1.intValue() < 0));
		oTestObject.handleEvent("EventoBuscar", data1);
		assertEquals(true, (oTestObject.filtroAplicado.booleanValue() == true));
		
	}
	
	@Test
	public void test4()
	{
		ContextoLembreteFimConsignacao oTestObject = new ContextoLembreteFimConsignacao();
		Integer data1 = -1;
		assertEquals(true, (oTestObject.filtroAplicado.booleanValue() == true));
		assertEquals(true, (data1.intValue() >= ( - 604800)));
		assertEquals(true, (data1.intValue() < 0));
		oTestObject.handleEvent("EventoBuscar", data1);
		assertEquals(true, (oTestObject.filtroAplicado.booleanValue() == true));
		
	}
	
}