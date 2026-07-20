package car.example.setter.injection;

import car.example.setter.injection.car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationetterInjection.xml");
        car mycar = (car) context.getBean("mycar");
    mycar.display();
    }
}
