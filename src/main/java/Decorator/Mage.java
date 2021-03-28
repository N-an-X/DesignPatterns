package Decorator;

public class Mage {

    private Spell spell;

    public Mage(Spell spell) {
        this.spell = spell;
    }

    public void castSpell() {
        double damage = spell.cast();
        System.out.println("Damage dealt: " + damage);
        System.out.println();
    }
}
