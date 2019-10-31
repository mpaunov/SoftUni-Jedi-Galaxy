
public class Engine {
    private ConsoleReader reader;
    private Enemy enemy;
    private Player player;
    private String command;

    public Engine(ConsoleReader reader, Enemy enemy, Player player) {
        this.reader = reader;
        this.enemy = enemy;
        this.player = player;
        this.command = "";
    }

    public void run() {
        this.command = this.reader.readLine();
        while (!command.equals("Let the Force be with you")) {

            int[] playerPostion =
                    InputParser.parseIntegerArray(this.command);

            int[] enemyPosition =
                    InputParser.parseIntegerArray(this.reader.readLine());

            int enemyRow = enemyPosition[0];
            int enemyCol = enemyPosition[1];

            enemy.destroyStars(enemyRow, enemyCol);

            int playerRow = playerPostion[0];
            int playerCol = playerPostion[1];

            this.player.collectStars(playerRow, playerCol);

            this.command = this.reader.readLine();
        }
    }
}
