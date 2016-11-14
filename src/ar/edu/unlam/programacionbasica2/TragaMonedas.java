package ar.edu.unlam.programacionbasica2;

public class TragaMonedas {
	private Tambor rodillo1;
	private Tambor rodillo2;
	private Tambor rodillo3;
	private Integer valorR1;
	private Integer valorR2;
	private Integer valorR3;
	
	public TragaMonedas(Integer caras)
	{
		this.rodillo1=new Tambor(caras);
		this.rodillo2=new Tambor(caras);
		this.rodillo3=new Tambor(caras);
	}
	public void usarTragaMonedas() throws Exception
	{
		valorR1=rodillo1.GirarTambor();
		valorR2=rodillo2.GirarTambor();
		valorR3=rodillo3.GirarTambor();
	}
	public Integer getValorTambor1()
	{
		return this.valorR1;
	}
	public Integer getValorTambor2()
	{
		return this.valorR2;
	}
	public Integer getValorTambor3()
	{
		return this.valorR3;
	}
}
