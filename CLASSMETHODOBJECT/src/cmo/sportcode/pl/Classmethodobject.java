package cmo.sportcode.pl;


public class Classmethodobject //Deklaracja klasy
{
	public static void main(String[] args) //Deklaracja podstawowej metody
	{
		  
	       
	}
	//Niepoprawny zapis
	int mnoz(int a , int b)
	{
		return a * b ;
	}
	
	double mnoz(int a , int b)
	{
		return a * b ; 
	}
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//Poprawny Zapis
	int mnoz(int a , int b)
	{
		return a * b ; 
	}
	double mnoz(double a , double b)
	{
		return a * b ; 
	}
}
