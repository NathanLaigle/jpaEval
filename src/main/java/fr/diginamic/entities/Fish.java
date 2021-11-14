package fr.diginamic.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import fr.diginamic.abstracts.Animals;
import fr.diginamic.enums.FishLivEnv;

@Entity
public class Fish extends Animals {

    @Column
    private FishLivEnv livingEnv;

    public Fish() {
    }

    public Fish(FishLivEnv livingEnv, Date birth, String color, PetStore petstore) {
        super(birth, color, petstore);
        this.livingEnv = livingEnv;
    }

    public FishLivEnv getLivingEnv() {
        return livingEnv;
    }

    public void setLivingEnv(FishLivEnv livingEnv) {
        this.livingEnv = livingEnv;
    }

}
