package spring01.app1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        @SuppressWarnings("resource")
		ApplicationContext con=new ClassPathXmlApplicationContext("beans.xml");
        Student s1=(Student)con.getBean("s1");
        System.out.println(s1.getSid());
        System.out.println(s1.getSname());
         
    }
}
