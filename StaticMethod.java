public class Constructor
{
        public static void main (String args[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 2000;
        //obj1.name = "iPhone";

        Mobile obj2 = new Mobile();
    }

}


class Mobile
{
    String brand;
    int price;
    //String name; //normal variable
    static String name; //static variable

    static  //STATIC METHOD DEFINED
    {
        name = "Phone";
        System.out.println("In static block.");
    }

    public Mobile()  //CONSTRUCTOR DEFINED
    {   
        brand = "";
        price = 200;
        System.out.println("In the constructor.");
    }

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
}