package Wow.Domain;

import java.util.ArrayList;

public abstract class Character extends Class {
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getHitPoints() {
        return HitPoints;
    }

    public void setHitPoints(Double hitPoints) {
        HitPoints = hitPoints;
    }

    public double getMana() {
        return Mana;
    }

    public void setMana(double mana) {
        Mana = mana;
    }

    public Wow.Domain.Gender getGender() {
        return Gender;
    }

    public void setGender(Wow.Domain.Gender gender) {
        Gender = gender;
    }

    public Character(String name, Double hitPoints, double mana, Wow.Domain.Gender gender) {
        Name = name;
        HitPoints = hitPoints;
        Mana = mana;
        Gender = gender;

    }
    public Character(String name, Double hitPoints, double mana, Wow.Domain.Gender gender, ClassType classType, RacialType racialType, ArrayList<String> racialSkills) {
        super(classType,racialType,racialSkills);
        Name = name;
        HitPoints = hitPoints;
        Mana = mana;
        Gender = gender;
    }

    public Character() {
    }

    public String Name;
    public Double HitPoints;
    public double Mana;
    public Gender Gender;


}
