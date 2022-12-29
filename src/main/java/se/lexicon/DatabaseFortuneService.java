package se.lexicon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se.lexicon.DAO.FortuneCSVReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class DatabaseFortuneService implements FortuneService {
    @Autowired
    private FortuneCSVReader CSVReader;
    private Random myRandom = new Random();


    List<String> fortuneList = new ArrayList<String>();

    public List<String> getFortuneList() {
        return fortuneList;
    }

    public void setFortuneList(List<String> fortuneList) {
        this.fortuneList = CSVReader.fortuneReader();

    }


    public String getFortune() {
        System.out.println(">> Inside database fortune service!!");
        System.out.println("Fortune List" + fortuneList);
        System.out.println(myRandom.nextInt(3));
        String fortune = fortuneList.get(1);

        return fortune;
    }
}
