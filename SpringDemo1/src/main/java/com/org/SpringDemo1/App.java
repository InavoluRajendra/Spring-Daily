package com.org.SpringDemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext con=new ClassPathXmlApplicationContext("Bean.xml");
        HelloWorldServiceClass hello=con.getBean("hellobean",HelloWorldServiceClass.class);
        Vendor1 v1=con.getBean("hellobean1",Vendor1.class);
        Vendor2 v2=con.getBean("hellobean2",Vendor2.class);
        hello.hello();
        v1.build();
        v2.builddoor();
        
        
    }
}
