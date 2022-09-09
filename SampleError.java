package assignment;

import java.util.Scanner;

public class SampleError {
	
	public static double getAbsoluteError(double av,double ev) {
		double absoluteError=Math.abs(av-ev);
		return absoluteError;	
	}
	public static double getRelativeError(double av,double ev) {
		double relativeError=Math.abs(av-ev)/av;
		return relativeError;
		
	}
	public static double getPercentageError(double av,double ev) {
		double PercentageError=Math.abs(av-ev)/av;
		return PercentageError;
		
	}
	public static void main(String[] args) {
		
		 SampleError se=new SampleError();
		 
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the absolute value  :");
         
         double av=sc.nextDouble();
         double ev=sc.nextDouble();
         
         if(av!=0) {
             System.out.println("Enter the expected value: ");
             System.out.printf("The Absolute error is"+" %.3f "+"\n" ,se.getAbsoluteError(av, ev));
             System.out.printf("The Relative error is"+" %.3f "+"\n",se.getRelativeError(av, ev) );             
         if(se.getPercentageError(av, ev)>1)
               System.out.printf("The Percentage error is "+" %.3f "+"\n",se.getPercentageError(av, ev) );
             else
               System.out.println("Percentage value is less than 1 and cannot display it!");
         }
         else {
             System.out.println("Enter the non-zero value");
             System.exit(0);
         }


        
	}

}
