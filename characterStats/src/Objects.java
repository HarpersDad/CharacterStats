// java file for equipment and item data
import java.text.DecimalFormat;

public class Objects
{
    // for rounding
    static final DecimalFormat df = new DecimalFormat("0");

    // sets the equipment values for each equippable object
    static void createEquipment()
    {
        // cannot be enchanted
        // unequipped ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        Equipment.unEquipped = new Equipment(
                "", "", true, 0, false, "",
                0, "nothing equipped", "mainWeapon", 1
        );

        // basic equipment +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // main weapons
        Equipment.shortSword = new Equipment(
                "Leather", "Short Sword", true, 1, false, "str",
                1, "a short sword", "mainWeapon", 1
        );

        Equipment.leatherBands = new Equipment(
                "Leather", "Leather Bands", true, 1, false, "str",
                1, "leather hand wraps", "mainWeapon", 1
        );

        Equipment.shortBow = new Equipment(
                "Leather", "Short Bow", true, 1, false, "str",
                1, "a short bow", "mainWeapon", 1
        );

        Equipment.walkingStaff = new Equipment(
                "Leather", "Walking Staff", true, 1, false, "str",
                1, "an old walking stick", "mainWeapon", 1
        );

        Equipment.dagger = new Equipment(
                "Leather", "Dagger", true, 1, false, "str",
                1, "a small dagger", "mainWeapon", 1
        );

        // offhand
        Equipment.leatherBuckler = new Equipment(
                "Leather", "Leather Buckler", true, 1, false, "def",
                2, "a small worn leather shield", "offHand", 1
        );

        Equipment.woodenKite = new Equipment(
                "Leather", "Wooden Shield", true, 1, false, "def",
                4, "an old wooden kite-shield", "offHand", 1
        );

        // armor
        Equipment.leatherHat = new Equipment(
                "Leather", "Leather Hat", true, 1, false, "def",
                1, "a worn leather hat", "head", 1
        );

        Equipment.leatherChest = new Equipment(
                "Leather", "Leather Chest", true, 1, false, "def",
                1, "worn leather chest armor", "chest", 1
        );

        Equipment.leatherGloves = new Equipment(
                "Leather", "Leather Gloves", true, 1, false, "def",
                1, "worn leather gloves", "hands", 1
        );

        Equipment.leatherPants = new Equipment(
                "Leather", "Leather Pants", true, 1, false, "def",
                1, "worn leather pants", "legs", 1
        );

        Equipment.leatherBoots = new Equipment(
                "Leather", "Leather Boots", true, 1, false, "def",
                1, "worn leather boots", "feet", 1
        );

        // accessories
        Equipment.leatherGaiter = new Equipment(
                "Leather", "Leather Gaiter", true, 1, false, "def",
                1, "a worn leather neck warmer", "neck", 1
        );

        Equipment.brassNecklace = new Equipment(
                "Leather", "Brass Necklace", true, 1, false, "lck",
                1, "an old brass necklace", "neck", 1
        );

        Equipment.leatherBelt = new Equipment(
                "Leather", "Leather Belt", true, 1, false, "spd",
                1, "a worn leather belt", "belt", 1
        );

        Equipment.brassRing = new Equipment(
                "Leather", "Brass Ring", true, 1, false, "wis",
                1, "an old brass ring", "ring", 1
        );

        Equipment.leatherCape = new Equipment(
                "Leather", "Leather Cape", true, 1, false, "con",
                1, "an old leather cape", "back", 1
        );

        // Iron equipment ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // main weapons
        Equipment.ironSword = new Equipment(
                "Iron", "Iron Sword", true, 10, false, "str",
                2, "an iron sword", "mainWeapon", 1
        );

        Equipment.ironBands = new Equipment(
                "Iron", "Iron Bands", true, 10, false, "str",
                2, "iron studded hand wraps", "mainWeapon", 1
        );

        Equipment.ironBow = new Equipment(
                "Iron", "Iron Bow", true, 10, false, "str",
                2, "an iron bow", "mainWeapon", 1
        );

        Equipment.ironStaff = new Equipment(
                "Iron", "Iron Staff", true, 10, false, "str",
                2, "an iron walking stick", "mainWeapon", 1
        );

        Equipment.ironDagger = new Equipment(
                "Iron", "Iron Dagger", true, 10, false, "str",
                2, "an iron dagger", "mainWeapon", 1
        );

        // offhand
        Equipment.ironBuckler = new Equipment(
                "Iron", "Iron Buckler", true, 10, false, "def",
                4, "a small iron shield", "offHand", 1
        );

        Equipment.ironKite = new Equipment(
                "Iron", "Iron Shield", true, 10, false, "def",
                8, "an iron kite-shield", "offHand", 1
        );

        // armor
        Equipment.ironHat = new Equipment(
                "Iron", "Iron Helm", true, 10, false, "def",
                2, "an iron helm", "head", 1
        );

        Equipment.ironChest = new Equipment(
                "Iron", "Iron Plate", true, 10, false, "def",
                2, "iron chest armor", "chest", 1
        );

        Equipment.ironGloves = new Equipment(
                "Iron", "Iron Gloves", true, 10, false, "def",
                2, "reinforced iron gloves", "hands", 1
        );

        Equipment.ironPants = new Equipment(
                "Iron", "Iron Greaves", true, 10, false, "def",
                2, "iron greaves", "legs", 1
        );

        Equipment.ironBoots = new Equipment(
                "Iron", "Iron Boots", true, 10, false, "def",
                2, "iron boots", "feet", 1
        );

        // accessories
        Equipment.ironGaiter = new Equipment(
                "Iron", "Iron Gaiter", true, 10, false, "def",
                2, "an iron reinforced neck warmer", "neck", 1
        );

        Equipment.ironNecklace = new Equipment(
                "Iron", "Necklace", true, 10, false, "lck",
                2, "a necklace", "neck", 1
        );

        Equipment.ironBelt = new Equipment(
                "Iron", "Iron Belt", true, 10, false, "spd",
                2, "an iron studded belt", "belt", 1
        );

        Equipment.ironRing = new Equipment(
                "Iron", "Iron Ring", true, 10, false, "wis",
                2, "an iron ring", "ring", 1
        );

        Equipment.ironCape = new Equipment(
                "Iron", "Studded Cape", true, 10, false, "con",
                2, "a leather studded cape", "back", 1
        );

        // Steel equipment +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // main weapons
        Equipment.steelSword = new Equipment(
                "Steel", "Steel Sword", true, 100, false, "str",
                4, "a steel sword", "mainWeapon", 1
        );

        Equipment.steelBands = new Equipment(
                "Steel", "Steel Bands", true, 100, false, "str",
                4, "steel hand wraps", "mainWeapon", 1
        );

        Equipment.steelBow = new Equipment(
                "Steel", "Steel Bow", true, 100, false, "str",
                4, "a steel bow", "mainWeapon", 1
        );

        Equipment.steelStaff = new Equipment(
                "Steel", "Steel Staff", true, 100, false, "str",
                4, "a steel stick", "mainWeapon", 1
        );

        Equipment.steelDagger = new Equipment(
                "Steel", "Steel Dagger", true, 100, false, "str",
                4, "a steel dagger", "mainWeapon", 1
        );

        // offhand
        Equipment.steelBuckler = new Equipment(
                "Steel", "Steel Buckler", true, 100, false, "def",
                8, "a small steel shield", "offHand", 1
        );

        Equipment.steelKite = new Equipment(
                "Steel", "Steel Shield", true, 100, false, "def",
                16, "a steel kite-shield", "offHand", 1
        );

        // armor
        Equipment.steelHat = new Equipment(
                "Steel", "Steel Helm", true, 100, false, "def",
                4, "a steel helm", "head", 1
        );

        Equipment.steelChest = new Equipment(
                "Steel", "Steel Plate", true, 100, false, "def",
                4, "steel chest armor", "chest", 1
        );

        Equipment.steelGloves = new Equipment(
                "Steel", "Steel Gloves", true, 100, false, "def",
                4, "steel gloves", "hands", 1
        );

        Equipment.steelPants = new Equipment(
                "Steel", "Steel Greaves", true, 100, false, "def",
                4, "steel greaves", "legs", 1
        );

        Equipment.steelBoots = new Equipment(
                "Steel", "Steel Boots", true, 100, false, "def",
                4, "steel boots", "feet", 1
        );

        // accessories
        Equipment.steelGaiter = new Equipment(
                "Steel", "Steel Gaiter", true, 100, false, "def",
                4, "a steel reinforced neck warmer", "neck", 1
        );

        Equipment.steelNecklace = new Equipment(
                "Steel", "Steel Necklace", true, 100, false, "lck",
                4, "a steel necklace", "neck", 1
        );

        Equipment.steelBelt = new Equipment(
                "Steel", "Steel Belt", true, 100, false, "spd",
                4, "a steel studded belt", "belt", 1
        );

        Equipment.steelRing = new Equipment(
                "Steel", "Steel Ring", true, 100, false, "wis",
                4, "a steel ring", "ring", 1
        );

        Equipment.steelCape = new Equipment(
                "Steel", "Ornate Cape", true, 100, false, "con",
                4, "an ornate cape", "back", 1
        );

        // Silver equipment ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // weapons
        Equipment.silverSword = new Equipment(
                "Silver", "Silver Sword", true, 1000, false, "str",
                8, "a silver sword", "mainWeapon", 1
        );

        Equipment.silverBands = new Equipment(
                "Silver", "Silver Bands", true, 1000, false, "str",
                8, "silver hand wraps", "mainWeapon", 1
        );

        Equipment.silverBow = new Equipment(
                "Silver", "Silver Bow", true, 1000, false, "str",
                8, "a silver bow", "mainWeapon", 1
        );

        Equipment.silverStaff = new Equipment(
                "Silver", "Silver Staff", true, 1000, false, "str",
                8, "a silver stick", "mainWeapon", 1
        );

        Equipment.silverDagger = new Equipment(
                "Silver", "Silver Dagger", true, 1000, false, "str",
                8, "a silver dagger", "mainWeapon", 1
        );

        // offhand
        Equipment.silverBuckler = new Equipment(
                "Silver", "Silver Buckler", true, 1000, false, "def",
                16, "a small silver shield", "offHand", 1
        );

        Equipment.silverKite = new Equipment(
                "Silver", "Silver Shield", true, 1000, false, "def",
                32, "a silver kite-shield", "offHand", 1
        );

        // armor
        Equipment.silverHat = new Equipment(
                "Silver", "Silver Helm", true, 1000, false, "def",
                8, "a silver helm", "head", 1
        );

        Equipment.silverChest = new Equipment(
                "Silver", "Silver Plate", true, 1000, false, "def",
                8, "silver chest armor", "chest", 1
        );

        Equipment.silverGloves = new Equipment(
                "Silver", "Silver Gloves", true, 1000, false, "def",
                8, "silver gloves", "hands", 1
        );

        Equipment.silverPants = new Equipment(
                "Silver", "Silver Greaves", true, 1000, false, "def",
                8, "silver greaves", "legs", 1
        );

        Equipment.silverBoots = new Equipment(
                "Silver", "Silver Boots", true, 1000, false, "def",
                8, "silver boots", "feet", 1
        );

        // accessories
        Equipment.silverGaiter = new Equipment(
                "Silver", "Silver Gaiter", true, 1000, false, "def",
                8, "a silver reinforced neck warmer", "neck", 1
        );

        Equipment.silverNecklace = new Equipment(
                "Silver", "Silver Necklace", true, 1000, false, "lck",
                8, "a silver necklace", "neck", 1
        );

        Equipment.silverBelt = new Equipment(
                "Silver", "Silver Belt", true, 1000, false, "spd",
                8, "a silver studded belt", "belt", 1
        );

        Equipment.silverRing = new Equipment(
                "Silver", "Silver Ring", true, 1000, false, "wis",
                8, "a silver ring", "ring", 1
        );

        Equipment.silverCape = new Equipment(
                "Silver", "Silver Cape", true, 1000, false, "con",
                8, "an embossed cape", "back", 1
        );

        // Platinum equipment ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // weapons
        Equipment.platinumSword = new Equipment(
                "Platinum", "Platinum Sword", true, 10000, false, "str",
                16, "a platinum sword", "mainWeapon", 1
        );

        Equipment.platinumBands = new Equipment(
                "Platinum", "Platinum Bands", true, 10000, false, "str",
                16, "platinum hand wraps", "mainWeapon", 1
        );

        Equipment.platinumBow = new Equipment(
                "Platinum", "Platinum Bow", true, 10000, false, "str",
                16, "a platinum bow", "mainWeapon", 1
        );

        Equipment.platinumStaff = new Equipment(
                "Platinum", "Platinum Staff", true, 10000, false, "str",
                16, "a platinum stick", "mainWeapon", 1
        );

        Equipment.platinumDagger = new Equipment(
                "Platinum", "Platinum Dagger", true, 10000, false, "str",
                16, "a platinum dagger", "mainWeapon", 1
        );

        // offhand
        Equipment.platinumBuckler = new Equipment(
                "Platinum", "Platinum Buckler", true, 10000, false, "def",
                32, "a small platinum shield", "offHand", 1
        );

        Equipment.platinumKite = new Equipment(
                "Platinum", "Platinum Shield", true, 10000, false, "def",
                64, "a platinum kite-shield", "offHand", 1
        );

        // armor
        Equipment.platinumHat = new Equipment(
                "Platinum", "Platinum Helm", true, 10000, false, "def",
                16, "a platinum helm", "head", 1
        );

        Equipment.platinumChest = new Equipment(
                "Platinum", "Platinum Plate", true, 10000, false, "def",
                16, "platinum chest armor", "chest", 1
        );

        Equipment.platinumGloves = new Equipment(
                "Platinum", "Platinum Gloves", true, 10000, false, "def",
                16, "platinum gloves", "hands", 1
        );

        Equipment.platinumPants = new Equipment(
                "Platinum", "Platinum Greaves", true, 10000, false, "def",
                16, "platinum greaves", "legs", 1
        );

        Equipment.platinumBoots = new Equipment(
                "Platinum", "Platinum Boots", true, 10000, false, "def",
                16, "platinum boots", "feet", 1
        );

        // accessories
        Equipment.platinumGaiter = new Equipment(
                "Platinum", "Platinum Gaiter", true, 10000, false, "def",
                16, "a platinum reinforced neck warmer", "neck", 1
        );

        Equipment.platinumNecklace = new Equipment(
                "Platinum", "Platinum Necklace", true, 10000, false, "lck",
                16, "a platinum necklace", "neck", 1
        );

        Equipment.platinumBelt = new Equipment(
                "Platinum", "Platinum Belt", true, 10000, false, "spd",
                16, "a platinum studded belt", "belt", 1
        );

        Equipment.platinumRing = new Equipment(
                "Platinum", "Platinum Ring", true, 10000, false, "wis",
                16, "a platinum ring", "ring", 1
        );

        Equipment.platinumCape = new Equipment(
                "Platinum", "Platinum Cape", true, 10000, false, "con",
                16, "a platinum embossed cape", "back", 1
        );

        // Diamond equipment +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // weapons
        Equipment.diamondSword = new Equipment(
                "Diamond", "Diamond Sword", true, 10000, false, "str",
                16, "a diamond sword", "mainWeapon", 1
        );

        Equipment.diamondBands = new Equipment(
                "Diamond", "Diamond Bands", true, 10000, false, "str",
                16, "diamond hand wraps", "mainWeapon", 1
        );

        Equipment.diamondBow = new Equipment(
                "Diamond", "Diamond Bow", true, 10000, false, "str",
                16, "a diamond bow", "mainWeapon", 1
        );

        Equipment.diamondStaff = new Equipment(
                "Diamond", "Diamond Staff", true, 10000, false, "str",
                16, "a diamond stick", "mainWeapon", 1
        );

        Equipment.diamondDagger = new Equipment(
                "Diamond", "Diamond Dagger", true, 10000, false, "str",
                16, "a diamond dagger", "mainWeapon", 1
        );

        // offhand
        Equipment.diamondBuckler = new Equipment(
                "Diamond", "Diamond Buckler", true, 10000, false, "def",
                32, "a small diamond shield", "offHand", 1
        );

        Equipment.diamondKite = new Equipment(
                "Diamond", "Diamond Shield", true, 10000, false, "def",
                64, "a diamond kite-shield", "offHand", 1
        );

        // armor
        Equipment.diamondHat = new Equipment(
                "Diamond", "Diamond Helm", true, 10000, false, "def",
                16, "a diamond helm", "head", 1
        );

        Equipment.diamondChest = new Equipment(
                "Diamond", "Diamond Plate", true, 10000, false, "def",
                16, "diamond chest armor", "chest", 1
        );

        Equipment.diamondGloves = new Equipment(
                "Diamond", "Diamond Gloves", true, 10000, false, "def",
                16, "diamond gloves", "hands", 1
        );

        Equipment.diamondPants = new Equipment(
                "Diamond", "Diamond Greaves", true, 10000, false, "def",
                16, "diamond greaves", "legs", 1
        );

        Equipment.diamondBoots = new Equipment(
                "Diamond", "Diamond Boots", true, 10000, false, "def",
                16, "diamond boots", "feet", 1
        );

        // accessories
        Equipment.diamondGaiter = new Equipment(
                "Diamond", "Diamond Gaiter", true, 10000, false, "def",
                16, "a diamond reinforced neck warmer", "neck", 1
        );

        Equipment.diamondNecklace = new Equipment(
                "Diamond", "Diamond Necklace", true, 10000, false, "lck",
                16, "a diamond necklace", "neck", 1
        );

        Equipment.diamondBelt = new Equipment(
                "Diamond", "Diamond Belt", true, 10000, false, "spd",
                16, "a diamond studded belt", "belt", 1
        );

        Equipment.diamondRing = new Equipment(
                "Diamond", "Diamond Ring", true, 10000, false, "wis",
                16, "a diamond ring", "ring", 1
        );

        Equipment.diamondCape = new Equipment(
                "Diamond", "Diamond Cape", true, 10000, false, "con",
                16, "a diamond embossed cape", "back", 1
        );
    }
    // *****************************************************************************************************************
    // =================================================================================================================
    // *****************************************************************************************************************

    // sets the item values for each item
    static void createItems()
    {
        Items.tonic = new Items(
                "Tonic", 1, "heal", 1, "a healing tonic", 1
        );

        Items.tent = new Items(
                "Tent", 1, "fullHeal", 1, "a camping tent", 1
        );

        Items.panacea = new Items(
                "Panacea", 1, "antidote", 1, "a status remedy", 1
        );

        Items.revivePowder = new Items(
                "Revival Powder", 1, "revive", 1, "a revival powder", 1
        );

        Items.rock = new Items(
                "Rock", 0, "", 0,"a small stone", 1
        );
    }
}