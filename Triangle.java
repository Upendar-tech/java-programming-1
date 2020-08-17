import java.util.Scanner;
class Triangle
{
   double area;
      Triangle(double a,double b,double c)
    {
     double p = (a+b+c)/2;       
        area = Math.sqrt(p*(p-a)*(p-b)*(p-c));  
 
    }
}
 
 
class Xyz 
{
   public static void main(String args[]) 
    {   
       
      Scanner s= new Scanner(System.in);
        
      System.out.println("Enter the first side of the Triangle:");
   
      double a= s.nextLong();
 
      System.out.println("Enter the second side of the Triangle:");
 
          double b= s.nextLong();
     System.out.println("Enter the third side of the Triangle:");
 
          double c= s.nextLong();
 
          Triangle A1=new Triangle(a,b,c);
      
      System.out.println("Area of Triangle is: " + A1.area);      
   }
}