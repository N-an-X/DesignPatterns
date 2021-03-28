package Decorator;

public class EarthDecorator extends SpellDecorator {

    private double damage = 5;

    public EarthDecorator(Spell spell) {
        super(spell);
    }

    @Override
    public double cast() {
        System.out.println("Decorated spell with earth ability");
        return damage + spell.cast();
    }
}
