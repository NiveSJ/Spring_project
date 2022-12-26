package se.lexicon;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach= context.getBean("MyCoach", Coach.class);
        System.out.println(   coach.getDailyWorkout());
        context.close();



    }
}
