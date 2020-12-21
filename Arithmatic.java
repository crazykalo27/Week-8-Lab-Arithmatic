import javax.swing.JOptionPane;
import java.lang.Math;

public class Arithmatic {

	private int firstnumber;
	private int secondnumber;
	private int sum;
	private int difference;
	private int max;
	private int min;
	private int product;
	private double average;
	private int absolute;
	
	public void numbersprompt()
	{
		String number = JOptionPane.showInputDialog("Enter first number: ");
		firstnumber = Integer.parseInt(number);
		String number2 = JOptionPane.showInputDialog("Enter second number: ");
		secondnumber = Integer.parseInt(number2);
	}
	public void add()
	{
		sum = firstnumber + secondnumber;
		System.out.printf("Sum:%12d",sum);
		System.out.println();
		
	}
	public void subtract()
	{
		difference = firstnumber - secondnumber;
		System.out.printf("Difference:%5d",difference);
		System.out.println();
	}
	public void multiply()
	{
		product = firstnumber*secondnumber;
		System.out.printf("Product:%8d",product);
		System.out.println();
	}
	public void average()
	{
		average = sum/2.0;
		System.out.printf("Average:%8.2f",average);

		System.out.println();
	}
	public void absolute()
	{
		absolute = Math.abs(difference);
		System.out.printf("Distance:%7d",absolute);
		System.out.println();
	}
	public void max()
	{
		max = Math.max(firstnumber, secondnumber);
		System.out.printf("Maximum:%8d",max);
		System.out.println();
	}
	public void min()
	{
		min = Math.min(firstnumber, secondnumber);
		System.out.printf("Minimum:%8d",min);
		System.out.println();
	}
	
}
