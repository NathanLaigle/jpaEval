package fr.diginamic;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.diginamic.entities.Cat;
import fr.diginamic.entities.Fish;
import fr.diginamic.entities.PetStore;
import fr.diginamic.enums.FishLivEnv;

public class AnimalTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("petstore");
        EntityManager em = emf.createEntityManager();

        PetStore petStore = em.find(PetStore.class, 1L);
        PetStore petStore2 = em.find(PetStore.class, 3L);

        Cat cat = new Cat("catChipId", new Date(10L), "White", petStore);
        Cat cat2 = new Cat("catChipId2", new Date(10L), "Black", petStore);

        Fish fish = new Fish(FishLivEnv.FRESH_WATER, new Date(10L), "Red", petStore2);

        em.getTransaction().begin();

        em.persist(cat);
        em.persist(cat2);
        em.persist(fish);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
