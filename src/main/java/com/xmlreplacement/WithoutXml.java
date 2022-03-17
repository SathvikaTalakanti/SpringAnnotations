package com.xmlreplacement;

import com.springannotations.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

    public class WithoutXml{
        public static void main(String[] args) {
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Sports.class);

            Coach theCoach = context.getBean("thatSillyCoach", Coach.class);

            //call a method on the bean
            System.out.println(theCoach.getDailyWorkout());

            System.out.println(theCoach.getDailyFortune());

            //close context
            context.close();
        }
    }
