package learnJava;

public class SimpleStaticExample {
	 // This is a static method
    static void myMethod()
    {
        System.out.println("myMethod");
    }
 
    public static void main(String[] args)
    {
          /* You can see that we are calling this
           * method without creating any object. 
           */
           myMethod();
    }
}
class JavaExample{
	   static int num;
	   static String mystr;
	   static{
	      num = 97;
	      mystr = "Static keyword in Java";
	      System.out.println("Value of num: "+num);
	      System.out.println("Value of mystr: "+mystr);
	   }
	}
