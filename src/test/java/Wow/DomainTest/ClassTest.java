package Wow.DomainTest;

import Wow.Domain.Class;
import Wow.Domain.ClassType;
import Wow.Domain.RacialType;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.*;

class ClassTest {

    @Test
    public void Should_Have_Create_Class() {
        ClassMock testClass = new ClassMock(ClassType.Priest, RacialType.BloodElf, new ArrayList<>() {
            {
                add("Arcane Tomb");
            }
        });
        assertEquals(ClassType.Priest, testClass.getClasType());
        assertEquals(RacialType.BloodElf,testClass.getRacialType());
        assertEquals(1, (long) testClass.getRacialSkills().size());
    }

    @Test
    public  void Should_Have_Create_With_Out_Parameters(){
        var classmock = new ClassMock();
        classmock.setClasType(ClassType.Rogue);
        classmock.setRacialType(RacialType.Undead);
        classmock.setRacialSkills(new ArrayList<>() {{
            add("Will of the Forsaken");
        }});
        assertEquals(ClassType.Rogue,classmock.getClasType());
        assertEquals(RacialType.Undead,classmock.getRacialType());
        assertTrue(classmock.getRacialSkills().stream().anyMatch(x -> x.equals("Will of the Forsaken")));
    }

}

class ClassMock extends Class {
    public ClassMock(ClassType classType, RacialType racialType, ArrayList<String> racialSkils) {
        ClasType = classType;
        RacialSkills = racialSkils;
        RacialType = racialType;
    }

    public ClassMock() {
    }
}