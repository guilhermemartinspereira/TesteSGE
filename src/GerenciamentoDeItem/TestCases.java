package GerenciamentoDeItem;

import org.junit.*;
import static org.junit.Assert.*;

// JUnit 4.3
public class TestCases {

    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(TestCases.class);
    }

    @Before
    public void setUp() {
        ProvedorDeAdaptador.reset();
    }

    // Editar com sucesso
    @Test
    public void test1() {
        ContextoGerenciamentoDeItem oTestObject = new ContextoGerenciamentoDeItem();
        Boolean dadosValidos2 = true;
        assertEquals(true, (oTestObject.estado == Estado.ListandoItem));
        oTestObject.handleEvent("EventoEditar");
        assertEquals(true, (oTestObject.estado == Estado.EditandoItem));
        assertEquals(true, (dadosValidos2.booleanValue() == true));
        oTestObject.handleEvent("EventoEditarSucesso", dadosValidos2);
        assertEquals(true, (oTestObject.estado == Estado.ListandoItem));
    }

    // Criar com validacao de preenchimento
    @Test
    public void test2() {
        ContextoGerenciamentoDeItem oTestObject = new ContextoGerenciamentoDeItem();
        Boolean dadosValidos2 = false;
        assertEquals(true, (oTestObject.estado == Estado.ListandoItem));
        oTestObject.handleEvent("EventoCriar");
        assertEquals(true, (oTestObject.estado == Estado.CriandoItem));
        assertEquals(true, (dadosValidos2.booleanValue() == false));
        oTestObject.handleEvent("EventoCriarErro", dadosValidos2);
        assertEquals(true, (oTestObject.estado == Estado.CriandoItem));
    }

    // Criar com sucesso
    @Test
    public void test3() {
        ContextoGerenciamentoDeItem oTestObject = new ContextoGerenciamentoDeItem();
        Boolean dadosValidos2 = true;
        assertEquals(true, (oTestObject.estado == Estado.ListandoItem));
        oTestObject.handleEvent("EventoCriar");
        assertEquals(true, (oTestObject.estado == Estado.CriandoItem));
        assertEquals(true, (dadosValidos2.booleanValue() == true));
        oTestObject.handleEvent("EventoCriarSucesso", dadosValidos2);
        assertEquals(true, (oTestObject.estado == Estado.ListandoItem));

    }

    // Editar com erro
    @Test
    public void test4() {
        ContextoGerenciamentoDeItem oTestObject = new ContextoGerenciamentoDeItem();
        Boolean dadosValidos2 = false;
        assertEquals(true, (oTestObject.estado == Estado.ListandoItem));
        oTestObject.handleEvent("EventoEditar");
        assertEquals(true, (oTestObject.estado == Estado.EditandoItem));
        assertEquals(true, (dadosValidos2.booleanValue() == false));
        oTestObject.handleEvent("EventoEditarErro", dadosValidos2);
        assertEquals(true, (oTestObject.estado == Estado.EditandoItem));

    }

    // Deletar com sucesso
    @Test
    public void test5() {
        ContextoGerenciamentoDeItem oTestObject = new ContextoGerenciamentoDeItem();
        assertEquals(true, (oTestObject.estado == Estado.ListandoItem));
        oTestObject.handleEvent("EventoDeletar");
        assertEquals(true, (oTestObject.estado == Estado.ListandoItem));
    }

    // Buscar
    @Test
    public void test6() {
        ContextoGerenciamentoDeItem oTestObject = new ContextoGerenciamentoDeItem();
        assertEquals(true, (oTestObject.estado == Estado.ListandoItem));
        oTestObject.handleEvent("EventoBuscar");
        assertEquals(true, (oTestObject.estado == Estado.ListandoItem));
    }
}
