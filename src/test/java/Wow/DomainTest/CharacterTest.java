package Wow.DomainTest;

import Wow.Domain.ClassType;
import Wow.Domain.Gender;
import Wow.Domain.RacialType;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @Test
    public void Should_Create_Character(){

        var character = new CharacterMock(ClassType.Priest,RacialType.Undead,new ArrayList<>(){{add("Will of the forsaken");}},"Berkay",10000.0,8000.0,Gender.Male);
        assertEquals(ClassType.Priest, character.getClasType());
        assertEquals(RacialType.Undead,character.getRacialType());
        assertEquals(1,character.getRacialSkills().stream().count());
        assertEquals("Berkay",character.getName());
        assertEquals(10000.0,character.getHitPoints());
        assertEquals(8000.0,character.getMana());
        assertEquals(Gender.Male,character.getGender());
    }
}

class CharacterMock extends Wow.Domain.Character {
    public CharacterMock(ClassType classType, Wow.Domain.RacialType racialType, ArrayList<String> racialSkills, String name, Double hitPoints, Double mana, Wow.Domain.Gender gender) {
    ClasType =classType;
    RacialType =racialType;
    Gender = gender;
    HitPoints =hitPoints;
    Mana = mana;
    RacialSkills = racialSkills;
    Name =name;
    }
}