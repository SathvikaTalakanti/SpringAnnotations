package com.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// This class implements singleton and prototype scopes
// by default scope is singleton
// Singleton creates only one object for all requests
// prototype create one object for every request

public class BeanScopeDemoApp
{
  public static void main(String[] args)
  {
      //load the spring configuration file
      ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope_applicationContext.xml");


      // retrieve bean from spring container
  // by default they are singleton scope
      Coach theCoach= context.getBean("myCoach",Coach.class);
      Coach alphaCoach= context.getBean("myCoach",Coach.class);

      // check if they are the same
     boolean result= (theCoach==alphaCoach);

     // print results

      System.out.println("\npointing to the same object "+result);
      System.out.println("\nmemory location for theCoach: "+theCoach);
      System.out.println("\nmemory location for alphaCoach: "+alphaCoach);



      context.close();
  }
}
