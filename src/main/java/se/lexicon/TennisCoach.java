package se.lexicon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    private FortuneService dailyFortune;

    @Autowired
    public TennisCoach(FortuneService dailyFortune) {
        this.dailyFortune = dailyFortune;

    }

    public String getDailyWorkout() {
        return "Practise fore hand and back hand daily ";
    }

    public String getDailyFotrunes() {
        return dailyFortune.getFortune();
    }


}
