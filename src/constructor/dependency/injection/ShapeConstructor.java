package constructor.dependency.injection;

public class ShapeConstructor {
	
	private PointConstructor pointNo;
	
	public ShapeConstructor(PointConstructor pointNo)
	{
		this.pointNo = pointNo;
	}
	
	
	public void draw()
	{
		System.out.println(pointNo.toString());

	}
	
	
}
