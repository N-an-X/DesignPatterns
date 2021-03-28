package Factory;

public class Level {

    private Enemy enemy;
    private EnemyFactory enemyFactory;

    public Level(EnemyFactory enemyFactory) {
        this.enemyFactory = enemyFactory;
    }

    public void sendEnemy() {
        this.enemy = enemyFactory.makeEnemy();
    }
}
