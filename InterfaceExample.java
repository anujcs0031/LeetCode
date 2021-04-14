import java.io.*;
    interface n1
{
    
    final int a = 10;
    
   void display(); // public and abstract 
}

public class Test implements n1
{
    
    public void display()
    {
        System.out.println("I am in display method");
    }
    
    
    public static void main(String args[])
    { 
        Test t = new Test();
        
        t.display();
        System.out.println(a);
    }

    
}















