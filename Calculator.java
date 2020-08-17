//q1//
public class calculator
{
     interface addition{
         public int add(int a, int b);
     }

     interface subtraction{
          public int sub(int a, int b);
     }

     interface multiplication{
          public int mul(int a, int b);
     }

     interface division{
          public int div(int a, int b);
     }
    
     public static void main(String[] args)
     {
       addition addition = (int a, int b) -> { return (a+b);};
       subtraction subtraction = (int a, int b) -> {return (a-b);};
       multiplication multiplication = (int a, int b) -> {return (a*b);};
       division division = (int a, int b) -> { if(b == 0)
                                                  return 0;
                                               else return (a/b);};
       System.out.println("Addition is " + addition.add(50,20));
       System.out.println("Subtraction is " + subtraction.sub(50,20));
       System.out.println("Multiplication is " + multiplication.mul(50,20));
       System.out.println("Division is " + division.div(40,20));
      }
}
                
