class Box{
	double length,width,height;

	Box(double l,double w,double h){
	length=l;
	width=w;
	height=h;
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

public class BoxExample{
	public static void main(String[] args){
		
		Box Box1=new Box(1,2,3);
		Box Box2=new Box(3,4,6);

		Box1.displayDetails();
		Box2.displayDetails();
		
		System.out.println("Box1 Volume:" +Box1.calculateVolume());
		System.out.println("Box2 Volume:" +Box2.calculateVolume());
		System.out.println("Box1 SurfaceArea:"+Box1.calculateSurface());
		System.out.println("Box2 SurfaceArea:"+Box2.calculateSurface());
		}	
}
