import java.util.Scanner;

public class StudyHall               
	{
		
	    public static void main(String args[])  
	    {
	       Double input1, errorterm1, input2, errorterm2, result, resulterrorterm;  
	       char ch;
	       Scanner keyboard = new Scanner(System.in); 
		   
	       System.out.print("Enter First Number : "); 
	       input1 = keyboard.nextDouble();                 
	       System.out.print("Enter First Number Error Term: ");  
	       errorterm1 = keyboard.nextDouble();
	       System.out.print("Enter Second Number : ");
	       input2 = keyboard.nextDouble();
	       System.out.print("Enter Second Number Error Term: ");
	       errorterm2 = keyboard.nextDouble();
	       System.out.print("Enter Operator (+, -) : ");
	       ch = keyboard.next().charAt(0);
		   
	       if(ch == '+')
	       {
	            result = input1 + input2;
	            resulterrorterm = errorterm1 + errorterm2;
	            System.out.println( result + "," + resulterrorterm);
	            
	       }
	       else if(ch == '-')
	       {
	            result = input1 - input2;
	            resulterrorterm = errorterm1 - errorterm2;
	            
	            System.out.print(result + "," + resulterrorterm);
	       }
	       
	       
	      
	           
	    }
	}