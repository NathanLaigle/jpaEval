package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.diginamic.entities.Address;
import fr.diginamic.entities.PetStore;

public class PetstoreTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("petstore");
        EntityManager em = emf.createEntityManager();

        PetStore petStore = new PetStore("store1", "Jean", new Address("63bis", "Rivoli", "34000", "Montpellier"));
        PetStore petStore2 = new PetStore("store2", "Pierre", new Address("3", "Rue du swagg", "34000", "Montpellier"));
        PetStore petStore3 = new PetStore("store3", "Billou",
                new Address("26", "Rue William Webb Ellis", "34070", "Montpellier"));

        em.getTransaction().begin();

        em.persist(petStore);
        em.persist(petStore2);
        em.persist(petStore3);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
