//METHOD OVERRIDING MEANS THE METHOD WITH SAME NAME WHICH IS IN SAME CLASS WILL BE EXECUTED AND WILL NOT GO TO PARENT CLASS
//BOTH MAY BE DIFFERENT FUNCTIONS
public class MethodOverriding
{
    public static void main(String args[])
    {
        AdvCalc obj = new AdvCalc();
        int r = obj.add(5,5);
        System.out.println(r);
    }
}

class Calc
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
}
class AdvCalc extends Calc
{
    public int add(int n1, int n2)
    {
        return n1+n2+1;
    }
}