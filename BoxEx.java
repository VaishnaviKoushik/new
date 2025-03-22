class Box{
	double length,width,height;

	Box(double length,double width,double height){
	this.length=length;
	this.width=width;
	this.height=height;
	}
	
		boolean equals(Box o)
		{
			if(o.length==this.length && o.width==this.width && o.height==this.height)
			return true;
		else
			return false;
		}
}

public class BoxEx{
	public static void main(String [] args){
		Box Box1=new Box(1,2,3);	
		Box Box2=new Box(3,4,6);
		Box Box3=new Box(1,2,3);
		
			if(Box3.equals(Box1))
				System.out.println("Box3 and Box1 are same");
			else
				System.out.println("Box3 and Box1 are different");

			if(Box2.equals(Box1))
				System.out.println("Box2 and Box1 are same");
			else
				System.out.println("Box2 and Box1 are different");
	

	}
}