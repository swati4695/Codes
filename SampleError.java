package assignment;

import java.text.DecimalFormat;
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
		double PercentageError=Math.abs(av-ev)/av*10;
		return PercentageError;
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter actual value");
		double av = sc.nextDouble();
		
		 SampleError se=new SampleError();
         
         String pattern="###.000";
         DecimalFormat df=new DecimalFormat(pattern);
         
         if(av!=0) {
        	   System.out.println("Enter expected value: ");
               double ev=sc.nextDouble();
               
               System.out.printf("Absolute error is: " +df.format(se.getAbsoluteError(av, ev)));
               System.out.printf("\nRelative error is: "+df.format(se.getRelativeError(av, ev)));
               if(se.getPercentageError(av, ev)>1)
                   System.out.printf("\nPercentage error is:"+df.format(se.getPercentageError(av, ev)));
               else
                   System.out.println("Percentage value is less than 1..cannot display it!");
       
           }
           else {
               System.out.println("Enter non-zero value");
               System.exit(0);
           }
      }
   }