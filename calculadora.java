import java.util.Scanner;
class Calculadora
{
	public void suma(int a , int b)
	{
		System.out.println(a+b);
	}
		public void resta(int a , int b)
	{
		System.out.println(a-b);
	}
		public void multiplicacion(int a , int b)
	{
		System.out.println(a*b);
	}
		public void division(int a , int b)
	{
		System.out.println(a/b);
	}
	public static void main (String[] args) 
		{
			Scanner e = new Scanner(System.in);
			System.out.println("ingresa el valor de tu primer numero");
			int a = e.nextInt();
			System.out.println("ingresa el valor de tu segundo numero");
			int b = e.nextInt();
			
			Calculadora x = new Calculadora();
			x.suma(a,b);
			x.resta(a,b);
			x.multiplicacion(a,b);
			x.division(a,b);
			
        }
	
}