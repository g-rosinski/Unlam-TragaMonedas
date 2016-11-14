package ar.edu.unlam.programacionbasica2;

import junit.framework.Assert;

import org.junit.Test;
@SuppressWarnings("deprecation")

public class TestTragaMonedas {


	@Test
	public void usarTragaMonedasyDevuelvaValorEnElRangoDeCaras() throws Exception
	{
		Integer caras=6;
		TragaMonedas TM1 = new TragaMonedas(caras);
		TM1.usarTragaMonedas();
		Integer min=1;
		Integer max=caras;
		
		Assert.assertTrue(TM1.getValorTambor1() >= min && TM1.getValorTambor1() <= max);
		Assert.assertTrue(TM1.getValorTambor2() >= min && TM1.getValorTambor2() <= max);
		Assert.assertTrue(TM1.getValorTambor3() >= min && TM1.getValorTambor3() <= max);

	}
	@Test
	public void queNoSePuedaUsarCantidadDeCarasMenoroIguala1() 
	{

			Integer caras=1;
			TragaMonedas TM1 = new TragaMonedas(caras);
			Assert.assertTrue(caras<=1);
			try {
				TM1.usarTragaMonedas();
			} catch (Exception e) {
				System.out.println("Lo que sucede es: "+e.getMessage());
			}

		
	}
}
