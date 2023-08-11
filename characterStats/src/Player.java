import java.sql.SQLOutput;
import java.util.*;

// Player Class
public class Player
{
    // sets up the player stats by initializing each field that we want them to have
    String name;
    String job;
    String sex;
    int level;
    int hp;
    int currentMaxHP;
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

    // player equipped items array
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

    // starting weapons
    Equipment shortSword = new Equipment("Short Sword", true, 1, "str", 1, "a short sword", "mainWeapon", 1);
    Equipment leatherBands = new Equipment("Leather Bands", true, 1, "str", 1, "leather hand wraps", "mainWeapon", 1);
    Equipment shortBow = new Equipment("Short Bow", true, 1, "str", 1, "a short bow", "mainWeapon", 1);
    Equipment walkingStaff = new Equipment("Walking Staff", true, 1, "str", 1, "an old walking stick", "mainWeapon", 1);
    Equipment dagger = new Equipment("Dagger", true, 1, "str", 1, "a small dagger", "mainWeapon", 1);

    // starting offhand
    Equipment leatherBuckler = new Equipment("Leather Buckler", true, 1, "def", 2, "a small worn leather shield", "offHand", 1);
    Equipment woodenKite = new Equipment("Wooden Kite-Shield", true, 1, "def", 4, "an old wooden kite-shield", "offHand", 1);

    // starting armor
    Equipment leatherHat = new Equipment("Leather Hat", true, 1, "def", 1, "a worn leather hat", "head", 1);
    Equipment leatherChest = new Equipment("Leather Chest", true, 1, "def", 1, "worn leather chest armor", "chest", 1);
    Equipment leatherGloves = new Equipment("Leather Gloves", true, 1, "def", 1, "worn leather gloves", "hands", 1);
    Equipment leatherPants = new Equipment("Leather Pants", true, 1, "def", 1, "worn leather pants", "legs", 1);
    Equipment leatherBoots = new Equipment("Leather Boots", true, 1, "def", 1, "worn leather boots", "feet", 1);

    // starting accessories
    Equipment leatherGaiter = new Equipment("Leather Gaiter", true, 1, "def", 1, "a worn leather neck warmer", "neck", 1);
    Equipment brassNecklace = new Equipment("Brass Necklace", true, 1, "lck", 1, "an old brass necklace", "neck", 1);
    Equipment leatherBelt = new Equipment("Leather Belt", true, 1, "spd", 1, "a worn leather belt", "belt", 1);
    Equipment brassRing = new Equipment("Brass Ring", true, 1, "lck", 1, "an old brass ring", "ring", 1);
    Equipment leatherCape = new Equipment("Leather Cape", true, 1, "con", 1, "an old leather cape", "back", 1);

    // Starting items
    Items tonic = new Items("Tonic", 1, "heal", 1, "a healing tonic", 1);
    Items tent = new Items("Tent", 1, "fullHeal", 1, "a camping tent", 1);
    Items panacea = new Items("Panacea", 1, "antidote", 1, "a status remedy", 1);
    Items revivePowder = new Items("Revival Powder", 1, "revive", 1, "a revival powder", 1);

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
                // starting stats
                this.hp = 20;
                this.str = 2;
                this.def = 3;
                this.con = 3;
                this.wis = 2;
                this.spd = 1;
                this.lck = 1;

                // starting equipment
                this.mainWeapon = shortSword;
                this.offHand = woodenKite;
                this.head = leatherHat;
                this.neck = leatherGaiter;
                this.chest = leatherChest;
                this.hands = leatherGloves;
                this.belt = leatherBelt;
                this.legs = leatherPants;
                this.feet = leatherBoots;

                // starting items
                this.inventory[0] = tonic;
                this.inventory[1] = tent;
                this.inventory[2] = panacea;
                this.inventory[3] = revivePowder;

            }
            case "ranger" -> {
                this.hp = 10;
                this.str = 2;
                this.def = 2;
                this.con = 1;
                this.wis = 3;
                this.spd = 3;
                this.lck = 1;

                // starting equipment
                this.mainWeapon = shortBow;
                this.neck = leatherGaiter;
                this.chest = leatherChest;
                this.belt = leatherBelt;
                this.legs = leatherPants;
                this.feet = leatherBoots;
                this.back = leatherCape;

                // starting items
                this.inventory[0] = tonic;
                this.inventory[1] = tent;
                this.inventory[2] = panacea;
                this.inventory[3] = revivePowder;
            }
            case "fighter" -> {
                this.hp = 13;
                this.str = 3;
                this.def = 2;
                this.con = 1;
                this.wis = 1;
                this.spd = 3;
                this.lck = 2;

                // starting equipment
                this.mainWeapon = leatherBands;
                this.chest = leatherChest;
                this.belt = leatherBelt;
                this.legs = leatherPants;
                this.feet = leatherBoots;

                // starting items
                this.inventory[0] = tonic;
                this.inventory[1] = tent;
                this.inventory[2] = panacea;
                this.inventory[3] = revivePowder;
            }
            case "mage" -> {
                this.hp = 6;
                this.str = 1;
                this.def = 2;
                this.con = 3;
                this.wis = 3;
                this.spd = 2;
                this.lck = 1;

                // starting equipment
                this.mainWeapon = walkingStaff;
                this.offHand = leatherBuckler;
                this.head = leatherHat;
                this.chest = leatherChest;
                this.hands = leatherGloves;
                this.ring = brassRing;
                this.legs = leatherPants;
                this.feet = leatherBoots;

                // starting items
                this.inventory[0] = tonic;
                this.inventory[1] = tent;
                this.inventory[2] = panacea;
                this.inventory[3] = revivePowder;
            }
            case "thief" -> {
                this.hp = 8;
                this.str = 1;
                this.def = 1;
                this.con = 3;
                this.wis = 2;
                this.spd = 3;
                this.lck = 2;

                // starting equipment
                this.mainWeapon = dagger;
                this.offHand = leatherBuckler;
                this.head = leatherHat;
                this.neck = brassNecklace;
                this.chest = leatherChest;
                this.belt = leatherBelt;
                this.legs = leatherPants;
                this.feet = leatherBoots;
                this.back = leatherCape;

                // starting items
                this.inventory[0] = tonic;
                this.inventory[1] = tent;
                this.inventory[2] = panacea;
                this.inventory[3] = revivePowder;
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

                // starting equipment
                this.mainWeapon = dagger;
                this.ring = brassRing;
                this.legs = leatherPants;
                this.feet = leatherBoots;
                this.back = leatherCape;

                // starting items
                this.inventory[0] = tonic;
                this.inventory[1] = tent;
                this.inventory[2] = panacea;
                this.inventory[3] = revivePowder;
            }
        }
        this.currentMaxHP = this.hp;

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
            this.currentMaxHP = this.hp;

            // print message that tells the user that the player has leveled up and the player's current level
            System.out.println("\n" + this.name + " Leveled Up!");
            System.out.println(this.name + " is now level " + this.level);
        }
    }

    // method for checking if an item is equipped and adding the appropriate buff
    void gearEquipped()
    {
        // checks equipped main weapon
        if (this.mainWeapon != null) {
            this.equipment[0] = this.mainWeapon;

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
            this.equipment[1] = this.offHand;

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
            this.equipment[2] = this.head;

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
            this.equipment[3] = this.neck;

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
            this.equipment[4] = this.chest;

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
            this.equipment[5] = this.hands;

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
            this.equipment[6] = this.ring;

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
            this.equipment[7] = this.belt;

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
            this.equipment[8] = this.legs;

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
            this.equipment[9] = this.feet;

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

        // checks back gear
        if (this.back != null) {
            this.equipment[10] = this.back;

            switch (this.back.buff) {
                case "hp" -> this.hp += this.back.buffAmount;
                case "str" -> this.str += this.back.buffAmount;
                case "def" -> this.def += this.back.buffAmount;
                case "con" -> this.con += this.back.buffAmount;
                case "wis" -> this.wis += this.back.buffAmount;
                case "spd" -> this.spd += this.back.buffAmount;
                case "lck" -> this.lck += this.back.buffAmount;
            }
        }
    }

    // add items to player inventory
    void addToInventory(Items item)
    {
        for (int i = 0; i < inventory.length; i++)
        {
            if (inventory[i] == item)
            {
                if (item.numberHeld < 99)
                {
                    inventory[i].numberHeld++;
                }
            }
            else if (inventory[i] == null)
            {
                this.inventory[i] = item;
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

    void useItem(Player player, Items item)
    {
        System.out.println(item.numberHeld);

        String status = player.status;
        int hp  = player.hp;
        int maxHP = player.currentMaxHP;

        if ( !status.equals("Normal") && item.name.equals("Panacea") )
        {
            for (int i = 0; i < inventory.length; i++)
            {
                if (!(inventory[i]==null))
                {
                    if (inventory[i].name.equals("Panacea"))
                    {
                        inventory[i].numberHeld--;
                    }
                }

            }

            player.status = "Normal";
        }

        if (hp >= 0 && item.name.equals("Revive Powder"))
        {
            for (int i = 0; i < inventory.length; i++)
            {
                if (!(inventory[i]==null))
                {
                    if (inventory[i].name.equals("Revive Powder"))
                    {
                        inventory[i].numberHeld--;
                    }
                }

            }

            player.hp = player.currentMaxHP;
        }

        if (hp > maxHP && item.name.equals("Tent"))
        {
            for (int i = 0; i < inventory.length; i++)
            {
                if (!(inventory[i]==null))
                {
                    if (inventory[i].name.equals("Tent"))
                    {
                        inventory[i].numberHeld--;
                    }
                }

            }

            player.hp = player.currentMaxHP;
        }

        if (hp < maxHP && item.name.equals("Tonic"))
        {
            for (int i = 0; i < inventory.length; i++)
            {
                if (!(inventory[i]==null))
                {
                    if (inventory[i].name.equals("Tonic"))
                    {
                        inventory[i].numberHeld--;
                    }
                }

            }

            if ( (maxHP - hp) < 20 )
            {
                this.hp += (maxHP - hp);
            }
            else
            {
                System.out.println("Tonic Used!");
                this.hp += 20;
            }
        }
    }

    void checkInventory(Player player)
    {
        for (int i = 0; i < inventory.length; i++)
        {
            if (!(player.inventory[i] == null))
            {
                if (player.inventory[i].numberHeld == 0)
                {
                    player.inventory[i] = null;
                }
            }

            if (player.inventory[i] == null && i+1 < inventory.length)
            {
                Items temp = player.inventory[i];
                player.inventory[i] = player.inventory[i+1];
                player.inventory[i+1] = temp;
            }
        }
    }
}
