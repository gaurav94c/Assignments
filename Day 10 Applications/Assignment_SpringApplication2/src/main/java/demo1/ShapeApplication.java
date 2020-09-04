package demo1;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.*;
import org.springframework.core.io.ClassPathResource;
import com.manipal.spring_core_demos.Triangle;
import com.manipal.spring_core_demos.Line;
import com.manipal.spring_core_demos.Point;;

public class ShapeApplication {

	public static void main(String[] args) {
		// BeanFactory factory=new XmlBeanFactory(new ClassPathResource("spring.xml"));

		BeanFactory shape = new XmlBeanFactory(new ClassPathResource("spring.xml"));
		Triangle t1 = (Triangle) shape.getBean("triangle1");

		System.out.println();
		Line l1 = (Line) shape.getBean("line1");

		Point p4 = l1.getP1(), p5 = l1.getP2();

		System.out.println("Instance Creation using Bean Factory");
		System.out.println("Coordinates for Line Instance--->");
		System.out.println(p4.getxCordinate() + " " + p4.getyCordinate());
		System.out.println(p5.getxCordinate() + " " + p5.getyCordinate());

		Point p1= t1.getP1(), p2 = t1.getP2(), p3 = t1.getP3();
		System.out.println("Coordinates for Triangle Instance--->");
		System.out.println(p1.getxCordinate() + " " + p1.getyCordinate());
		System.out.println(p2.getxCordinate() + " " + p2.getyCordinate());
		System.out.println(p3.getxCordinate() + " " + p3.getyCordinate());

	}

}
