public class Encapsulation
{
    public static void main( String args[])
    {
        Human obj = new Human();

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}

class Human
{ 
    private int age = 99;  //THIS IS HOW WE MAKE A VARIAL PRIVATE FOR A CLASS. FROM NOW ONWARDS WE WILL DEFINE INSTANCE VARIABLE AS PRIVATE
    private String name = "Srj"; 

    public String getName()  //METHOD FROMAT: TYPE | RETURN TYPE | NMETHODNAME
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}