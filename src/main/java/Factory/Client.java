package Factory;

public class Client {

    public static void main(String[] args) {
        EnemyFactory enemyFactory = new NinjaFactory();
        Level level = new Level(enemyFactory);
    }
}
