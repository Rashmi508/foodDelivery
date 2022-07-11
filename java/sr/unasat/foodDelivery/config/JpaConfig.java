package sr.unasat.foodDelivery.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaConfig {

    private static final String PERSISTENCE_UNIT_NAME = "PERSISTENCE";
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    private static EntityManager entityManager = factory.createEntityManager();

    public static EntityManagerFactory getEntityManagerFactory() {
        return factory;
    }

    public static EntityManager getEntityManager() {

        entityManager.clear();

        return entityManager;
    }


    public static void shutdown() {
        if (entityManager != null) {
            entityManager.close();
        }

        if (factory != null) {
            factory.close();
        }
    }
}
