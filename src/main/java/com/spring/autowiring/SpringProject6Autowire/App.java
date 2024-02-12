package com.spring.autowiring.SpringProject6Autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("Config.xml");
        Person p=(Person)ctx.getBean("person");
        System.out.println(p);
    }
}
