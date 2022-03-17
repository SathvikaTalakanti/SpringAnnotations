package com.springannotations;

public class CricketCoach implements  Coach
{
    private FortuneService fortuneService;

    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        System.out.println("In CrciketCoach  email Setter Method");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team)
    {
        System.out.println("In CrciketCoach team Setter Method");
        this.team = team;
    }


    public CricketCoach()
    {
        System.out.println("In CrciketCoach Constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("In CrciketCoach Setter Method");
        this.fortuneService = fortuneService;

    }


    @Override
    public String getDailyWorkout() {
        return "cricket daily workout";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
