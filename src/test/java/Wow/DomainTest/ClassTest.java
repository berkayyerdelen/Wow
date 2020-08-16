package Wow.DomainTest;

import Wow.Domain.Class;
import Wow.Domain.ClassType;
import Wow.Domain.RacialType;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClassTest {

    @Test
    public void Should_Have_Create_Class() {
        ClassMock testClass = new ClassMock(ClassType.Priest, RacialType.BloodElf, new ArrayList<String>() {
            {
                add("Arcane Tomb");
            }
        });
        assertEquals(ClassType.Priest, testClass.getClasType());
        assertEquals(RacialType.BloodElf,testClass.getRacialType());
        assertEquals(1,testClass.getRacialSkills().stream().count());
    }

}

class ClassMock extends Class {
    public ClassMock(ClassType classType, RacialType racialType, ArrayList<String> racialSkils) {
        ClasType = classType;
        RacialSkills = racialSkils;
        RacialType = racialType;
    }
}