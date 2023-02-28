//Method Overloading
//methods having same name but can accept different number of parameters and also different types of parameters together.
public class Calculator
{

    public static void main(String args[])
    {
        Calc obj = new Calc();
        double result = obj.add(1.5,2.5,3);

        System.out.println(result);
    }
}

class Calc
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }
    public double add(double n1, double n2, int n3)
    {
        return n1 + n2 + n3;
    }
}