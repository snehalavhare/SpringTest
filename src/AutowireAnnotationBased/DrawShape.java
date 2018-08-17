package AutowireAnnotationBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawShape {

	public static void main(String[] args) {
		

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring5.xml");
		Shape shape = (Shape) context.getBean("shape");
		shape.draw();
	}
}
