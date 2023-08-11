public class Equipment
{
    String name;
    boolean canEquip;
    int cost;
    String buff;
    int buffAmount;
    String description;
    String equipType;
    int numberHeld;
    int maxItemCount;

    Equipment(String name, boolean canEquip, int cost, String buff, int buffAmount, String description, String equipType, int numberHeld) {
        this.name = name;
        this.canEquip = canEquip;
        this.cost = cost;
        this.buff = buff;
        this.buffAmount = buffAmount;
        this.description = description;
        this.equipType = equipType;
        this.numberHeld = numberHeld;
        this.maxItemCount = 99;
    }

    // enchants equipment with beneficial or detrimental effects
    void enchantEquipment(String buffType, int buffAmount)
    {
        switch(buffType){
            // detrimental - buffAmount is turn/time count.
            case "poison" -> { this.buff = "poison"; this.buffAmount = buffAmount; }
            case "burn" -> { this.buff = "burn"; this.buffAmount = buffAmount; }
            case "blind" -> { this.buff = "blind"; this.buffAmount = buffAmount; }
            case "stun" -> { this.buff = "stun"; this.buffAmount = buffAmount; }
            case "berserk" -> { this.buff = "berserk"; this.buffAmount = buffAmount; }
            case "sleep" -> { this.buff = "sleep"; this.buffAmount = buffAmount; }

            // beneficial - buffAmount is amount to increase or decrease stats
            case "hp" -> { this.buff = "hp"; this.buffAmount = buffAmount; }
            case "str" -> { this.buff = "str"; this.buffAmount = buffAmount; }
            case "def" -> { this.buff = "def"; this.buffAmount = buffAmount; }
            case "con" -> { this.buff = "con"; this.buffAmount = buffAmount; }
            case "wis" -> { this.buff = "wis"; this.buffAmount = buffAmount; }
            case "spd" -> { this.buff = "spd"; this.buffAmount = buffAmount; }
            case "lck" -> { this.buff = "lck"; this.buffAmount = buffAmount; }
        }
    }
}