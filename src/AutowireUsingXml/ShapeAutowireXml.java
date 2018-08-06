package AutowireUsingXml;

public class ShapeAutowireXml {
	
	private PointAutowireXml pointA1;
	private PointAutowireXml pointA2;
	private PointAutowireXml pointA3;
	

	
	public PointAutowireXml getPointA1() {
		return pointA1;
	}



	public void setPointA1(PointAutowireXml pointA1) {
		this.pointA1 = pointA1;
	}



	public PointAutowireXml getPointA2() {
		return pointA2;
	}



	public void setPointA2(PointAutowireXml pointA2) {
		this.pointA2 = pointA2;
	}



	public PointAutowireXml getPointA3() {
		return pointA3;
	}



	public void setPointA3(PointAutowireXml pointA3) {
		this.pointA3 = pointA3;
	}



	public void draw()
	{
		System.out.println("Point 1" + " "+ pointA1.getX() + " " + pointA1.getY());
		System.out.println("Point 2" + " "+ pointA2.getX() + " " + pointA2.getY());
		System.out.println("Point 3" + " "+ pointA3.getX() + " " + pointA3.getY());
	}
	
	
}
