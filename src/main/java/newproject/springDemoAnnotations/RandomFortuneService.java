package newproject.springDemoAnnotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] data = {
            "WebStorm brings you smart coding assistance for JavaScript",
            "Enjoy code completion, powerful navigation features",
            "Problems with magnets links are fixed by upgrading your !"
    };
    private Random rnd = new Random();

    @Override
    public String getFortune() {
        int index = rnd.nextInt(data.length);
        return data[index];
    }
}
