package com.springannotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")//if we give only @component, then the default bean id is "tennisCoach"
public class TennisCoach implements Coach{

    @Autowired//field autowiring(better)
    @Qualifier("happyFortuneService")//if there are multiple implementations
    private FortuneService fortuneService;

    public TennisCoach(){
        System.out.println("this is tennis constructor");
    }

//    @Autowired//setter injection
//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "practice the spring module";
    }

    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}