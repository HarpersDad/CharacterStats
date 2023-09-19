public class Jobs
{
    // assigns the character's job and weapons
    static void assignJob(Player player)
    {
        // adds stats to the player based on the job chosen
        switch (player.job)
        {
            case "defender"
                    -> {
                // starting stats
                player.hp = 20;
                player.str = 2;
                player.def = 3;
                player.con = 3;
                player.wis = 2;
                player.spd = 1;
                player.lck = 1;
                player.gold = 10;

                // starting items
                player.inventory[0] = Items.tonic;
                player.inventory[1] = Items.tent;
                player.inventory[2] = Items.panacea;
                player.inventory[3] = Items.revivePowder;

                // if statements that check the type of gear the player has and sets the weapons for the job
                if (player.equipmentType.equals("Leather"))
                {
                    player.mainWeapon = Equipment.shortSword;
                    player.offHand = Equipment.woodenKite;
                }

                if (player.equipmentType.equals("Iron"))
                {
                    player.mainWeapon = Equipment.ironSword;
                    player.offHand = Equipment.ironKite;
                }

                if (player.equipmentType.equals("Steel"))
                {
                    player.mainWeapon = Equipment.steelSword;
                    player.offHand = Equipment.steelKite;
                }

                if (player.equipmentType.equals("Silver"))
                {
                    player.mainWeapon = Equipment.silverSword;
                    player.offHand = Equipment.silverKite;
                }

                if (player.equipmentType.equals("Platinum"))
                {
                    player.mainWeapon = Equipment.platinumSword;
                    player.offHand = Equipment.platinumKite;
                }

                if (player.equipmentType.equals("Diamond"))
                {
                    player.mainWeapon = Equipment.diamondSword;
                    player.offHand = Equipment.diamondKite;
                }
            }

            case "ranger"
                    -> {
                player.hp = 10;
                player.str = 2;
                player.def = 2;
                player.con = 1;
                player.wis = 3;
                player.spd = 3;
                player.lck = 1;
                player.gold = 10;

                // starting items
                player.inventory[0] = Items.tonic;
                player.inventory[1] = Items.tent;
                player.inventory[2] = Items.panacea;
                player.inventory[3] = Items.revivePowder;

                // if statements that check the type of gear the player has and sets the weapons for the job
                if (player.equipmentType.equals("Leather"))
                {
                    player.mainWeapon = Equipment.shortBow;
                    player.offHand = Equipment.unEquipped;
                }

                if (player.equipmentType.equals("Iron"))
                {
                    player.mainWeapon = Equipment.ironBow;
                    player.offHand = Equipment.unEquipped;
                }

                if (player.equipmentType.equals("Steel"))
                {
                    player.mainWeapon = Equipment.steelBow;
                    player.offHand = Equipment.unEquipped;
                }

                if (player.equipmentType.equals("Silver"))
                {
                    player.mainWeapon = Equipment.silverBow;
                    player.offHand = Equipment.unEquipped;
                }

                if (player.equipmentType.equals("Platinum"))
                {
                    player.mainWeapon = Equipment.platinumBow;
                    player.offHand = Equipment.unEquipped;
                }

                if (player.equipmentType.equals("Diamond"))
                {
                    player.mainWeapon = Equipment.diamondBow;
                    player.offHand = Equipment.unEquipped;
                }
            }

            case "fighter"
                    -> {
                player.hp = 13;
                player.str = 3;
                player.def = 2;
                player.con = 1;
                player.wis = 1;
                player.spd = 3;
                player.lck = 2;
                player.gold = 10;

                // starting items
                player.inventory[0] = Items.tonic;
                player.inventory[1] = Items.tent;
                player.inventory[2] = Items.panacea;
                player.inventory[3] = Items.revivePowder;

                // if statements that check the type of gear the player has and sets the weapons for the job
                if (player.equipmentType.equals("Leather"))
                {
                    player.mainWeapon = Equipment.leatherBands;
                    player.offHand = Equipment.unEquipped;
                }

                if (player.equipmentType.equals("Iron"))
                {
                    player.mainWeapon = Equipment.ironBands;
                    player.offHand = Equipment.unEquipped;
                }

                if (player.equipmentType.equals("Steel"))
                {
                    player.mainWeapon = Equipment.steelBands;
                    player.offHand = Equipment.unEquipped;
                }

                if (player.equipmentType.equals("Silver"))
                {
                    player.mainWeapon = Equipment.silverBands;
                    player.offHand = Equipment.unEquipped;
                }

                if (player.equipmentType.equals("Platinum"))
                {
                    player.mainWeapon = Equipment.platinumBands;
                    player.offHand = Equipment.unEquipped;
                }

                if (player.equipmentType.equals("Diamond"))
                {
                    player.mainWeapon = Equipment.diamondBands;
                    player.offHand = Equipment.unEquipped;
                }
            }

            case "mage"
                    -> {
                player.hp = 6;
                player.str = 1;
                player.def = 2;
                player.con = 3;
                player.wis = 3;
                player.spd = 2;
                player.lck = 1;
                player.gold = 10;

                // starting items
                player.inventory[0] = Items.tonic;
                player.inventory[1] = Items.tent;
                player.inventory[2] = Items.panacea;
                player.inventory[3] = Items.revivePowder;

                // if statements that check the type of gear the player has and sets the weapons for the job
                if (player.equipmentType.equals("Leather"))
                {
                    player.mainWeapon = Equipment.walkingStaff;
                    player.offHand = Equipment.leatherBuckler;
                }

                if (player.equipmentType.equals("Iron"))
                {
                    player.mainWeapon = Equipment.ironStaff;
                    player.offHand = Equipment.ironBuckler;
                }

                if (player.equipmentType.equals("Steel"))
                {
                    player.mainWeapon = Equipment.steelStaff;
                    player.offHand = Equipment.steelBuckler;
                }

                if (player.equipmentType.equals("Silver"))
                {
                    player.mainWeapon = Equipment.silverStaff;
                    player.offHand = Equipment.silverBuckler;
                }

                if (player.equipmentType.equals("Platinum"))
                {
                    player.mainWeapon = Equipment.platinumStaff;
                    player.offHand = Equipment.platinumBuckler;
                }

                if (player.equipmentType.equals("Diamond"))
                {
                    player.mainWeapon = Equipment.diamondStaff;
                    player.offHand = Equipment.diamondBuckler;
                }
            }

            case "thief"
                    -> {
                player.hp = 8;
                player.str = 1;
                player.def = 1;
                player.con = 3;
                player.wis = 2;
                player.spd = 3;
                player.lck = 2;
                player.gold = 10;

                // starting items
                player.inventory[0] = Items.tonic;
                player.inventory[1] = Items.tent;
                player.inventory[2] = Items.panacea;
                player.inventory[3] = Items.revivePowder;

                // if statements that check the type of gear the player has and sets the weapons for the job
                if (player.equipmentType.equals("Leather"))
                {
                    player.mainWeapon = Equipment.dagger;
                    player.offHand = Equipment.leatherBuckler;
                }

                if (player.equipmentType.equals("Iron"))
                {
                    player.mainWeapon = Equipment.ironDagger;
                    player.offHand = Equipment.ironBuckler;
                }

                if (player.equipmentType.equals("Steel"))
                {
                    player.mainWeapon = Equipment.steelDagger;
                    player.offHand = Equipment.steelBuckler;
                }

                if (player.equipmentType.equals("Silver"))
                {
                    player.mainWeapon = Equipment.silverDagger;
                    player.offHand = Equipment.silverBuckler;
                }

                if (player.equipmentType.equals("Platinum"))
                {
                    player.mainWeapon = Equipment.platinumDagger;
                    player.offHand = Equipment.platinumBuckler;
                }

                if (player.equipmentType.equals("Diamond"))
                {
                    player.mainWeapon = Equipment.diamondDagger;
                    player.offHand = Equipment.diamondBuckler;
                }
            }

            default
                    -> {
                player.job = "vagrant";
                player.hp = 10;
                player.str = 2;
                player.def = 2;
                player.con = 2;
                player.wis = 2;
                player.spd = 2;
                player.lck = 2;
                player.gold = 0;

                // starting equipment
                player.mainWeapon = Equipment.dagger;
                player.offHand = Equipment.unEquipped;
                player.head = Equipment.unEquipped;
                player.neck = Equipment.unEquipped;
                player.chest = Equipment.unEquipped;
                player.hands = Equipment.unEquipped;
                player.ring = Equipment.brassRing;
                player.belt = Equipment.unEquipped;
                player.legs = Equipment.leatherPants;
                player.feet = Equipment.leatherBoots;
                player.back = Equipment.leatherCape;

                // starting items
                player.inventory[0] = Items.tonic;
                player.inventory[1] = Items.tent;
                player.inventory[2] = Items.panacea;
                player.inventory[3] = Items.revivePowder;
            }
        }
    }
}
