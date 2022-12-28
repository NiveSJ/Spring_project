package se.lexicon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        AnnotationConfigApplicationContext context= new
                AnnotationConfigApplicationContext(SportConfig.class);
        Coach coach= context.getBean("MyCoach", Coach.class);
        System.out.println( "Spring IOC Concept"+  coach.getDailyWorkout());
        context.close();



    }
}
