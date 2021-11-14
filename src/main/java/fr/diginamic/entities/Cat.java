package fr.diginamic.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import fr.diginamic.abstracts.Animals;

@Entity
public class Cat extends Animals {

    @Column
    private String chipId;

    public Cat() {
    }

    public Cat(String chipId, Date birth, String color, PetStore petstore) {
        super(birth, color, petstore);
        this.chipId = chipId;
    }

    public String getChipId() {
        return chipId;
    }

    public void setChipId(String chipId) {
        this.chipId = chipId;
    }

}
