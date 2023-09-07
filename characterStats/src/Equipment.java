// equipment class
public class Equipment
{
    static Equipment unEquipped = new Equipment(
            "",
            "",
            true,
            0,
            false,
            "",
            0,
            "",
            "mainWeapon",
            1
    );

    Equipment(String type, String name, boolean canEquip, int cost, boolean canBuff,
              String buff, int buffAmount, String description, String equipType, int numberHeld)
    {
        this.type = type;
        this.name = name;
        this.canEquip = canEquip;
        this.cost = cost;
        this.canBuff = canBuff;
        this.buff = buff;
        this.buffAmount = buffAmount;
        this.description = description;
        this.equipType = equipType;
        this.numberHeld = numberHeld;
        this.maxItemCount = 99;
    }

    static void setEquipment(Player player)
    {
        // switch case that checks the type of equipment that the player has and sets it
        switch (player.equipmentType)
        {
            case "Leather"
                    -> {
                player.head = Equipment.leatherHat;
                player.neck = Equipment.leatherGaiter;
                player.chest = Equipment.leatherChest;
                player.hands = Equipment.leatherGloves;
                player.ring = Equipment.brassRing;
                player.belt = Equipment.leatherBelt;
                player.legs = Equipment.leatherPants;
                player.feet = Equipment.leatherBoots;
                player.back = Equipment.leatherCape;
            }

            case "Iron"
                    -> {
                player.head = Equipment.ironHat;
                player.neck = Equipment.ironGaiter;
                player.chest = Equipment.ironChest;
                player.hands = Equipment.ironGloves;
                player.ring = Equipment.ironRing;
                player.belt = Equipment.ironBelt;
                player.legs = Equipment.ironPants;
                player.feet = Equipment.ironBoots;
                player.back = Equipment.ironCape;
            }

            case "Steel"
                    -> {
                player.head = Equipment.steelHat;
                player.neck = Equipment.steelGaiter;
                player.chest = Equipment.steelChest;
                player.hands = Equipment.steelGloves;
                player.ring = Equipment.steelRing;
                player.belt = Equipment.steelBelt;
                player.legs = Equipment.steelPants;
                player.feet = Equipment.steelBoots;
                player.back = Equipment.steelCape;
            }

            case "Silver"
                    -> {
                player.head = Equipment.silverHat;
                player.neck = Equipment.silverGaiter;
                player.chest = Equipment.silverChest;
                player.hands = Equipment.silverGloves;
                player.ring = Equipment.silverRing;
                player.belt = Equipment.silverBelt;
                player.legs = Equipment.silverPants;
                player.feet = Equipment.silverBoots;
                player.back = Equipment.silverCape;
            }

            case "Platinum"
                    -> {
                player.head = Equipment.platinumHat;
                player.neck = Equipment.platinumGaiter;
                player.chest = Equipment.platinumChest;
                player.hands = Equipment.platinumGloves;
                player.ring = Equipment.platinumRing;
                player.belt = Equipment.platinumBelt;
                player.legs = Equipment.platinumPants;
                player.feet = Equipment.platinumBoots;
                player.back = Equipment.platinumCape;
            }

            case "Diamond"
                    -> {
                player.head = Equipment.diamondHat;
                player.neck = Equipment.diamondGaiter;
                player.chest = Equipment.diamondChest;
                player.hands = Equipment.diamondGloves;
                player.ring = Equipment.diamondRing;
                player.belt = Equipment.diamondBelt;
                player.legs = Equipment.diamondPants;
                player.feet = Equipment.diamondBoots;
                player.back = Equipment.diamondCape;
            }
        }
    }

    // enchants equipment with beneficial or detrimental effects
    void enchantEquipment(Equipment equip, String buffType, int buffAmount)
    {
        // switch statement that assigns buffs / debuffs based on passed data
        if (equip.canBuff == true)
        {
            switch (buffType)
            {
                // detrimental - buffAmount is turn/time count.
                case "poison"
                        -> {
                    this.buff = "poison";
                    this.buffAmount = buffAmount;
                }
                case "burn"
                        -> {
                    this.buff = "burn";
                    this.buffAmount = buffAmount;
                }
                case "blind"
                        -> {
                    this.buff = "blind";
                    this.buffAmount = buffAmount;
                }
                case "stun"
                        -> {
                    this.buff = "stun";
                    this.buffAmount = buffAmount;
                }
                case "berserk"
                        -> {
                    this.buff = "berserk";
                    this.buffAmount = buffAmount;
                }
                case "sleep"
                        -> {
                    this.buff = "sleep";
                    this.buffAmount = buffAmount;
                }

                // beneficial - buffAmount is amount to increase or decrease stats
                case "hp"
                        -> {
                    this.buff = "hp";
                    this.buffAmount = buffAmount;
                }
                case "str"
                        -> {
                    this.buff = "str";
                    this.buffAmount = buffAmount;
                }
                case "def"
                        -> {
                    this.buff = "def";
                    this.buffAmount = buffAmount;
                }
                case "con"
                        -> {
                    this.buff = "con";
                    this.buffAmount = buffAmount;
                }
                case "wis"
                        -> {
                    this.buff = "wis";
                    this.buffAmount = buffAmount;
                }
                case "spd"
                        -> {
                    this.buff = "spd";
                    this.buffAmount = buffAmount;
                }
                case "lck"

                        -> {
                    this.buff = "lck";
                    this.buffAmount = buffAmount;
                }

                // in case an incorrect buff is passed
                default
                        -> {
                    this.buff = "no buff";
                    this.buffAmount = 0;
                }
            }
        }
    }

    // adds gear buffs to characters
    static void equipGear()
    {
        for (int i = 0; i < Player.characters.length; i++)
        {
            // "equips" the gear for characters so that their stats reflect the buff provided
            if (Player.characters[i] != null)
            {
                // checks if the boolean flag "equipped" is true
                if (!Player.characters[i].equipped)
                {
                    Player.characters[i].gearEquipped();
                }
            }
        }
    }

    String type;
    String name;
    boolean canEquip;
    int cost;
    boolean canBuff;
    String buff;
    int buffAmount;
    String description;
    String equipType;
    int numberHeld;
    int maxItemCount;

    // basic equipment +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    static Equipment shortSword, leatherBands, shortBow, walkingStaff, dagger, // main weapons
    leatherBuckler, woodenKite, // offhand
    leatherHat, leatherChest, leatherGloves, leatherPants, leatherBoots, // armor
    leatherGaiter, brassNecklace, leatherBelt, brassRing, leatherCape; // accessories


    // Iron equipment ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    static Equipment ironSword, ironBands, ironBow, ironStaff, ironDagger, // main weapons
    ironBuckler, ironKite, // offhand
    ironHat, ironChest, ironGloves, ironPants, ironBoots, // armor
    ironGaiter, ironNecklace, ironBelt, ironRing, ironCape; // accessories


    // Steel equipment +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    static Equipment steelSword, steelBands, steelBow, steelStaff, steelDagger, // main weapons
    steelBuckler, steelKite, // offhand
    steelHat, steelChest, steelGloves, steelPants, steelBoots, // armor
    steelGaiter, steelNecklace, steelBelt, steelRing, steelCape; // accessories


    // Silver equipment ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    static Equipment silverSword, silverBands, silverBow, silverStaff, silverDagger, // main weapons
    silverBuckler, silverKite, // offhand
    silverHat, silverChest, silverGloves, silverPants, silverBoots, // armor
    silverGaiter, silverNecklace, silverBelt, silverRing, silverCape; // accessories


    // Platinum equipment ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    static Equipment platinumSword, platinumBands, platinumBow, platinumStaff, platinumDagger, // main weapons
    platinumBuckler, platinumKite, // offhand
    platinumHat, platinumChest, platinumGloves, platinumPants, platinumBoots, // armor
    platinumGaiter, platinumNecklace, platinumBelt, platinumRing, platinumCape; // accessories


    // Diamond equipment +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    static Equipment diamondSword, diamondBands, diamondBow, diamondStaff, diamondDagger, // main weapons
    diamondBuckler, diamondKite, // offhand
    diamondHat, diamondChest, diamondGloves, diamondPants, diamondBoots, // armor
    diamondGaiter, diamondNecklace, diamondBelt, diamondRing, diamondCape; // accessories
}