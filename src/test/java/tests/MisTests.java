package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MisTests {
	
	@Test
	public void verificarSuma() {
		Assert.assertEquals(2+2, 4,"No son iguales, la suma falló");
	}
	
	@Test
	public void verificarResta() {
		Assert.assertEquals(2-2, 4,"No son iguales, la resta falló");
	}
	
}
