package collectios.dependency.injection;

import java.util.List;

public class ShapeCollections {
	
	private List<PointCollections> pointlist;
	

	public List<PointCollections> getPointlist() {
		return pointlist;
	}

	public void setPointlist(List<PointCollections> pointlist) {
		this.pointlist = pointlist;
	}



	public void draw()
	{
		pointlist.forEach((element) -> System.out.println("Points: " + element.getX()+ " " + element.getY()));

	}
	
	
}
