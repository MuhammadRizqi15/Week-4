public class Circle {
//filed or attribute
	private double jejari = 1;

public String toString() 
{
	return "Jejari = " + jejari
	+ "\nLuas adalah " + Kiraluas();
}

	public void setJejari( double jejari)
	{
		this.jejari = jejari;
	}

	public double getJejari()
	{
		return jejari;
	}
	//default constructor
	public Circle()
	{
		//System.out.println ("Default constructor" );
	}

	//overloading constructor mesti ada parameter
	public Circle(double r)
	{
		this.jejari = r;
	}

	//overloading constructor 2 parameter
	public Circle(double r, String s)
	{
		jejari = r;
		System.out.println ("Jejari = " + jejari + " String = " + s  );
	}

	//method

	public double Kiraluas ( )
	{
		return jejari*jejari * Math.PI;
	}


}