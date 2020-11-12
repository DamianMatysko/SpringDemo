package newproject.springDemoAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component  //("TennisCoach")
//@Scope("prototype")
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("Tennis coach: Default constructor");
    }
    /*
    @Autowired
    public void doSomeCarazyStuff(FortuneService fortuneService) {
        System.out.println("Tennis coach: Default fortuneService setter");
        this.fortuneService = fortuneService;
    }

    /*
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
 */

    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("TennisCoach: inside of doMyStartupStuff");
    }

    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("TennisCoach: inside of doMyCleanupStuff");
    }

    @Override
    public String getDailyWorkout() {
        return "Practise your backhand volley!!!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
