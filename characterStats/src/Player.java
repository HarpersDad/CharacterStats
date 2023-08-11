import java.util.Random;

// Player Class
public class Player
{
    // sets up the player stats by initializing each field that we want them to have
    String name;
    String job;
    String sex;
    int level;
    int hp;
    int str;
    int def;
    int con;
    int wis;
    int spd;
    int lck;
    double xp;
    int xpToLevel = 2;

    String status;

    // inventory array
    Items[] inventory = new Items[25];

    // equipped items array
    Equipment[] equipment = new Equipment[11];

    // equipment slots
    Equipment mainWeapon; // 0
    Equipment offHand; // 1
    Equipment head; // 2
    Equipment neck; // 3
    Equipment chest; // 4
    Equipment hands; // 5
    Equipment ring; // 6
    Equipment belt; // 7
    Equipment legs; // 8
    Equipment feet; // 9
    Equipment back; // 10

    // Player constructor
    Player(String name, String job, String sex)
    {
        // creates the player by using the passed information
        if (name == null || name.isEmpty())
        {
            this.name = "Vagabond";
        }
        else
        {
            this.name = name;
        }

        this.job = job;
        this.sex = sex;
        this.level = 1;
        this.xp = 0;
        this.status = "Normal";

        // adds stats to the player based on the job chosen
        switch (job) {
            case "defender" -> {
                this.hp = 20;
                this.str = 2;
                this.def = 3;
                this.con = 3;
                this.wis = 2;
                this.spd = 1;
                this.lck = 1;
            }
            case "ranger" -> {
                this.hp = 10;
                this.str = 2;
                this.def = 2;
                this.con = 1;
                this.wis = 3;
                this.spd = 3;
                this.lck = 1;
            }
            case "fighter" -> {
                this.hp = 13;
                this.str = 3;
                this.def = 2;
                this.con = 1;
                this.wis = 1;
                this.spd = 3;
                this.lck = 2;
            }
            case "mage" -> {
                this.hp = 6;
                this.str = 1;
                this.def = 2;
                this.con = 3;
                this.wis = 3;
                this.spd = 2;
                this.lck = 1;
            }
            case "thief" -> {
                this.hp = 8;
                this.str = 1;
                this.def = 1;
                this.con = 3;
                this.wis = 2;
                this.spd = 3;
                this.lck = 2;
            }
            default -> {
                this.job = "vagrant";
                this.hp = 10;
                this.str = 2;
                this.def = 2;
                this.con = 2;
                this.wis = 2;
                this.spd = 2;
                this.lck = 2;
            }
        }

        // adds stats to the player based on the sex chosen
        switch (sex) {
            case "male" -> {
                this.hp += 3;
                this.str += 2;
                this.def += 2;
                this.con += 2;
                this.wis += 1;
                this.spd += 1;
                this.lck += 1;
            }
            case "female" -> {
                this.hp += 2;
                this.str += 1;
                this.def += 1;
                this.con += 1;
                this.wis += 2;
                this.spd += 3;
                this.lck += 2;
            }
            default -> {
                this.sex = "other";
                this.hp += 0;
                this.str += 0;
                this.def += 0;
                this.con += 0;
                this.wis += 0;
                this.spd += 0;
                this.lck += 0;
            }
        }
    }

    // method that levels the player up
    void checkLevelUp() {

        // while loops that checks if the players current xp is enough to level up
        while (this.xp >= Math.pow(xpToLevel, this.level)) {

            // sets the remaining xp as current xp
            this.xp = this.xp - Math.pow(xpToLevel, this.level);

            // adds a level to the player level
            this.level++;

            // increases stats based on job chosen
            switch (this.job) {
                case "defender" -> {
                    this.hp += (this.hp % this.level) + 4;
                    this.str += (this.str % this.level) + 2;
                    this.def += (this.def % this.level) + 3;
                    this.con += (this.con % this.level) + 1;
                    this.wis += (this.wis % this.level) + 2;
                    this.spd += (this.spd % this.level) + 1;
                    this.lck += (this.lck % this.level) + 1;
                }
                case "ranger" -> {
                    this.hp += (this.hp % this.level) + 2;
                    this.str += (this.str % this.level) + 2;
                    this.def += (this.def % this.level) + 1;
                    this.con += (this.con % this.level) + 2;
                    this.wis += (this.wis % this.level) + 3;
                    this.spd += (this.spd % this.level) + 3;
                    this.lck += (this.lck % this.level) + 1;
                }

                case "fighter" -> {
                    this.hp += (this.hp % this.level) + 3;
                    this.str += (this.str % this.level) + 3;
                    this.def += (this.def % this.level) + 2;
                    this.con += (this.con % this.level) + 2;
                    this.wis += (this.wis % this.level) + 1;
                    this.spd += (this.spd % this.level) + 2;
                    this.lck += (this.lck % this.level) + 1;
                }

                case "mage" -> {
                    this.hp += (this.hp % this.level) + 1;
                    this.str += (this.str % this.level) + 1;
                    this.def += (this.def % this.level) + 2;
                    this.con += (this.con % this.level) + 3;
                    this.wis += (this.wis % this.level) + 3;
                    this.spd += (this.spd % this.level) + 2;
                    this.lck += (this.lck % this.level) + 2;
                }

                case "thief" -> {
                    this.hp += (this.hp % this.level) + 2;
                    this.str += (this.str % this.level) + 1;
                    this.def += (this.def % this.level) + 1;
                    this.con += (this.con % this.level) + 3;
                    this.wis += (this.wis % this.level) + 2;
                    this.spd += (this.spd % this.level) + 3;
                    this.lck += (this.lck % this.level) + 2;
                }

                default -> {
                    this.hp += (this.hp % this.level) + 2;
                    this.str += (this.str % this.level) + 2;
                    this.def += (this.def % this.level) + 2;
                    this.con += (this.con % this.level) + 2;
                    this.wis += (this.wis % this.level) + 2;
                    this.spd += (this.spd % this.level) + 2;
                    this.lck += (this.lck % this.level) + 2;
                }
            }

            // print message that tells the user that the player has leveled up and the player's current level
            System.out.println("\n" + this.name + " Leveled Up!");
            System.out.println(this.name + " is now level " + this.level);
        }
    }

    // method for checking if an item is equipped and adding the appropriate buff
    void itemEquipped()
    {
        // checks equipped main weapon
        if (this.mainWeapon != null) {
            switch (this.mainWeapon.buff) {
                case "hp" -> this.hp += this.mainWeapon.buffAmount;
                case "str" -> this.str += this.mainWeapon.buffAmount;
                case "def" -> this.def += this.mainWeapon.buffAmount;
                case "con" -> this.con += this.mainWeapon.buffAmount;
                case "wis" -> this.wis += this.mainWeapon.buffAmount;
                case "spd" -> this.spd += this.mainWeapon.buffAmount;
                case "lck" -> this.lck += this.mainWeapon.buffAmount;
            }
        }

        // checks offhand weapon / armament
        if (this.offHand != null) {
            switch (this.offHand.buff) {
                case "hp" -> this.hp += this.offHand.buffAmount;
                case "str" -> this.str += this.offHand.buffAmount;
                case "def" -> this.def += this.offHand.buffAmount;
                case "con" -> this.con += this.offHand.buffAmount;
                case "wis" -> this.wis += this.offHand.buffAmount;
                case "spd" -> this.spd += this.offHand.buffAmount;
                case "lck" -> this.lck += this.offHand.buffAmount;
            }
        }

        // checks head gear
        if (this.head != null) {
            switch (this.head.buff) {
                case "hp" -> this.hp += this.head.buffAmount;
                case "str" -> this.str += this.head.buffAmount;
                case "def" -> this.def += this.head.buffAmount;
                case "con" -> this.con += this.head.buffAmount;
                case "wis" -> this.wis += this.head.buffAmount;
                case "spd" -> this.spd += this.head.buffAmount;
                case "lck" -> this.lck += this.head.buffAmount;
            }
        }

        // checks neck gear
        if (this.neck != null) {
            switch (this.neck.buff) {
                case "hp" -> this.hp += this.neck.buffAmount;
                case "str" -> this.str += this.neck.buffAmount;
                case "def" -> this.def += this.neck.buffAmount;
                case "con" -> this.con += this.neck.buffAmount;
                case "wis" -> this.wis += this.neck.buffAmount;
                case "spd" -> this.spd += this.neck.buffAmount;
                case "lck" -> this.lck += this.neck.buffAmount;
            }
        }

        // checks chest gear
        if (this.chest != null) {
            switch (this.chest.buff) {
                case "hp" -> this.hp += this.chest.buffAmount;
                case "str" -> this.str += this.chest.buffAmount;
                case "def" -> this.def += this.chest.buffAmount;
                case "con" -> this.con += this.chest.buffAmount;
                case "wis" -> this.wis += this.chest.buffAmount;
                case "spd" -> this.spd += this.chest.buffAmount;
                case "lck" -> this.lck += this.chest.buffAmount;
            }
        }

        // checks hand gear
        if (this.hands != null) {
            switch (this.hands.buff) {
                case "hp" -> this.hp += this.hands.buffAmount;
                case "str" -> this.str += this.hands.buffAmount;
                case "def" -> this.def += this.hands.buffAmount;
                case "con" -> this.con += this.hands.buffAmount;
                case "wis" -> this.wis += this.hands.buffAmount;
                case "spd" -> this.spd += this.hands.buffAmount;
                case "lck" -> this.lck += this.hands.buffAmount;
            }
        }

        // checks ring gear
        if (this.ring != null) {
            switch (this.ring.buff) {
                case "hp" -> this.hp += this.ring.buffAmount;
                case "str" -> this.str += this.ring.buffAmount;
                case "def" -> this.def += this.ring.buffAmount;
                case "con" -> this.con += this.ring.buffAmount;
                case "wis" -> this.wis += this.ring.buffAmount;
                case "spd" -> this.spd += this.ring.buffAmount;
                case "lck" -> this.lck += this.ring.buffAmount;
            }
        }

        // checks belt gear
        if (this.belt != null) {
            switch (this.belt.buff) {
                case "hp" -> this.hp += this.belt.buffAmount;
                case "str" -> this.str += this.belt.buffAmount;
                case "def" -> this.def += this.belt.buffAmount;
                case "con" -> this.con += this.belt.buffAmount;
                case "wis" -> this.wis += this.belt.buffAmount;
                case "spd" -> this.spd += this.belt.buffAmount;
                case "lck" -> this.lck += this.belt.buffAmount;
            }
        }

        // checks leg gear
        if (this.legs != null) {
            switch (this.legs.buff) {
                case "hp" -> this.hp += this.legs.buffAmount;
                case "str" -> this.str += this.legs.buffAmount;
                case "def" -> this.def += this.legs.buffAmount;
                case "con" -> this.con += this.legs.buffAmount;
                case "wis" -> this.wis += this.legs.buffAmount;
                case "spd" -> this.spd += this.legs.buffAmount;
                case "lck" -> this.lck += this.legs.buffAmount;
            }
        }

        // checks foot gear
        if (this.feet != null) {
            switch (this.feet.buff) {
                case "hp" -> this.hp += this.feet.buffAmount;
                case "str" -> this.str += this.feet.buffAmount;
                case "def" -> this.def += this.feet.buffAmount;
                case "con" -> this.con += this.feet.buffAmount;
                case "wis" -> this.wis += this.feet.buffAmount;
                case "spd" -> this.spd += this.feet.buffAmount;
                case "lck" -> this.lck += this.feet.buffAmount;
            }
        }
    }

    // this method calculates if a player's attack hits an opponent
    int checkHit(Player player)
    {
        // gets status and luck stat from passed player
        String playerStatus = player.status;
        int playerLuck = player.lck;

        // initializes the offset and status parameters
        int hitOffset;
        int hitStatus = 0;

        // initializes damage variable
        int damageDealt;

        // creates random number jesus
        Random randomNumber = new Random();

        // initializes lower and upper bounds for additional damage
        int lowerBound;
        int upperBound;

        // if else statement that ensures lower and upper bounds are set properly
        if (player.lck < player.str)
        {
            lowerBound = player.lck;
            upperBound = player.str;
        }
        else if (player.lck > player.str)
        {
            lowerBound = player.str;
            upperBound = player.lck;
        }
        else
        {
            lowerBound = 0;
            upperBound = 15;
        }

        // uses rn jesus to get hit checks and random damage
        int randomHitCheck = randomNumber.nextInt(50) + 6;
        int randomDamage = randomNumber.nextInt(lowerBound, upperBound) + 6;

        // poison, burn, and normal status equal 1 in this setup
        switch (playerStatus) {
            case "stun" -> hitOffset = 3;
            case "asleep" -> hitOffset = 5;
            case "berserk" -> hitOffset = 2;
            case "blind" -> hitOffset = 4;
            default -> hitOffset = 1;
        }

        // gets calculated hit
        int hitAttempt = (randomHitCheck / hitOffset) + playerLuck;

        // checks hitAttempt value and sets damage multiplier
        if (hitAttempt > 20 && hitAttempt <= 45)
        {
            System.out.println("\nHit!");
            hitStatus = 1;
        }
        else if (hitAttempt > 45)
        {
            System.out.println("\nCritical Hit!");
            hitStatus = 2;
        }
        else
        {
            System.out.println("\nMiss!");
        }

        // calculates damage that is dealt and prints it to user
        damageDealt = (player.str + randomDamage) * hitStatus;
        System.out.print("Damage: ");

        // returns damage
        return damageDealt;
    }
}
