package se.lexicon.DAO;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class FortuneCSVReader {

    public List<String> fortuneReader() {
        List<String> fortuneList = new ArrayList<String>();

        try (BufferedReader reader = Files.newBufferedReader(Paths.get("src/main/java/se/lexicon/DAO/fortune.txt"));) {

            fortuneList = reader.lines()
                    .flatMap(lineSplit -> Stream.of(lineSplit.split(",")))
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }


        return fortuneList;
    }
}
