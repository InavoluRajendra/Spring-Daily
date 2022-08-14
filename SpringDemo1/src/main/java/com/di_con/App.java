package com.di_con;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext c=new ClassPathXmlApplicationContext("Bean.xml");
       // AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(AppConfig.class);
        Manager emp=(Manager) c.getBean("manager");
        emp.dowork();emp.getsalary();
        emp.callmeet();
        
        
    }
}
