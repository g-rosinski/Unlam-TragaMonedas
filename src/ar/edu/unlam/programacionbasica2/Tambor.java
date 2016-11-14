package ar.edu.unlam.programacionbasica2;

import java.util.Random;


public class Tambor {
	private Random aleatorio;
	private Integer caras;
	
	public Tambor(Integer caras)
	{
		this.caras=caras;
	}

	public Integer getCaras() {
		return caras;
	}

	public void setCaras(Integer caras) {
		this.caras = caras;
	}
	public Integer GirarTambor() throws Exception
	{
		if(this.caras>1)
		{
		this.aleatorio=new Random();
		return this.aleatorio.nextInt(this.caras.intValue())+1;
		}
		throw new Exception("Debe Ingresar valor mayor a 1");
	}

}
