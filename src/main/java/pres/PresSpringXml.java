package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXml {
    public static void main(String[] args) {
        // nous avons crée ici un objet de type ApplicationcContext
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-ioc.xml");
        // nous recherchons ici sur un objet qui s'appelle metier
        IMetier metier= (IMetier) context.getBean("metier");
        // test
        System.out.println(metier.calcul());
    }
}
