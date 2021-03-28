package Decorator;

public class RPG {
    public static void main(String[] args) {

        Mage elementalMage = new Mage(
            new FireDecorator(
                new EarthDecorator(
                    new WaterDecorator(
                        new OrbSpell(20)
                    )
                )
            )
        );

        Mage fireMage = new Mage(
            new FireDecorator(
                new BeamSpell(50)
            )   
        );

        elementalMage.castSpell();
        fireMage.castSpell();
    }
}
