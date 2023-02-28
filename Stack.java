//stack is storange to store data
//each method will have its own stack 
public class Stack
{
    public static void main(String args[])
    {
        int data = 10; 
        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();
        int r1 = obj.add(3,4);
        //System.out.println(r1);

        obj.num = 8; //in this case the output will    be 8 and 5 as they are 2 different individual variables and will not affect each other.

        System.out.println(obj.num);
        System.out.println(obj1.num);


    }
}

class Calculator 
{
    int num = 5; //instance variable

    public int add(int n1, int n2) //local variable
    {
        //System.out.println(num);
        return n1 + n2;
    }
}