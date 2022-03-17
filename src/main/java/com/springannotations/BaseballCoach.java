package com.springannotations;

public class BaseballCoach implements Coach
{
 // define a private field for the dependency
    private FortuneService fortuneService;


    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    // define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService){
        fortuneService=theFortuneService;
    }



    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }
}
