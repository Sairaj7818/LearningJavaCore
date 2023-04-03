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

    // public String getName()  
    // {
    //     return name;
    // }
    // public void setName(String str)
    // {
    //     name = str; 
    // }
    
    // public int getAge()
    // {
    //     return age;
    // }
    // public void setAge(int n)
    // {
    //     age = n;
    // }
    
    //LETS USE "THIS" KEYWORD TO CREAT GETTER AND SETTER
    public String getName()  
    {
        return name;
    }
    public void setName(String name)
    {
       this.name = name;  //THIS KEYWORD WILL POINT IT TO OBJ OBJECT AND WILL AVOID CONFUSION BETWEEN SAME VARIABLE NAME.
    }
    
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age; //THIS KEYWORD WILL POINT IT TO OBJ OBJECT AND WILL AVOID CONFUSION BETWEEN SAME VARIABLE NAME.
    }


}