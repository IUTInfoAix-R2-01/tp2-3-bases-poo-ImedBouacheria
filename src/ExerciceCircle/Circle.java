package ExerciceCircle;

public class Circle {
	// Save as "Circle.java"
	   // private instance variable, not accessible from outside this class
	   private double radius;
	   private String color;
	   
	   // Constructors (overloaded)
	   /** Constructs a Circle instance with default value for radius and color */
	   public Circle() {  // 1st (default) constructor
	      radius = 1.0;
	      color = "red";
	   }
	   
	   /** Constructs a Circle instance with the given radius and default color */
	   public Circle(double r) {  // 2nd constructor
	      radius = r;
	      color = "red";
	   }
	   public Circle (double r, String c) { 
			color = c ;
			radius = r; 
			
		}
	   /** Returns the radius */
	   public double getRadius() {
	     return radius; 
	   }
	   
	   /** Returns the area of this Circle instance */
	   public double getArea() {
	      return radius*radius*Math.PI;
	   }
	   public String getColor() {
		   return color;
	   }
	public String getArea1() {
		// TODO Auto-generated method stub
		return null;
	}
		public void setRadius(double newRadius) { 
	         radius = newRadius; 
	         
	      } // Setter pour la variable d'instance color 
	      public void setColor(String newColor) { 
	    	  color = newColor ; 
	      }
	}
	

