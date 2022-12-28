package se.lexicon;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService{
    public String getFortune() {
        return ">> Inside Database fortune service";
    }
}
