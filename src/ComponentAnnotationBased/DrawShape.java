package ComponentAnnotationBased;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ApplicationContext;
import ComponentAnnotationBased.Shape;


@SpringBootConfiguration
public class DrawShape {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(DrawShape.class, args);
		Shape shape = (Shape) context.getBean(Shape.class);
		shape.draw();
	
		
	}
}
