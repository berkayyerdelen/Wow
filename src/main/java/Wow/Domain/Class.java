package Wow.Domain;

import java.util.ArrayList;
import java.util.List;

public abstract class Class {
    public ClassType getClasType() {
        return ClasType;
    }

    public void setClasType(ClassType clasType) {
        ClasType = clasType;
    }

    public Wow.Domain.RacialType getRacialType() {
        return RacialType;
    }

    public void setRacialType(Wow.Domain.RacialType racialType) {
        RacialType = racialType;
    }

    public ArrayList<String> getRacialSkills() {
        return RacialSkills;
    }

    public void setRacialSkills(ArrayList<String> racialSkills) {
        RacialSkills = racialSkills;
    }

    protected ClassType ClasType;
    protected RacialType RacialType;
    protected ArrayList<String> RacialSkills;
}
