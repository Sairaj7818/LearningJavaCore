//FINAL KEYWORD ON - VARIABLE, CLASS AND METHOD
//FINAL ON VARIABLE MAKES IT CONSTANT
//FINAL ON CLASS STOPS INHERITENCE 
//FINAL ON METHOD STOPS METHOD OVERRDING

public class FinalKeyword
{
    public static void main(String args[])
    {
        final int num = 8; 
        // num = 9; //THIS WILL NOT WORK
        System.out.println(num);

        // Calc obj = new Calc();
        AdvCalc obj = new AdvCalc();
        obj.show();
        obj.add(4,5);


    }
}

// final class Calc
class Calc
{
    public final void show()
    {
        System.out.println("Calculator by Sairaj");
    }
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
    
}

class AdvCalc extends Calc //THIS WILL NOT WORK
{
    public void show()
    {
        System.out.println("Calculator by Random");
    }
}