package getter.setter.dependency.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.test.Triangle;

public class DrawShape {

	public static void main(String[] args) {
		

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring1.xml");
		Shape shape = (Shape) context.getBean("shape");
		shape.draw();
	}
}
