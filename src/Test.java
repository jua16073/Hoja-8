import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		Principal x= new Principal();
		x.llenar("Pablo,Apendicitis,E");
		x.llenar("Rodrigo,Dolor de cabeza,A");
		String resultado= x.Ordenar();
		assertEquals("A Dolor de cabeza Rodrigo\nE Apendicitis Pablo\n", resultado);
	}

}
