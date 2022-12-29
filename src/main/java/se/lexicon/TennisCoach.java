package se.lexicon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.SQLOutput;

@Component

public class TennisCoach implements Coach {
    @Autowired  // field Injection
    @Qualifier("databaseFortuneService")
    private FortuneService dailyFortune;

    @PostConstruct
    public void doStartup() {
        System.out.println("To demo Init method");
    }

    @PreDestroy
    public void doDestroy(){
        System.out.println("At Destroy method");
    }
  /*  //Constructor Injection
    @Autowired  // Not necessary if the class has only one constructor

    public TennisCoach(FortuneService dailyFortune) {
        this.dailyFortune = dailyFortune;

    }*/

    // setter Injection
    public TennisCoach() {
        System.out.println(">> Tennis coach: Inside default constructor");
    }

    /* @Autowired
     public void setDailyFortune(FortuneService dailyFortune) {
         System.out.println(">> Tennis coach: Inside setDailyFortune()");
         this.dailyFortune = dailyFortune;
     }*/
    /*@Autowired  // Method Injection
    public void doAutoWire(FortuneService dailyFortune) {
        System.out.println(">> Tennis coach: Inside doAutoWired()");
        this.dailyFortune = dailyFortune;
    }*/


    public String getDailyWorkout() {
        return " >> Practise fore hand and back hand daily ";
    }

    public String getDailyFotrunes() {
        return dailyFortune.getFortune();
    }


}
