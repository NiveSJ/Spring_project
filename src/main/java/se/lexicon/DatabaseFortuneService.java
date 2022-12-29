package se.lexicon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se.lexicon.DAO.FortuneCSVReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class DatabaseFortuneService implements FortuneService {

    private Random myRandom = new Random();
    private List<String> fortuneList = new ArrayList<>();

    @Autowired
    public DatabaseFortuneService(FortuneCSVReader CSVReader) {


        fortuneList = CSVReader.fortuneReader();

    }

    public String getFortune() {
        System.out.println(">> Inside database fortune service!!");

        String fortune = fortuneList.get(myRandom.nextInt(fortuneList.size()));

        return fortune;
    }
}
