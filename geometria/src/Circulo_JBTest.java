import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Circulo_JBTest {

	@Test
	void testArea() {
		Circulo_JB c = new Circulo_JB(7,"");
		assertEquals(c.area(),7*7*3.1416);
	}

	@Test
	void testArea2() {
		Circulo_JB c = new Circulo_JB(0,"");
		assertEquals(c.area(),0*0*3.1416);
	}
	
	@Test
	void testArea3() {
		Circulo_JB c = new Circulo_JB(-3,"");
		assertEquals(c.area(),-3*-3*3.1416);
	}
}
