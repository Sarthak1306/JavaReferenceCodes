public class MethOver{
  public int Area(int x) 
    { 
        System.out.println("Area of Square: "+x*x);
    } 
  
    public int Area(int x, int y) 
    { 
        System.out.println("Area of Rectangle: "+x*y); 
    } 
  
    
    public double Area(double x) 
    { 
        System.out.println("Area of Circle: "+(x*x)*3.14); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        MethOver a = new MethOver(); 
        a.Area(10); 
        a.Area(10, 20); 
        a.Area(13.25);
    } 
} 

