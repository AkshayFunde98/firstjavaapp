class Calculator{
	private int no1, no2;
	
	public void addition(int no1, int no2){
		this.no1 = no1;
		this.no2 = no2;
		System.out.println("Addition of " + no1 + " & " + no2 + " is " + (no1 + no2));
	}
	
	public void subtraction(int no1, int no2){
		this.no1 = no1;
		this.no2 = no2;
		System.out.println("Subtraction of " + no1 + " & " + no2 + " is " + (no1 - no2));
	}
	
	public void multiplication(int no1, int no2){
		this.no1 = no1;
		this.no2 = no2;
		System.out.println("Multiplication of " + no1 + " & " + no2 + " is " + (no1 * no2));
	}
	
	public void division(int no1, int no2){
		this.no1 = no1;
		this.no2 = no2;
		if(no2 == 0){
			System.out.println("Value of no2 is Zero. Please change the value to perform division operation");
		}
		else
			System.out.println("Division of " + no1 + " & " + no2 + " is " + (no1 / no2));
	}
}

public class CalculatorDemo{
	public static void main(String[] args){
		Calculator c1 = new Calculator();
		c1.addition(2,3);
		c1.subtraction(6,5);
		c1.multiplication(10,2);
		c1.division(10,2);
		c1.division(10,0);
	}
}