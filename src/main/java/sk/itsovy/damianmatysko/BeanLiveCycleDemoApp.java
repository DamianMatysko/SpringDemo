package sk.itsovy.damianmatysko;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLiveCycleDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLiveCycle-applicationContext.xml");
        Coach theCoach = context.getBean("myCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        context.close();
    }
}
