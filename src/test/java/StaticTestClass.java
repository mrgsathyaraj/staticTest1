/*
static variable scope: static and non static

Non static variable scope : Non static method

static variable can be overrode during ruh time and method cannot be overriden

static final will act as constant and assign value earler

static runs earlier one the class is loaded before the constructor with sequance order of the methods and variables
*/

public class StaticTestClass {

    static int num=100;

    int number=101;

    public void Test()
    {
        System.out.println("The static variable can be printed all the places even non static "+num);
    }

    public static void Testme()
    {
        //Test();

        System.out.println("Non static method cannot be referenced here in static method ");
        System.out.println("The static variable value num is "+num);
    }

    public static void Testyou()
    {

        Testme();        System.out.println("Static method can only call static method");
        System.out.println("The non static variable value cannot be printed in static method : ");

    }

}
