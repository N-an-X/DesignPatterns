package Factory;

public class NinjaFactory implements EnemyFactory {

    @Override
    public Enemy makeEnemy() {
        return new Ninja();
    }
}
