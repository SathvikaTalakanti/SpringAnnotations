package com.springannotations;

// Spring bean lifecycle impementation
public class TrackCoach implements  Coach
{
private FortuneService fortuneService;
    public  TrackCoach()
    {

    }
    public TrackCoach(FortuneService fortuneService)
    {
        this.fortuneService=fortuneService;
    }

    public String getDailyWorkout()
    {
      return "run a hard 5k";
     }
    public String getDailyFortune()
    {
        return null;
    }

    // add an init method
    public  void doMyStartupStuff()
    {
        System.out.println("TrackCoah: inside method doMyStartupStuff");
    }

    // add a destory method
    public  void doMyCleanupStuff()
    {
        System.out.println("TrackCoah: inside method doMyCleanupStuff");
    }


}
