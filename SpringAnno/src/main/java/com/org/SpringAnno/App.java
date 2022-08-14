package com.org.SpringAnno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(AppConfig.class);
        Manager emp=con.getBean(Manager.class);
        emp.dowork();emp.getsalary();
        
    }
}
