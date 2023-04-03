public class EncapsulationGetSet
{
    public static void main( String args[])
    {
        Human obj = new Human();
        obj.setName("sairaj");
        obj.setAge(20);

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}

class Human
{ 
    private int age;  
    private String name; 

    public String getName()  
    {
        return name;
    }
    public void setName(String str)
    {
        name = str; 
    }
    
    public int getAge()
    {
        return age;
    }
    public void setAge(int n)
    {
        age = n;
    }
   


}