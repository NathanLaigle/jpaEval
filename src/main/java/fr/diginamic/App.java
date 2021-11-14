package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.diginamic.entities.PetStore;
import fr.diginamic.entities.Product;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("petstore");
        EntityManager em = emf.createEntityManager();

        PetStore petStore = em.find(PetStore.class, 1L);

        Product product = em.find(Product.class, 10L);

        petStore.addProduct(product);

        em.getTransaction().begin();

        em.persist(petStore);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
