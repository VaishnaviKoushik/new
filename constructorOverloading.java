class Box{
	double length,width,height;

	Box(double l,double w,double h){
	length=l;
	width=w;
	height=h;
	}

	Box(){
	length=1;
	width=1;
	height=1;
	}
	
	Box(double l,double w){
	length=l;
	width=w;
	height=1;
	}
	
	
double calculateVolume(){
	return length*width*height;
	}
double calculateSurface(){
	return 2*(length*width+width*height+height*length);
	}

void displayDetails(){
	System.out.println("Box Dimensions:" +length+"x"+width+"x"+height);
	System.out.println("Volume:"+calculateVolume());
	System.out.println("SA:"+calculateSurface());
	}
}

public class constructorOverloading{
	public static void main(String[] args){
		Box Box5;
		Box Box1=new Box(1,2,3);
		Box5=Box1;	
		Box Box2=new Box(3,4,6);
		Box Box3=new Box();
		Box Box4=new Box(3,6);


		Box1.displayDetails();
		Box5.displayDetails();
		Box2.displayDetails();
		Box3.displayDetails();
		Box4.displayDetails();

		
		System.out.println("Box1 Volume:" +Box1.calculateVolume());
		System.out.println("Box2 Volume:" +Box2.calculateVolume());
		System.out.println("Box3 Volume:" +Box3.calculateVolume());
		System.out.println("Box4 Volume:" +Box4.calculateVolume());
		System.out.println("Box5 Volume:" +Box5.calculateVolume());
		
		System.out.println("Box1 SurfaceArea:"+Box1.calculateSurface());
		System.out.println("Box2 SurfaceArea:"+Box2.calculateSurface());
		System.out.println("Box3 SurfaceArea:"+Box3.calculateSurface());
		System.out.println("Box4 SurfaceArea:"+Box4.calculateSurface());
		System.out.println("Box5 SurfaceArea:"+Box5.calculateSurface());





		}	
}
