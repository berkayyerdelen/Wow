package Wow.Domain;

import Wow.Exception.InCombatException;
import Wow.Exception.NotEnoughManaException;

public class Priest extends Character {
    public boolean isInCombat() {
        return IsInCombat;
    }

    public void setInCombat(boolean inCombat) {
        IsInCombat = inCombat;
    }

    public boolean IsInCombat;

    public void Resuraction(double resurectionCost) throws NotEnoughManaException, InCombatException {

        if (resurectionCost > Mana) {
            throw new NotEnoughManaException("You don't have enough Mana!");
        }
        if (IsInCombat){
            throw  new InCombatException("You're in Combat");
        }
        Mana -= resurectionCost;
    }
    public int DrinkMana(double manaDrink) throws InCombatException, InterruptedException {
        if (IsInCombat) throw new InCombatException("You're in Combat");
        var currentSpan = System.currentTimeMillis();
        var perTickRegen = manaDrink/30;
        for (int i = 0; i <30; i++) {

            Thread.sleep(1000);
            Mana+=perTickRegen;
        }
        return (int) (System.currentTimeMillis()-currentSpan)/1000;
    }
}
