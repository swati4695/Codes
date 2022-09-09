package assignment;

import java.text.DecimalFormat;
import java.util.Scanner;

class DistanceCalculator
{
	  static double calcDist(Point p1,Point p2) {
	        double dist=Math.sqrt(((p2.getX()-p1.getX())*(p2.getX()-p1.getX()))+(p2.getY()-p1.getY())*(p2.getY()-p1.getY()));
	        return dist;
	  }  
	}

	class Point {
	    
	    private int x,y;
	    
	   public int getX() {
	        return x;
	    }

	    public void setX(int x) {
	        this.x = x;
	    }

	    public int getY() {
	        return y;
	    }

	    public void setY(int y) {
	        this.y = y;
	    }
	    //default constructor
	    public Point() {}
	    //parameterized constructor
	    public Point(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }
	    //object constructor
	    public Point(Point p) {
	        this.x=p.x;
	        this.y=p.y;
	    }
	    
	    @Override
	    public String toString() {
	        return "Point [x=" + x + ", y=" + y + "]";
	    }
	}

public class Main {
	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        
	        Point pt1,pt2;



	       pt1=new Point(100,200);
	        pt2=new Point(200,700);
	        
	        String pattern="###.000";
	        DecimalFormat df=new DecimalFormat(pattern);
	        
	        DistanceCalculator cd= new DistanceCalculator();
	        System.out.println("The distance between above two points is: "+df.format(cd.calcDist(pt1,pt2)));
	   }

	}
	
	