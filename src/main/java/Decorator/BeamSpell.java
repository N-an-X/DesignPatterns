package Decorator;

public class BeamSpell implements Spell {

    private double damage;

    public BeamSpell(double damage) {
        this.damage = damage;
    }

    @Override
    public double cast() {
        System.out.println("Casting beam spell...");
        return damage;
    }
}
