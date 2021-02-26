class Processor {

	String company;
	int generation;
	String model;
	static GUI g;
	Processor(){}
	Processor(String c,int gen,String m, GUI g1){
		company = c;
		generation = gen;
		model = m;
		g = g1;

	}
}

class GUI {
	double price;
	String GUI_Model;
	GUI(){}
	GUI(double p, String m)
	{
		price = p;
		GUI_Model = m;
	}
	
}


public class Aggregation{

public static void main(String[] args) {

GUI g1 = new GUI(20000,"GTX1080");
GUI g2 = new GUI(35000.5,"GTX2080ti");	
Processor p1= new Processor("Intel",9,"i9",g1);
Processor p2 = new Processor("Ryzen",10,"Ryzen 5",g2);
System.out.println(g1.price);
System.out.println(p1.company);
System.out.println(p1.g.price);
System.out.println(p2.g.price);



}
}
