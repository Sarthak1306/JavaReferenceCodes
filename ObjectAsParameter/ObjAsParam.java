class BoxDimensions{

	int length;
	int breadth;
}

class DimensionAccess{

	void setDimensions(BoxDimensions data, int d1, int d2){
		data.length=d1;
		data.breadth=d2;
	}

	void getDimensions(BoxDimensions data){
		System.out.println("Length = "+data.length);
		System.out.println("Breadth = "+data.breadth);
	}

}

public class ObjAsParam{
	public static void main(String[] args) {
		BoxDimensions data = new BoxDimensions();
		DimensionAccess access = new DimensionAccess();
		access.setDimensions(data,50,100);
		access.getDimensions(data);
	}
}