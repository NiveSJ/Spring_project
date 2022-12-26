package se.lexicon;

import org.springframework.stereotype.Component;

@Component("MyCoach")
public class TennisCoach implements Coach{
    public String getDailyWorkout() {
        return "Practise fore hand and back hand daily ";
    }
}
