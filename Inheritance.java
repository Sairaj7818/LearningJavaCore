// THIS IS MAIN CLASS AND THIS TASK WILL HAVE 2 MORE FILES 1. InheritCalc 2. InheritAdvCalc
public class Inheritance
{
    public static void main( String args[])
    {
        // InheritAdvCalc obj = new InheritAdvCalc();
        InheritVeryAdvCalc obj = new InheritVeryAdvCalc();
        int r1 = obj.add(5,5);
        int r2 = obj.sub(5,5);
        int r3 = obj.multi(5,5);
        int r4 = obj.div(5,5);
        double r5 = obj.power(4,2);

        System.out.println( "additon is:" + r1 );
        System.out.println( "subtraction is:" + r2 );
        System.out.println( "multiplication is:" + r3 );
        System.out.println( "division is:" + r4 );
        System.out.println("power multiplication is:" + r5);

    }
}
