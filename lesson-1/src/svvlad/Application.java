package svvlad;

public class Application {
  public static void main(String[] args) {
	  
    // task 1 
	  
//	  byte a = 1;
//	  short b = 2;
//	  int c = 3;
//	  long d= 4;
//	  char e = 5;
//	  float f = 6;
//	  double g = 7;
//	  boolean h = false;
	  
	  // task 2
	  
//	  System.out.println("Min byte=" + Byte.MIN_VALUE);
//	  System.out.println("Max byte=" + Byte.MAX_VALUE);
//	  
//	  System.out.println("Min short=" + Short.MIN_VALUE);
//	  System.out.println("Max short=" + Short.MAX_VALUE);
//	  
//	  System.out.println("Min int=" + Integer.MIN_VALUE);
//	  System.out.println("Max int=" + Integer.MAX_VALUE);
//	  
//	  System.out.println("Min long=" + Long.MIN_VALUE);
//	  System.out.println("Max long=" + Long.MAX_VALUE);
//	  
//	  System.out.println("Min char=" + (int)Character.MIN_VALUE);
//	  System.out.println("Max char=" + (int)Character.MAX_VALUE);
//	  
//	  System.out.println("Min float=" + Float.MIN_VALUE);
//	  System.out.println("Max float=" + Float.MAX_VALUE);
//	  
//	  System.out.println("Min double=" + Double.MIN_VALUE);
//	  System.out.println("Max double=" + Double.MAX_VALUE);
//	  
//	  System.out.println("Min boolean=" + false);
//	  System.out.println("Max boolean=" + true);
	  
	  // Task 3
	  
	  int[] myarray = {3,4,6,7,1,78,54,65,12,43};
	  int min = myarray[0];
	  
	  for (int i = 1; i < myarray.length; i++) 
		  min = Math.min(min, myarray[i]);
	  
	  System.out.println("min value ="+ min);
	  
	  for (int i = 1; i < myarray.length; i++) 
		  min = Math.max(min, myarray[i]);
	  
	  System.out.println("max value ="+ min);

	  
	  



}
}
