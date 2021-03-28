package Decorator;

public class FireDecorator extends SpellDecorator {

    private double damage = 10;

    public FireDecorator(Spell spell) {
        super(spell);
    }

    @Override
    public double cast() {
        System.out.println("Decorated spell with fire ability");
        return damage + spell.cast();
    }
}
