public class Main
{
    public static void printPlayerStats(Player player)
    {
        System.out.printf("name: " + player.name +
                "\nsex: " + player.sex +
                "\njob: " + player.job +
                "\nhealth: " + player.hp +
                "\nstrength: " + player.str +
                "\ndefense: " + player.def +
                "\nconcentration: " + player.con +
                "\nwisdom: " + player.wis +
                "\nspeed: " + player.spd +
                "\nluck: " + player.lck +
                "\nlevel: " + player.level +
                "\nxp: %.0f", player.xp);
    }

    public static void printEnemyStats(Enemy enemy)
    {
        System.out.println("name: " + enemy.name +
                "\nhealth: " + enemy.hp +
                "\nstrength: " + enemy.str +
                "\ndefense: " + enemy.def +
                "\nconcentration: " + enemy.con +
                "\nwisdom: " + enemy.wis +
                "\nspeed: " + enemy.spd +
                "\nluck: " + enemy.lck);
    }


    public static void main(String[] args)
    {
        Player player1 = new Player("Dude", "fighter", "male");
        Player player2 = new Player("Ma'am", "thief", "female");

        Enemy enemy1 = new Enemy("Bird", "flyer");
        Enemy enemy2 = new Enemy("Goblin", "attacker");
        Enemy enemy3 = new Enemy("Warlock", "magician");

        System.out.println("Player Stats");
        printPlayerStats(player1);

        System.out.println("\n");

        printPlayerStats(player2);

        System.out.println("\n");

        System.out.println("Enemy Stats");
        printEnemyStats(enemy1);

        System.out.println("\n");

        printEnemyStats(enemy2);

        System.out.println("\n");

        printEnemyStats(enemy3);

        System.out.println("\n");

        player1.xp = 1022;
        player2.xp = 1022;

        while(player1.xp >= Math.pow(2, player1.level))
        {
            player1.checkLevelUp();
        }

        System.out.println("\n");

        while(player2.xp >= Math.pow(2, player2.level))
        {
            player2.checkLevelUp();
        }

        System.out.println("\n");

        printPlayerStats(player1);

        System.out.println("\n");

        printPlayerStats(player2);
    }
}