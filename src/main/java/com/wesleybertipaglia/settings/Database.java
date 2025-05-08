package com.wesleybertipaglia.settings;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Database {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("chirpnest-pu");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public static void close() {
        emf.close();
    }
}
