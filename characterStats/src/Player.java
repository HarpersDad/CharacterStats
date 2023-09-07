import java.util.*;

// Player Class
public class Player
{
    // Player constructor
    Player(String name, String job, String sex, String equip)
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
        this.gold = 0;

        // switch case that checks the type of equipment that the player has and sets it
        switch (equip)
        {
            case "Leather"
                    -> {
                this.head = Equipment.leatherHat;
                this.neck = Equipment.leatherGaiter;
                this.chest = Equipment.leatherChest;
                this.hands = Equipment.leatherGloves;
                this.ring = Equipment.brassRing;
                this.belt = Equipment.leatherBelt;
                this.legs = Equipment.leatherPants;
                this.feet = Equipment.leatherBoots;
                this.back = Equipment.leatherCape;
            }

            case "Iron"
                    -> {
                this.head = Equipment.ironHat;
                this.neck = Equipment.ironGaiter;
                this.chest = Equipment.ironChest;
                this.hands = Equipment.ironGloves;
                this.ring = Equipment.ironRing;
                this.belt = Equipment.ironBelt;
                this.legs = Equipment.ironPants;
                this.feet = Equipment.ironBoots;
                this.back = Equipment.ironCape;
            }

            case "Steel"
                    -> {
                this.head = Equipment.steelHat;
                this.neck = Equipment.steelGaiter;
                this.chest = Equipment.steelChest;
                this.hands = Equipment.steelGloves;
                this.ring = Equipment.steelRing;
                this.belt = Equipment.steelBelt;
                this.legs = Equipment.steelPants;
                this.feet = Equipment.steelBoots;
                this.back = Equipment.steelCape;
            }

            case "Silver"
                    -> {
                this.head = Equipment.silverHat;
                this.neck = Equipment.silverGaiter;
                this.chest = Equipment.silverChest;
                this.hands = Equipment.silverGloves;
                this.ring = Equipment.silverRing;
                this.belt = Equipment.silverBelt;
                this.legs = Equipment.silverPants;
                this.feet = Equipment.silverBoots;
                this.back = Equipment.silverCape;
            }

            case "Platinum"
                    -> {
                this.head = Equipment.platinumHat;
                this.neck = Equipment.platinumGaiter;
                this.chest = Equipment.platinumChest;
                this.hands = Equipment.platinumGloves;
                this.ring = Equipment.platinumRing;
                this.belt = Equipment.platinumBelt;
                this.legs = Equipment.platinumPants;
                this.feet = Equipment.platinumBoots;
                this.back = Equipment.platinumCape;
            }

            case "Diamond"
                    -> {
                this.head = Equipment.diamondHat;
                this.neck = Equipment.diamondGaiter;
                this.chest = Equipment.diamondChest;
                this.hands = Equipment.diamondGloves;
                this.ring = Equipment.diamondRing;
                this.belt = Equipment.diamondBelt;
                this.legs = Equipment.diamondPants;
                this.feet = Equipment.diamondBoots;
                this.back = Equipment.diamondCape;
            }
        }

        // adds stats to the player based on the job chosen
        switch (job)
        {
            case "defender"
                    -> {
                // starting stats
                this.hp = 20;
                this.str = 2;
                this.def = 3;
                this.con = 3;
                this.wis = 2;
                this.spd = 1;
                this.lck = 1;
                this.gold = 10;

                // starting items
                this.inventory[0] = Items.tonic;
                this.inventory[1] = Items.tent;
                this.inventory[2] = Items.panacea;
                this.inventory[3] = Items.revivePowder;

                // if statements that check the type of gear the player has and sets the weapons for the job
                if (equip.equals("Leather"))
                {
                    this.mainWeapon = Equipment.shortSword;
                    this.offHand = Equipment.woodenKite;
                }

                if (equip.equals("Iron"))
                {
                    this.mainWeapon = Equipment.ironSword;
                    this.offHand = Equipment.ironKite;
                }

                if (equip.equals("Steel"))
                {
                    this.mainWeapon = Equipment.steelSword;
                    this.offHand = Equipment.steelKite;
                }

                if (equip.equals("Silver"))
                {
                    this.mainWeapon = Equipment.silverSword;
                    this.offHand = Equipment.silverKite;
                }

                if (equip.equals("Platinum"))
                {
                    this.mainWeapon = Equipment.platinumSword;
                    this.offHand = Equipment.platinumKite;
                }

                if (equip.equals("Diamond"))
                {
                    this.mainWeapon = Equipment.diamondSword;
                    this.offHand = Equipment.diamondKite;
                }

            }

            case "ranger"
                    -> {
                this.hp = 10;
                this.str = 2;
                this.def = 2;
                this.con = 1;
                this.wis = 3;
                this.spd = 3;
                this.lck = 1;
                this.gold = 10;

                // starting items
                this.inventory[0] = Items.tonic;
                this.inventory[1] = Items.tent;
                this.inventory[2] = Items.panacea;
                this.inventory[3] = Items.revivePowder;

                // if statements that check the type of gear the player has and sets the weapons for the job
                if (equip.equals("Leather"))
                {
                    this.mainWeapon = Equipment.shortBow;
                    this.offHand = Equipment.unEquipped;
                }

                if (equip.equals("Iron"))
                {
                    this.mainWeapon = Equipment.ironBow;
                    this.offHand = Equipment.unEquipped;
                }

                if (equip.equals("Steel"))
                {
                    this.mainWeapon = Equipment.steelBow;
                    this.offHand = Equipment.unEquipped;
                }

                if (equip.equals("Silver"))
                {
                    this.mainWeapon = Equipment.silverBow;
                    this.offHand = Equipment.unEquipped;
                }

                if (equip.equals("Platinum"))
                {
                    this.mainWeapon = Equipment.platinumBow;
                    this.offHand = Equipment.unEquipped;
                }

                if (equip.equals("Diamond"))
                {
                    this.mainWeapon = Equipment.diamondBow;
                    this.offHand = Equipment.unEquipped;
                }
            }

            case "fighter"
                    -> {
                this.hp = 13;
                this.str = 3;
                this.def = 2;
                this.con = 1;
                this.wis = 1;
                this.spd = 3;
                this.lck = 2;
                this.gold = 10;

                // starting items
                this.inventory[0] = Items.tonic;
                this.inventory[1] = Items.tent;
                this.inventory[2] = Items.panacea;
                this.inventory[3] = Items.revivePowder;

                // if statements that check the type of gear the player has and sets the weapons for the job
                if (equip.equals("Leather"))
                {
                    this.mainWeapon = Equipment.leatherBands;
                    this.offHand = Equipment.unEquipped;
                }

                if (equip.equals("Iron"))
                {
                    this.mainWeapon = Equipment.ironBands;
                    this.offHand = Equipment.unEquipped;
                }

                if (equip.equals("Steel"))
                {
                    this.mainWeapon = Equipment.steelBands;
                    this.offHand = Equipment.unEquipped;
                }

                if (equip.equals("Silver"))
                {
                    this.mainWeapon = Equipment.silverBands;
                    this.offHand = Equipment.unEquipped;
                }

                if (equip.equals("Platinum"))
                {
                    this.mainWeapon = Equipment.platinumBands;
                    this.offHand = Equipment.unEquipped;
                }

                if (equip.equals("Diamond"))
                {
                    this.mainWeapon = Equipment.diamondBands;
                    this.offHand = Equipment.unEquipped;
                }
            }

            case "mage"
                    -> {
                this.hp = 6;
                this.str = 1;
                this.def = 2;
                this.con = 3;
                this.wis = 3;
                this.spd = 2;
                this.lck = 1;
                this.gold = 10;

                // starting items
                this.inventory[0] = Items.tonic;
                this.inventory[1] = Items.tent;
                this.inventory[2] = Items.panacea;
                this.inventory[3] = Items.revivePowder;

                // if statements that check the type of gear the player has and sets the weapons for the job
                if (equip.equals("Leather"))
                {
                    this.mainWeapon = Equipment.walkingStaff;
                    this.offHand = Equipment.leatherBuckler;
                }

                if (equip.equals("Iron"))
                {
                    this.mainWeapon = Equipment.ironStaff;
                    this.offHand = Equipment.ironBuckler;
                }

                if (equip.equals("Steel"))
                {
                    this.mainWeapon = Equipment.steelStaff;
                    this.offHand = Equipment.steelBuckler;
                }

                if (equip.equals("Silver"))
                {
                    this.mainWeapon = Equipment.silverStaff;
                    this.offHand = Equipment.silverBuckler;
                }

                if (equip.equals("Platinum"))
                {
                    this.mainWeapon = Equipment.platinumStaff;
                    this.offHand = Equipment.platinumBuckler;
                }

                if (equip.equals("Diamond"))
                {
                    this.mainWeapon = Equipment.diamondStaff;
                    this.offHand = Equipment.diamondBuckler;
                }
            }

            case "thief"
                    -> {
                this.hp = 8;
                this.str = 1;
                this.def = 1;
                this.con = 3;
                this.wis = 2;
                this.spd = 3;
                this.lck = 2;
                this.gold = 10;

                // starting items
                this.inventory[0] = Items.tonic;
                this.inventory[1] = Items.tent;
                this.inventory[2] = Items.panacea;
                this.inventory[3] = Items.revivePowder;

                // if statements that check the type of gear the player has and sets the weapons for the job
                if (equip.equals("Leather"))
                {
                    this.mainWeapon = Equipment.dagger;
                    this.offHand = Equipment.leatherBuckler;
                }

                if (equip.equals("Iron"))
                {
                    this.mainWeapon = Equipment.ironDagger;
                    this.offHand = Equipment.ironBuckler;
                }

                if (equip.equals("Steel"))
                {
                    this.mainWeapon = Equipment.steelDagger;
                    this.offHand = Equipment.steelBuckler;
                }

                if (equip.equals("Silver"))
                {
                    this.mainWeapon = Equipment.silverDagger;
                    this.offHand = Equipment.silverBuckler;
                }

                if (equip.equals("Platinum"))
                {
                    this.mainWeapon = Equipment.platinumDagger;
                    this.offHand = Equipment.platinumBuckler;
                }

                if (equip.equals("Diamond"))
                {
                    this.mainWeapon = Equipment.diamondDagger;
                    this.offHand = Equipment.diamondBuckler;
                }
            }

            default
                    -> {
                this.job = "vagrant";
                this.hp = 10;
                this.str = 2;
                this.def = 2;
                this.con = 2;
                this.wis = 2;
                this.spd = 2;
                this.lck = 2;
                this.gold = 0;

                // starting equipment
                this.mainWeapon = Equipment.dagger;
                this.offHand = Equipment.unEquipped;
                this.head = Equipment.unEquipped;
                this.neck = Equipment.unEquipped;
                this.chest = Equipment.unEquipped;
                this.hands = Equipment.unEquipped;
                this.ring = Equipment.brassRing;
                this.belt = Equipment.unEquipped;
                this.legs = Equipment.leatherPants;
                this.feet = Equipment.leatherBoots;
                this.back = Equipment.leatherCape;

                // starting items
                this.inventory[0] = Items.tonic;
                this.inventory[1] = Items.tent;
                this.inventory[2] = Items.panacea;
                this.inventory[3] = Items.revivePowder;
            }
        }

        this.MaxHP = this.hp;

        // adds stats to the player based on the sex chosen
        switch (sex)
        {
            case "male"
                    -> {
                this.hp += 3;
                this.str += 2;
                this.def += 2;
                this.con += 2;
                this.wis += 1;
                this.spd += 1;
                this.lck += 1;
            }

            case "female"
                    -> {
                this.hp += 2;
                this.str += 1;
                this.def += 1;
                this.con += 1;
                this.wis += 2;
                this.spd += 3;
                this.lck += 2;
            }

            default
                    -> {
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
    public static void levelUp(Player player)
    {
        player.checkLevelUp();
    }

    // method that checks if the player can level up
    void checkLevelUp()
    {
        // while loops that checks if the players current xp is enough to level up
        while (this.xp >= Math.round((Math.pow(xpToLevel, this.level)) / (this.level+1)))
        {
            // sets the remaining xp as current xp
            this.xp = this.xp - Math.round((Math.pow(xpToLevel, this.level)) / (this.level+1));

            // adds a level to the player level
            this.level++;

            // increases stats based on job chosen
            switch (this.job)
            {
                case "defender"
                        -> {
                    this.hp += (this.hp % this.level) + 4;
                    this.str += (this.str % this.level) + 2;
                    this.def += (this.def % this.level) + 3;
                    this.con += (this.con % this.level) + 1;
                    this.wis += (this.wis % this.level) + 2;
                    this.spd += (this.spd % this.level) + 1;
                    this.lck += (this.lck % this.level) + 1;
                }

                case "ranger"
                        -> {
                    this.hp += (this.hp % this.level) + 2;
                    this.str += (this.str % this.level) + 2;
                    this.def += (this.def % this.level) + 1;
                    this.con += (this.con % this.level) + 2;
                    this.wis += (this.wis % this.level) + 3;
                    this.spd += (this.spd % this.level) + 3;
                    this.lck += (this.lck % this.level) + 1;
                }

                case "fighter"
                        -> {
                    this.hp += (this.hp % this.level) + 3;
                    this.str += (this.str % this.level) + 3;
                    this.def += (this.def % this.level) + 2;
                    this.con += (this.con % this.level) + 2;
                    this.wis += (this.wis % this.level) + 1;
                    this.spd += (this.spd % this.level) + 2;
                    this.lck += (this.lck % this.level) + 1;
                }

                case "mage"
                        -> {
                    this.hp += (this.hp % this.level) + 1;
                    this.str += (this.str % this.level) + 1;
                    this.def += (this.def % this.level) + 2;
                    this.con += (this.con % this.level) + 3;
                    this.wis += (this.wis % this.level) + 3;
                    this.spd += (this.spd % this.level) + 2;
                    this.lck += (this.lck % this.level) + 2;
                }

                case "thief"
                        -> {
                    this.hp += (this.hp % this.level) + 2;
                    this.str += (this.str % this.level) + 1;
                    this.def += (this.def % this.level) + 1;
                    this.con += (this.con % this.level) + 3;
                    this.wis += (this.wis % this.level) + 2;
                    this.spd += (this.spd % this.level) + 3;
                    this.lck += (this.lck % this.level) + 2;
                }

                default
                        -> {
                    this.hp += (this.hp % this.level) + 2;
                    this.str += (this.str % this.level) + 2;
                    this.def += (this.def % this.level) + 2;
                    this.con += (this.con % this.level) + 2;
                    this.wis += (this.wis % this.level) + 2;
                    this.spd += (this.spd % this.level) + 2;
                    this.lck += (this.lck % this.level) + 2;
                }
            }

            this.MaxHP = this.hp;
            this.xpToNextLevel = Math.round((Math.pow(xpToLevel, this.level)) / (this.level + 1));

            // print message that tells the user that the player has leveled up and the player's current level
            System.out.println("\n" + this.name + " Leveled Up!");
            System.out.println(this.name + " is now level " + this.level);
        }
    }

    // method for checking if an item is equipped and adding the appropriate buff
    void gearEquipped()
    {
        if (this.equipped == false)
        {
            // checks equipped main weapon
            if (this.mainWeapon != null)
            {
                this.equipment[0] = this.mainWeapon;

                switch (this.mainWeapon.buff)
                {
                    case "hp" -> this.hp = this.mainWeapon.buffAmount + this.hp;
                    case "str" -> this.str = this.mainWeapon.buffAmount + this.str;
                    case "def" -> this.def = this.mainWeapon.buffAmount + this.def;
                    case "con" -> this.con = this.mainWeapon.buffAmount + this.con;
                    case "wis" -> this.wis = this.mainWeapon.buffAmount + this.wis;
                    case "spd" -> this.spd = this.mainWeapon.buffAmount + this.spd;
                    case "lck" -> this.lck = this.mainWeapon.buffAmount + this.lck;
                }
            }

            // checks offhand
            if (this.offHand != null)
            {
                this.equipment[1] = this.offHand;

                switch (this.offHand.buff)
                {
                    case "hp" -> this.hp = this.offHand.buffAmount + this.hp;
                    case "str" -> this.str = this.offHand.buffAmount + this.str;
                    case "def" -> this.def = this.offHand.buffAmount + this.def;
                    case "con" -> this.con = this.offHand.buffAmount + this.con;
                    case "wis" -> this.wis = this.offHand.buffAmount + this.wis;
                    case "spd" -> this.spd = this.offHand.buffAmount + this.spd;
                    case "lck" -> this.lck = this.offHand.buffAmount + this.lck;
                }
            }

            // checks head gear
            if (this.head != null)
            {
                this.equipment[2] = this.head;

                switch (this.head.buff)
                {
                    case "hp" -> this.hp = this.head.buffAmount + this.hp;
                    case "str" -> this.str = this.head.buffAmount + this.str;
                    case "def" -> this.def = this.head.buffAmount + this.def;
                    case "con" -> this.con = this.head.buffAmount + this.con;
                    case "wis" -> this.wis = this.head.buffAmount + this.wis;
                    case "spd" -> this.spd = this.head.buffAmount + this.spd;
                    case "lck" -> this.lck = this.head.buffAmount + this.lck;
                }
            }

            // checks neck gear
            if (this.neck != null)
            {
                this.equipment[3] = this.neck;

                switch (this.neck.buff)
                {
                    case "hp" -> this.hp = this.neck.buffAmount + this.hp;
                    case "str" -> this.str = this.neck.buffAmount + this.str;
                    case "def" -> this.def = this.neck.buffAmount + this.def;
                    case "con" -> this.con = this.neck.buffAmount + this.con;
                    case "wis" -> this.wis = this.neck.buffAmount + this.wis;
                    case "spd" -> this.spd = this.neck.buffAmount + this.spd;
                    case "lck" -> this.lck = this.neck.buffAmount + this.lck;
                }
            }

            // checks chest gear
            if (this.chest != null)
            {
                this.equipment[4] = this.chest;

                switch (this.chest.buff)
                {
                    case "hp" -> this.hp = this.chest.buffAmount + this.hp;
                    case "str" -> this.str = this.chest.buffAmount + this.str;
                    case "def" -> this.def = this.chest.buffAmount + this.def;
                    case "con" -> this.con = this.chest.buffAmount + this.con;
                    case "wis" -> this.wis = this.chest.buffAmount + this.wis;
                    case "spd" -> this.spd = this.chest.buffAmount + this.spd;
                    case "lck" -> this.lck = this.chest.buffAmount + this.lck;
                }
            }

            // checks hand gear
            if (this.hands != null)
            {
                this.equipment[5] = this.hands;

                switch (this.hands.buff)
                {
                    case "hp" -> this.hp = this.hands.buffAmount + this.hp;
                    case "str" -> this.str = this.hands.buffAmount + this.str;
                    case "def" -> this.def = this.hands.buffAmount + this.def;
                    case "con" -> this.con = this.hands.buffAmount + this.con;
                    case "wis" -> this.wis = this.hands.buffAmount + this.wis;
                    case "spd" -> this.spd = this.hands.buffAmount + this.spd;
                    case "lck" -> this.lck = this.hands.buffAmount + this.lck;
                }
            }

            // checks ring gear
            if (this.ring != null)
            {
                this.equipment[6] = this.ring;

                switch (this.ring.buff)
                {
                    case "hp" -> this.hp = this.ring.buffAmount + this.hp;
                    case "str" -> this.str = this.ring.buffAmount + this.str;
                    case "def" -> this.def = this.ring.buffAmount + this.def;
                    case "con" -> this.con = this.ring.buffAmount + this.con;
                    case "wis" -> this.wis = this.ring.buffAmount + this.wis;
                    case "spd" -> this.spd = this.ring.buffAmount + this.spd;
                    case "lck" -> this.lck = this.ring.buffAmount + this.lck;
                }
            }

            // checks belt gear
            if (this.belt != null)
            {
                this.equipment[7] = this.belt;

                switch (this.belt.buff)
                {
                    case "hp" -> this.hp = this.belt.buffAmount + this.hp;
                    case "str" -> this.str = this.belt.buffAmount + this.str;
                    case "def" -> this.def = this.belt.buffAmount + this.def;
                    case "con" -> this.con = this.belt.buffAmount + this.con;
                    case "wis" -> this.wis = this.belt.buffAmount + this.wis;
                    case "spd" -> this.spd = this.belt.buffAmount + this.spd;
                    case "lck" -> this.lck = this.belt.buffAmount + this.lck;
                }
            }

            // checks leg gear
            if (this.legs != null)
            {
                this.equipment[8] = this.legs;

                switch (this.legs.buff)
                {
                    case "hp" -> this.hp = this.legs.buffAmount + this.hp;
                    case "str" -> this.str = this.legs.buffAmount + this.str;
                    case "def" -> this.def = this.legs.buffAmount + this.def;
                    case "con" -> this.con = this.legs.buffAmount + this.con;
                    case "wis" -> this.wis = this.legs.buffAmount + this.wis;
                    case "spd" -> this.spd = this.legs.buffAmount + this.spd;
                    case "lck" -> this.lck = this.legs.buffAmount + this.lck;
                }
            }

            // checks foot gear
            if (this.feet != null)
            {
                this.equipment[9] = this.feet;

                switch (this.feet.buff)
                {
                    case "hp" -> this.hp = this.feet.buffAmount + this.hp;
                    case "str" -> this.str = this.feet.buffAmount + this.str;
                    case "def" -> this.def = this.feet.buffAmount + this.def;
                    case "con" -> this.con = this.feet.buffAmount + this.con;
                    case "wis" -> this.wis = this.feet.buffAmount + this.wis;
                    case "spd" -> this.spd = this.feet.buffAmount + this.spd;
                    case "lck" -> this.lck = this.feet.buffAmount + this.lck;
                }
            }

            // checks back gear
            if (this.back != null)
            {
                this.equipment[10] = this.back;

                switch (this.back.buff)
                {
                    case "hp" -> this.hp = this.back.buffAmount + this.hp;
                    case "str" -> this.str = this.back.buffAmount + this.str;
                    case "def" -> this.def = this.back.buffAmount + this.def;
                    case "con" -> this.con = this.back.buffAmount + this.con;
                    case "wis" -> this.wis = this.back.buffAmount + this.wis;
                    case "spd" -> this.spd = this.back.buffAmount + this.spd;
                    case "lck" -> this.lck = this.back.buffAmount + this.lck;
                }
            }
            this.equipped = true;
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

        // normal status equals 1 in this setup
        switch (playerStatus)
        {
            case "stun" -> hitOffset = 4;
            case "asleep" -> hitOffset = 10;
            case "berserk" -> hitOffset = 3;
            case "blind" -> hitOffset = 5;
            case "poison", "burn" -> hitOffset = 2;
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
        String status = player.status;
        int hp  = player.hp;
        int maxHP = player.MaxHP;

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
            player.hp = player.MaxHP;
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
            player.hp = player.MaxHP;
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

    void addItemToInventory(Player player, String items, int amount)
    {
        Items newItem;

        switch (items)
        {
            case "tonic" -> newItem = Items.tonic;
            case "antidote" -> newItem = Items.panacea;
            case "revive" -> newItem = Items.revivePowder;
            case "tent" -> newItem = Items.tent;
            default -> newItem = Items.rock;
        }

        for(int i = 0; i < inventory.length; i++)
        {
            if (inventory[i] == null || inventory[i] == newItem)
            {
                player.inventory[i] = newItem;
                player.inventory[i].numberHeld += amount;
                break;
            }
        }
    }

    // sets up the player stats by initializing each field that we want them to have
    String name;
    String job;
    String sex;
    int gold;
    int level;
    int hp;
    int MaxHP;
    int str;
    int def;
    int con;
    int wis;
    int spd;
    int lck;
    double xp;
    int xpToLevel = 2;
    double xpToNextLevel;
    String status;
    boolean equipped = false;

    // creation arrays
    public static Player[] characters = {null, null, null, null, null, null, null, null, null, null, null, null};
    static String[] jobs = {"defender", "fighter", "ranger", "mage", "thief", "vagrant"};
    static String[] sexes = {"male", "female", "unknown"};
    static String[] equipSets = {"Leather", "Iron", "Steel", "Silver", "Platinum", "Diamond"};

    // inventory array
    Items[] inventory = new Items[25];

    // equipment array
    Equipment[] equipment = new Equipment[11];

    // equipment slots
    Equipment mainWeapon, offHand, head, neck, chest, hands, ring, belt, legs, feet, back;
}