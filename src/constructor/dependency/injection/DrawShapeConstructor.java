package constructor.dependency.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawShapeConstructor {

	public static void main(String[] args) {
		

	ApplicationContext context = new ClassPathXmlApplicationContext("Spring3.xml");
	ShapeConstructor shapeConstructor = (ShapeConstructor) context.getBean("shapeZero");
	shapeConstructor.draw();

	
}

}