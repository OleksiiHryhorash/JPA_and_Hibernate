package javaExampleJPAandHibernate.ex_002_hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Created by Asus on 01.11.2017.
 */
public class Main {

    public static void main(String[] args) {
        ClientsDetails details = new ClientsDetails();
        details.setAge(20);
        details.setId(1);
        details.setName("Vasiliy");
        details.setPhone("+380950750703");

        SessionFactory factory = new AnnotationConfiguration()
                .configure("/javaExampleJPAandHibernate/ex_002_hibernate/hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();
        session.save(details);
        session.getTransaction().commit();
        session.close();
    }

}
