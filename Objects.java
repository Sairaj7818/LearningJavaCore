class Objects
{
    //obejcts have properties and behaviours
    //We need class to create an object
    public static void main(String args[])
    {
         int num1 = 10;
         int num2 = 20;

         Calculator calc = new Calculator();

         int result = calc.add(num1,num2);

         System.out.println(result);
        
    }
}

class Calculator
{
     public int add(int n1, int n2)
     {
       int r = n1 + n2;
       return r;
     }
}