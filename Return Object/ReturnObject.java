class TestClass
{
   private int value;

   public TestClass(int i)
   {
      value = i;
   }

   
   TestClass DoubleIt()
   {
      TestClass temp = new TestClass(value * 2);

      return temp;
   }

   void show()
   {
      System.out.println("Value : " + value);
   }
}

public class ReturnObject
{
   public static void main(String[] args)
   {
      TestClass obj1 = new TestClass(10);
      TestClass obj2;

     
      obj2 = obj1.DoubleIt();
      obj2.show();
   }
}