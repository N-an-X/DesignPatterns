package Decorator;

public class WaterDecorator extends SpellDecorator {

    private double damage = 10;

    public WaterDecorator(Spell spell) {
        super(spell);
    }

    @Override
    public double cast() {
        System.out.println("Decorated spell with water ability");
        return damage + spell.cast();
    }
}
