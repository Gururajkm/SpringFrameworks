package com.jsp.demo.module1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println("project execution started......!!");
        ApplicationContext context=new ClassPathXmlApplicationContext("com/jsp/demo/module1/Config1.xml");
        //upcasting
        
        Student a=(Student)context.getBean("Student1");
        System.out.println(a);
        
//        Student b=(Student)context.getBean("Student2");
//        System.out.println(b);
        
     //   Student c=(Student)context.getBean("Student3");
     //   System.out.println(c);
       
        
        
        System.out.println("project Execution completed......!!");
        
        
    }
}
