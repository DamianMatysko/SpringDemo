package sk.itsovy.damianmatysko;

public class CricetCoach implements Coach{

    private FortuneService fortuneService;
    private String emailAdress;
    private String team;

    public CricetCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        System.out.println("CricetCoach email adress setter");
        this.emailAdress = emailAdress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricetCoach team setter");
        this.team = team;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricetCoach setter");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast Bowlin for 15min!!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
