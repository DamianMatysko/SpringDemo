package newproject.springDemoAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext2.xml");
        Coach coach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
        boolean result = (coach==alphaCoach);
        System.out.println("Pointing to  the same object: "+result);
        System.out.println("Memory location fot theCoach: "+coach);
        System.out.println("Memory location fot alphaCoach: "+alphaCoach);
        context.close();
    }
}
