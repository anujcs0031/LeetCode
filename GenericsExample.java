class Generics<T>
{
    T obj;
  Generics(T obj)
    {
        this.obj = obj;
    }
 public T displayobj()
 {
    return this.obj;
     
 }
}

public class Solution
{
    public static void main(String args[])
    {
        Generics<Integer> g = new Generics<Integer>(15);
        System.out.println(g.displayobj());
        
    }
}