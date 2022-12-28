package se.lexicon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    private FortuneService dailyFortune;
  /*  //Constructor Injection
    @Autowired  // Not necessary if the class has only one constructor

    public TennisCoach(FortuneService dailyFortune) {
        this.dailyFortune = dailyFortune;

    }*/

    // setter Injection
    public TennisCoach(){
        System.out.println(">> Tennis coach: Inside default constructor");
    }
    @Autowired
    public void setDailyFortune(FortuneService dailyFortune) {
        System.out.println(">> Tennis coach: Inside setDailyFortune()");
        this.dailyFortune = dailyFortune;
    }

    public String getDailyWorkout() {
        return " >> Practise fore hand and back hand daily ";
    }

    public String getDailyFotrunes() {
        return dailyFortune.getFortune();
    }


}
