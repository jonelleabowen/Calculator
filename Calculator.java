
public class Calculator {
	
	private String operation = "add";
	private double num1, num2, result;
	
	public Calculator()
	{
		num1 = num2 = result = 0.0;	
		operation = "add";
	}
	
	public void calculate()
	{
		double res = 0.0;
//		double num1 = Double.parseDouble(n1);
//		double num2 = Double.parseDouble(n2);		
				
		//doing calculation
		switch (operation)
		{		
			case "add": result = num1 + num2; 
						break;
			case "subtract": result = num1 - num2; 
						break;
			case "multiply": result = num1 * num2; 
						break;
			case "divide": result = num1 / num2; 
						break;
			case "mod": result = num1 % num2; 
						break;		
		}
		
		setResult(result);		
	}
	
	public void setNum1(String n1)
	{
		num1 = Double.parseDouble(n1);
	}
	
	public void setNum2(String n2)
	{
		num2 = Double.parseDouble(n2);
	}
	
	public void setResult(double res)
	{
		result = res;
	}
	
	public double getResult()
	{
		return result;
	}
	
	public void setOperation(String op)
	{
		operation = op;
	}
	
	
	
	
	public static void main(String[] args)
	{
		System.out.println(10.0 + 1);
		Integer i = new Integer(5);
		Double d = new Double(5.2);
		
		//System.out.println(Double.parseDouble("5"));
		System.out.println(4-8);

	}
	
	
	
}
