package Decorator;

//Concrete Component
public class OrbSpell implements Spell {

    private double damage;

    public OrbSpell(double damage) {
        this.damage = damage;
    }

    @Override
    public double cast() {
        System.out.println("Casting orb spell....");
        return damage;
    }
}
