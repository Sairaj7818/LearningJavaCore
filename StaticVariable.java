public class StaticVariable
{
        public static void main (String args[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 2000;
        obj1.name = "iPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 3000;
        obj2.name = "Galaxy";

        Mobile.name = "Smartphone";

        obj1.show();
        obj2.show();
    }

}


class Mobile
{
    String brand;
    int price;
    //String name; //normal variable
    static String name; //static variable

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
}