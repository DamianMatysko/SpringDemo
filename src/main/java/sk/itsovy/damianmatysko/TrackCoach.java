package sk.itsovy.damianmatysko;

public class TrackCoach implements Coach {

    private  FortuneService fortuneService;

    public TrackCoach() {

    }
    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5K poldeco";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it Nike: "+fortuneService.getFortune();
    }

    public void doMyStartupStuff(){
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }
    public void doMyClanupStuffYoyo(){
        System.out.println("TrackCoach: inside method doMyClanupStuffYoyo");
    }
}
