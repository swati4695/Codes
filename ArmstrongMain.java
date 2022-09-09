package assignment;

import java.util.Scanner;

public class ArmstrongMain {
	
	public static boolean isArmstrong(int k) {
        int temp,amstrong,sum=0;
        temp=k;
        while(temp>0) {
        	amstrong=temp%10;
            sum=sum+(amstrong*amstrong*amstrong);
            temp=temp/10;
        }
        if(sum==k) {
            return true;
        }else {
            return false;
        }
    }

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the Armstrong number:");
	        int num=sc.nextInt();	        
	        if(isArmstrong(num)) {
	            System.out.println("Number is Armstrong");
	        }else {
	            System.out.println("Number is not Armstrong");
	        }


	}

}
