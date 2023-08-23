// equipment class
public class Equipment {
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

    static Equipment unEquipped = new Equipment("", "", true, 0, false, "", 0, "", "mainWeapon", 1);

    // basic equipment +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // main weapons
    static Equipment shortSword;
    static Equipment leatherBands;
    static Equipment shortBow;
    static Equipment walkingStaff;
    static Equipment dagger;

    // offhand
    static Equipment leatherBuckler;
    static Equipment woodenKite;

    // armor
    static Equipment leatherHat;
    static Equipment leatherChest;
    static Equipment leatherGloves;
    static Equipment leatherPants;
    static Equipment leatherBoots;

    // accessories
    static Equipment leatherGaiter;
    static Equipment brassNecklace;
    static Equipment leatherBelt;
    static Equipment brassRing;
    static Equipment leatherCape;

    // Iron equipment ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // main weapons
    static Equipment ironSword;
    static Equipment ironBands;
    static Equipment ironBow;
    static Equipment ironStaff;
    static Equipment ironDagger;

    // offhand
    static Equipment ironBuckler;
    static Equipment ironKite;

    // armor
    static Equipment ironHat;
    static Equipment ironChest;
    static Equipment ironGloves;
    static Equipment ironPants;
    static Equipment ironBoots;

    // accessories
    static Equipment ironGaiter;
    static Equipment ironNecklace;
    static Equipment ironBelt;
    static Equipment ironRing;
    static Equipment ironCape;

    // Steel equipment +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // main weapons
    static Equipment steelSword;
    static Equipment steelBands;
    static Equipment steelBow;
    static Equipment steelStaff;
    static Equipment steelDagger;

    // offhand
    static Equipment steelBuckler;
    static Equipment steelKite;

    // armor
    static Equipment steelHat;
    static Equipment steelChest;
    static Equipment steelGloves;
    static Equipment steelPants;
    static Equipment steelBoots;

    // accessories
    static Equipment steelGaiter;
    static Equipment steelNecklace;
    static Equipment steelBelt;
    static Equipment steelRing;
    static Equipment steelCape;

    // Silver equipment ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // weapons
    static Equipment silverSword;
    static Equipment silverBands;
    static Equipment silverBow;
    static Equipment silverStaff;
    static Equipment silverDagger;

    // offhand
    static Equipment silverBuckler;
    static Equipment silverKite;

    // armor
    static Equipment silverHat;
    static Equipment silverChest;
    static Equipment silverGloves;
    static Equipment silverPants;
    static Equipment silverBoots;

    // accessories
    static Equipment silverGaiter;
    static Equipment silverNecklace;
    static Equipment silverBelt;
    static Equipment silverRing;
    static Equipment silverCape;

    // Platinum equipment ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // weapons
    static Equipment platinumSword;
    static Equipment platinumBands;
    static Equipment platinumBow;
    static Equipment platinumStaff;
    static Equipment platinumDagger;

    // offhand
    static Equipment platinumBuckler;
    static Equipment platinumKite;

    // armor
    static Equipment platinumHat;
    static Equipment platinumChest;
    static Equipment platinumGloves;
    static Equipment platinumPants;
    static Equipment platinumBoots;

    // accessories
    static Equipment platinumGaiter;
    static Equipment platinumNecklace;
    static Equipment platinumBelt;
    static Equipment platinumRing;
    static Equipment platinumCape;

    // Diamond equipment +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // weapons
    static Equipment diamondSword;
    static Equipment diamondBands;
    static Equipment diamondBow;
    static Equipment diamondStaff;
    static Equipment diamondDagger;

    // offhand
    static Equipment diamondBuckler;
    static Equipment diamondKite;

    // armor
    static Equipment diamondHat;
    static Equipment diamondChest;
    static Equipment diamondGloves;
    static Equipment diamondPants;
    static Equipment diamondBoots;

    // accessories
    static Equipment diamondGaiter;
    static Equipment diamondNecklace;
    static Equipment diamondBelt;
    static Equipment diamondRing;
    static Equipment diamondCape;

    Equipment(String type, String name, boolean canEquip, int cost, boolean canBuff, String buff, int buffAmount, String description, String equipType, int numberHeld) {
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

    // enchants equipment with beneficial or detrimental effects
    void enchantEquipment(Equipment equip, String buffType, int buffAmount) {
        // switch statement that assigns buffs / debuffs based on passed data
        if (equip.canBuff == true) {
            switch (buffType) {
                // detrimental - buffAmount is turn/time count.
                case "poison" -> {
                    this.buff = "poison";
                    this.buffAmount = buffAmount;
                }
                case "burn" -> {
                    this.buff = "burn";
                    this.buffAmount = buffAmount;
                }
                case "blind" -> {
                    this.buff = "blind";
                    this.buffAmount = buffAmount;
                }
                case "stun" -> {
                    this.buff = "stun";
                    this.buffAmount = buffAmount;
                }
                case "berserk" -> {
                    this.buff = "berserk";
                    this.buffAmount = buffAmount;
                }
                case "sleep" -> {
                    this.buff = "sleep";
                    this.buffAmount = buffAmount;
                }

                // beneficial - buffAmount is amount to increase or decrease stats
                case "hp" -> {
                    this.buff = "hp";
                    this.buffAmount = buffAmount;
                }
                case "str" -> {
                    this.buff = "str";
                    this.buffAmount = buffAmount;
                }
                case "def" -> {
                    this.buff = "def";
                    this.buffAmount = buffAmount;
                }
                case "con" -> {
                    this.buff = "con";
                    this.buffAmount = buffAmount;
                }
                case "wis" -> {
                    this.buff = "wis";
                    this.buffAmount = buffAmount;
                }
                case "spd" -> {
                    this.buff = "spd";
                    this.buffAmount = buffAmount;
                }
                case "lck" -> {
                    this.buff = "lck";
                    this.buffAmount = buffAmount;
                }

                // in case an incorrect buff is passed
                default -> {
                    this.buff = "no buff";
                    this.buffAmount = 0;
                }
            }
        }
    }

    static void createEquipment() {

        // unequipped ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        unEquipped = new Equipment("", "", true, 0, false, "", 0, "", "mainWeapon", 1);

        // basic equipment +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // main weapons
        shortSword = new Equipment("Leather", "Short Sword", true, 1, false, "str", 1, "a short sword", "mainWeapon", 1);
        leatherBands = new Equipment("Leather", "Leather Bands", true, 1, false, "str", 1, "leather hand wraps", "mainWeapon", 1);
        shortBow = new Equipment("Leather", "Short Bow", true, 1, false, "str", 1, "a short bow", "mainWeapon", 1);
        walkingStaff = new Equipment("Leather", "Walking Staff", true, 1, false, "str", 1, "an old walking stick", "mainWeapon", 1);
        dagger = new Equipment("Leather", "Dagger", true, 1, false, "str", 1, "a small dagger", "mainWeapon", 1);

        // offhand
        leatherBuckler = new Equipment("Leather", "Leather Buckler", true, 1, false, "def", 2, "a small worn leather shield", "offHand", 1);
        woodenKite = new Equipment("Leather", "Wooden Kite-Shield", true, 1, false, "def", 4, "an old wooden kite-shield", "offHand", 1);

        // armor
        leatherHat = new Equipment("Leather", "Leather Hat", true, 1, false, "def", 1, "a worn leather hat", "head", 1);
        leatherChest = new Equipment("Leather", "Leather Chest", true, 1, false, "def", 1, "worn leather chest armor", "chest", 1);
        leatherGloves = new Equipment("Leather", "Leather Gloves", true, 1, false, "def", 1, "worn leather gloves", "hands", 1);
        leatherPants = new Equipment("Leather", "Leather Pants", true, 1, false, "def", 1, "worn leather pants", "legs", 1);
        leatherBoots = new Equipment("Leather", "Leather Boots", true, 1, false, "def", 1, "worn leather boots", "feet", 1);

        // accessories
        leatherGaiter = new Equipment("Leather", "Leather Gaiter", true, 1, false, "def", 1, "a worn leather neck warmer", "neck", 1);
        brassNecklace = new Equipment("Leather", "Brass Necklace", true, 1, false, "lck", 1, "an old brass necklace", "neck", 1);
        leatherBelt = new Equipment("Leather", "Leather Belt", true, 1, false, "spd", 1, "a worn leather belt", "belt", 1);
        brassRing = new Equipment("Leather", "Brass Ring", true, 1, false, "lck", 1, "an old brass ring", "ring", 1);
        leatherCape = new Equipment("Leather", "Leather Cape", true, 1, false, "con", 1, "an old leather cape", "back", 1);

        // Iron equipment ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // main weapons
        ironSword = new Equipment("Iron", "Iron Sword", true, 10, false, "str", 2, "an iron sword", "mainWeapon", 1);
        ironBands = new Equipment("Iron", "Iron Bands", true, 10, false, "str", 2, "iron studded hand wraps", "mainWeapon", 1);
        ironBow = new Equipment("Iron", "Iron Bow", true, 10, false, "str", 2, "an iron bow", "mainWeapon", 1);
        ironStaff = new Equipment("Iron", "Iron Staff", true, 10, false, "str", 2, "an iron walking stick", "mainWeapon", 1);
        ironDagger = new Equipment("Iron", "Iron Dagger", true, 10, false, "str", 2, "an iron dagger", "mainWeapon", 1);

        // offhand
        ironBuckler = new Equipment("Iron", "Iron Buckler", true, 10, false, "def", 4, "a small iron shield", "offHand", 1);
        ironKite = new Equipment("Iron", "Iron Kite-Shield", true, 10, false, "def", 8, "an iron kite-shield", "offHand", 1);

        // armor
        ironHat = new Equipment("Iron", "Iron Helm", true, 10, false, "def", 2, "an iron helm", "head", 1);
        ironChest = new Equipment("Iron", "Iron Plate", true, 10, false, "def", 2, "iron chest armor", "chest", 1);
        ironGloves = new Equipment("Iron", "Iron Gloves", true, 10, false, "def", 2, "reinforced iron gloves", "hands", 1);
        ironPants = new Equipment("Iron", "Iron Greaves", true, 10, false, "def", 2, "iron greaves", "legs", 1);
        ironBoots = new Equipment("Iron", "Iron Boots", true, 10, false, "def", 2, "iron boots", "feet", 1);

        // accessories
        ironGaiter = new Equipment("Iron", "Iron Gaiter", true, 10, false, "def", 2, "an iron reinforced neck warmer", "neck", 1);
        ironNecklace = new Equipment("Iron", "Necklace", true, 10, false, "lck", 2, "a necklace", "neck", 1);
        ironBelt = new Equipment("Iron", "Iron Belt", true, 10, false, "spd", 2, "an iron studded belt", "belt", 1);
        ironRing = new Equipment("Iron", "Ring", true, 10, false, "lck", 2, "a ring", "ring", 1);
        ironCape = new Equipment("Iron", "Studded Cape", true, 10, false, "con", 2, "a leather studded cape", "back", 1);

        // Steel equipment +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // main weapons
        steelSword = new Equipment("Steel", "Steel Sword", true, 100, false, "str", 4, "a steel sword", "mainWeapon", 1);
        steelBands = new Equipment("Steel", "Steel Bands", true, 100, false, "str", 4, "steel hand wraps", "mainWeapon", 1);
        steelBow = new Equipment("Steel", "Steel Bow", true, 100, false, "str", 4, "a steel bow", "mainWeapon", 1);
        steelStaff = new Equipment("Steel", "Steel Staff", true, 100, false, "str", 4, "a steel stick", "mainWeapon", 1);
        steelDagger = new Equipment("Steel", "Steel Dagger", true, 100, false, "str", 4, "a steel dagger", "mainWeapon", 1);

        // offhand
        steelBuckler = new Equipment("Steel", "Steel Buckler", true, 100, false, "def", 8, "a small steel shield", "offHand", 1);
        steelKite = new Equipment("Steel", "Steel Kite-Shield", true, 100, false, "def", 16, "a steel kite-shield", "offHand", 1);

        // armor
        steelHat = new Equipment("Steel", "Steel Helm", true, 100, false, "def", 4, "a steel helm", "head", 1);
        steelChest = new Equipment("Steel", "Steel Plate", true, 100, false, "def", 4, "steel chest armor", "chest", 1);
        steelGloves = new Equipment("Steel", "Steel Gloves", true, 100, false, "def", 4, "steel gloves", "hands", 1);
        steelPants = new Equipment("Steel", "Steel Greaves", true, 100, false, "def", 4, "steel greaves", "legs", 1);
        steelBoots = new Equipment("Steel", "Steel Boots", true, 100, false, "def", 4, "steel boots", "feet", 1);

        // accessories
        steelGaiter = new Equipment("Steel", "Steel Gaiter", true, 100, false, "def", 4, "a steel reinforced neck warmer", "neck", 1);
        steelNecklace = new Equipment("Steel", "Steel Necklace", true, 100, false, "lck", 4, "a steel necklace", "neck", 1);
        steelBelt = new Equipment("Steel", "Steel Belt", true, 100, false, "spd", 4, "a steel studded belt", "belt", 1);
        steelRing = new Equipment("Steel", "Steel Ring", true, 100, false, "lck", 4, "a steel ring", "ring", 1);
        steelCape = new Equipment("Steel", "Ornate Cape", true, 100, false, "con", 4, "an ornate cape", "back", 1);

        // Silver equipment ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // weapons
        silverSword = new Equipment("Silver", "Silver Sword", true, 1000, false, "str", 8, "a silver sword", "mainWeapon", 1);
        silverBands = new Equipment("Silver", "Silver Bands", true, 1000, false, "str", 8, "silver hand wraps", "mainWeapon", 1);
        silverBow = new Equipment("Silver", "Silver Bow", true, 1000, false, "str", 8, "a silver bow", "mainWeapon", 1);
        silverStaff = new Equipment("Silver", "Silver Staff", true, 1000, false, "str", 8, "a silver stick", "mainWeapon", 1);
        silverDagger = new Equipment("Silver", "Silver Dagger", true, 1000, false, "str", 8, "a silver dagger", "mainWeapon", 1);

        // offhand
        silverBuckler = new Equipment("Silver", "Silver Buckler", true, 1000, false, "def", 16, "a small silver shield", "offHand", 1);
        silverKite = new Equipment("Silver", "Silver Kite-Shield", true, 1000, false, "def", 32, "a silver kite-shield", "offHand", 1);

        // armor
        silverHat = new Equipment("Silver", "Silver Helm", true, 1000, false, "def", 8, "a silver helm", "head", 1);
        silverChest = new Equipment("Silver", "Silver Plate", true, 1000, false, "def", 8, "silver chest armor", "chest", 1);
        silverGloves = new Equipment("Silver", "Silver Gloves", true, 1000, false, "def", 8, "silver gloves", "hands", 1);
        silverPants = new Equipment("Silver", "Silver Greaves", true, 1000, false, "def", 8, "silver greaves", "legs", 1);
        silverBoots = new Equipment("Silver", "Silver Boots", true, 1000, false, "def", 8, "silver boots", "feet", 1);

        // accessories
        silverGaiter = new Equipment("Silver", "Silver Gaiter", true, 1000, false, "def", 8, "a silver reinforced neck warmer", "neck", 1);
        silverNecklace = new Equipment("Silver", "Silver Necklace", true, 1000, false, "lck", 8, "a silver necklace", "neck", 1);
        silverBelt = new Equipment("Silver", "Silver Belt", true, 1000, false, "spd", 8, "a silver studded belt", "belt", 1);
        silverRing = new Equipment("Silver", "Silver Ring", true, 1000, false, "lck", 8, "a silver ring", "ring", 1);
        silverCape = new Equipment("Silver", "Silver Embossed Cape", true, 1000, false, "con", 8, "an embossed cape", "back", 1);

        // Platinum equipment ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // weapons
        platinumSword = new Equipment("Platinum", "Platinum Sword", true, 10000, false, "str", 16, "a platinum sword", "mainWeapon", 1);
        platinumBands = new Equipment("Platinum", "Platinum Bands", true, 10000, false, "str", 16, "platinum hand wraps", "mainWeapon", 1);
        platinumBow = new Equipment("Platinum", "Platinum Bow", true, 10000, false, "str", 16, "a platinum bow", "mainWeapon", 1);
        platinumStaff = new Equipment("Platinum", "Platinum Staff", true, 10000, false, "str", 16, "a platinum stick", "mainWeapon", 1);
        platinumDagger = new Equipment("Platinum", "Platinum Dagger", true, 10000, false, "str", 16, "a platinum dagger", "mainWeapon", 1);

        // offhand
        platinumBuckler = new Equipment("Platinum", "Platinum Buckler", true, 10000, false, "def", 32, "a small platinum shield", "offHand", 1);
        platinumKite = new Equipment("Platinum", "Platinum Kite-Shield", true, 10000, false, "def", 64, "a platinum kite-shield", "offHand", 1);

        // armor
        platinumHat = new Equipment("Platinum", "Platinum Helm", true, 10000, false, "def", 16, "a platinum helm", "head", 1);
        platinumChest = new Equipment("Platinum", "Platinum Plate", true, 10000, false, "def", 16, "platinum chest armor", "chest", 1);
        platinumGloves = new Equipment("Platinum", "Platinum Gloves", true, 10000, false, "def", 16, "platinum gloves", "hands", 1);
        platinumPants = new Equipment("Platinum", "Platinum Greaves", true, 10000, false, "def", 16, "platinum greaves", "legs", 1);
        platinumBoots = new Equipment("Platinum", "Platinum Boots", true, 10000, false, "def", 16, "platinum boots", "feet", 1);

        // accessories
        platinumGaiter = new Equipment("Platinum", "Platinum Gaiter", true, 10000, false, "def", 16, "a platinum reinforced neck warmer", "neck", 1);
        platinumNecklace = new Equipment("Platinum", "Platinum Necklace", true, 10000, false, "lck", 16, "a platinum necklace", "neck", 1);
        platinumBelt = new Equipment("Platinum", "Platinum Belt", true, 10000, false, "spd", 16, "a platinum studded belt", "belt", 1);
        platinumRing = new Equipment("Platinum", "Platinum Ring", true, 10000, false, "lck", 16, "a platinum ring", "ring", 1);
        platinumCape = new Equipment("Platinum", "Platinum Embossed Cape", true, 10000, false, "con", 16, "a platinum embossed cape", "back", 1);

        // Diamond equipment +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // weapons
        diamondSword = new Equipment("Diamond", "Diamond Sword", true, 10000, false, "str", 16, "a platinum sword", "mainWeapon", 1);
        diamondBands = new Equipment("Diamond", "Diamond Bands", true, 10000, false, "str", 16, "platinum hand wraps", "mainWeapon", 1);
        diamondBow = new Equipment("Diamond", "Diamond Bow", true, 10000, false, "str", 16, "a platinum bow", "mainWeapon", 1);
        diamondStaff = new Equipment("Diamond", "Diamond Staff", true, 10000, false, "str", 16, "a platinum stick", "mainWeapon", 1);
        diamondDagger = new Equipment("Diamond", "Diamond Dagger", true, 10000, false, "str", 16, "a platinum dagger", "mainWeapon", 1);

        // offhand
        diamondBuckler = new Equipment("Diamond", "Diamond Buckler", true, 10000, false, "def", 32, "a small platinum shield", "offHand", 1);
        diamondKite = new Equipment("Diamond", "Diamond Kite-Shield", true, 10000, false, "def", 64, "a platinum kite-shield", "offHand", 1);

        // armor
        diamondHat = new Equipment("Diamond", "Diamond Helm", true, 10000, false, "def", 16, "a diamond helm", "head", 1);
        diamondChest = new Equipment("Diamond", "Diamond Plate", true, 10000, false, "def", 16, "diamond chest armor", "chest", 1);
        diamondGloves = new Equipment("Diamond", "Diamond Gloves", true, 10000, false, "def", 16, "diamond gloves", "hands", 1);
        diamondPants = new Equipment("Diamond", "Diamond Greaves", true, 10000, false, "def", 16, "diamond greaves", "legs", 1);
        diamondBoots = new Equipment("Diamond", "Diamond Boots", true, 10000, false, "def", 16, "diamond boots", "feet", 1);

        // accessories
        diamondGaiter = new Equipment("Diamond", "Diamond Gaiter", true, 10000, false, "def", 16, "a diamond reinforced neck warmer", "neck", 1);
        diamondNecklace = new Equipment("Diamond", "Diamond Necklace", true, 10000, false, "lck", 16, "a diamond necklace", "neck", 1);
        diamondBelt = new Equipment("Diamond", "Diamond Belt", true, 10000, false, "spd", 16, "a diamond studded belt", "belt", 1);
        diamondRing = new Equipment("Diamond", "Diamond Ring", true, 10000, false, "lck", 16, "a diamond ring", "ring", 1);
        diamondCape = new Equipment("Diamond", "Diamond Embossed Cape", true, 10000, false, "con", 16, "a diamond embossed cape", "back", 1);
    }
}