package Wow.DomainTest;

import Wow.Domain.Priest;
import Wow.Exception.InCombatException;
import Wow.Exception.NotEnoughManaException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PriestTest {


    @Test
    public void  Should_Priest_Cast_Resuraction_In_Combat(){
        var aziel = new Priest(){
            {
                IsInCombat = true;
                Mana=10000;
            }
        };
        Throwable exception = assertThrows(InCombatException.class, ()-> aziel.Resuraction(5000));
        assertEquals("You're in Combat",exception.getMessage());
    }
    @Test
    public void Should_Priest_Cast_Resuraction_With_Low_Mana(){
        var aziel = new Priest(){
            {
                IsInCombat = false;
                Mana=500;
            }
        };
        Throwable exception = assertThrows(NotEnoughManaException.class, ()-> aziel.Resuraction(1000));
        assertEquals("You don't have enough Mana!",exception.getMessage());
    }
    @Test
    public void Should_Drink_Mana() throws InCombatException, InterruptedException {
        var aziel = new Priest(){
            {
                IsInCombat = false;
                Mana=0;
            }
        };
        var timeSpan =aziel.DrinkMana(7500.0);
        assertEquals(30,timeSpan);
        assertEquals(7500,aziel.getMana());
    }
}
