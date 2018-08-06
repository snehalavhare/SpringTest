package AutowireUsingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.test.Triangle;

public class DrawShapeAutowireXml {

	public static void main(String[] args) {
		

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring4.xml");
		ShapeAutowireXml shape = (ShapeAutowireXml) context.getBean("shapeAutowire");
		shape.draw();
	}
}
