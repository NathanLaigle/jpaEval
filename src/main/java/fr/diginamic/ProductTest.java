package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.diginamic.entities.Product;
import fr.diginamic.enums.ProdType;

public class ProductTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("petstore");
        EntityManager em = emf.createEntityManager();

        Product product = new Product("08M", "MiamMiam", ProdType.FOOD, 19.99);
        Product product2 = new Product("09M", "Truc", ProdType.CLEANING, 24.99);
        Product product3 = new Product("10M", "Bidul", ProdType.ACCESSORY, 99.99);

        em.getTransaction().begin();

        em.persist(product);
        em.persist(product2);
        em.persist(product3);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
