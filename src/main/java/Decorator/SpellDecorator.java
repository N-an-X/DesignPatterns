package Decorator;

public abstract class SpellDecorator implements Spell {

    protected Spell spell;

    public SpellDecorator(Spell spell) {
        this.spell = spell;
    }
}
