package collectios.dependency.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawShapeCollections {


	public static void main(String[] args) {
		

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring2.xml");
		ShapeCollections shape = (ShapeCollections) context.getBean("ShapeCollections");
		shape.draw();	
	}
}
