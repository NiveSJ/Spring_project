package se.lexicon;

import org.springframework.stereotype.Component;

@Component
public class DailyFortuneimpl implements FortuneService {
    public String getFortune() {
        return " >> Today is the great day!!";
    }
}
