package srcTestMock;

import static org.easymock.EasyMock.*;

import javax.servlet.http.HttpServletRequest;

import Controller.FrontController;
import junit.framework.TestCase;

public class MockOperador extends TestCase{
	
	public void testMockCalcularSalario(){
		HttpServletRequest requestMock = createMock(HttpServletRequest.class);
		expect(requestMock.getParameter("nomeOperador")).andReturn("João");
		expect(requestMock.getParameter("permissaoOperador")).andReturn("Leitura e Inclusão");
		expect(requestMock.getParameter("nivelOperador")).andReturn("6");
		expect(requestMock.getParameter("diasUteisTrabalhados")).andReturn("22");
		expect(requestMock.getParameter("valorDiaTrabalhado")).andReturn("25");
		expect(requestMock.getParameter("valorValeTransporteDia")).andReturn("4.50");
		replay(requestMock);
		
		FrontController mockOperador = new FrontController();
		assertEquals(mockOperador.incluirNovoOperadorCalcularSalario(requestMock),550.0);
		
	}
	
	
	public void testMockCalcularValeTransporte(){
		HttpServletRequest requestMock = createMock(HttpServletRequest.class);
		expect(requestMock.getParameter("nomeOperador")).andReturn("João");
		expect(requestMock.getParameter("permissaoOperador")).andReturn("Leitura e Inclusão");
		expect(requestMock.getParameter("nivelOperador")).andReturn("6");
		expect(requestMock.getParameter("diasUteisTrabalhados")).andReturn("22");
		expect(requestMock.getParameter("valorDiaTrabalhado")).andReturn("25");
		expect(requestMock.getParameter("valorValeTransporteDia")).andReturn("4.50");
		replay(requestMock);
		
		FrontController mockOperador = new FrontController();
		assertEquals(mockOperador.incluirNovoOperadorCalcularValeTransporte(requestMock),99.0);
		
	}
	
	

}
