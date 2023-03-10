package javaExampleJPAandHibernate.ex_003_hibernate_get_and_insert;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {

    private static SessionFactory factory;

    static {
        try {
             factory = new AnnotationConfiguration()
                    .configure("/javaExampleJPAandHibernate/ex_003_hibernate_get_and_insert/hibernate.cfg.xml")
                    .buildSessionFactory();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory() {
        return factory;
    }

}
