class Box{
	double width;
	double height;
	double depth;
	
	Box(Box ob)
	{
		width=ob.width;
		height=ob.height;
		depth=ob.depth;
	}
	
	Box(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	
	
double volume(){
	return width*height*depth;

	}
}

public class cloning{
	public static void main(String[] args){
		Box mybox1=new Box(10,20,15);
		Box myclone=new Box(mybox1);
		double vol;
		vol=myclone.volume();
		System.out.println("Volume of myclone: "+vol);
	}
}
		
		