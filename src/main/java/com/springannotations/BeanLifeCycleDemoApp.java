package com.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// This class implements bean life cycle

public class BeanLifeCycleDemoApp
{
  public static void main(String[] args)
  {
      //load the spring configuration file
      ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycle_applicationContext.xml");


      // retrieve bean from spring container
  // by default they are singleton scope
      Coach theCoach= context.getBean("myCoach",Coach.class);

      System.out.println(theCoach.getDailyWorkout());

      context.close();
  }
}
