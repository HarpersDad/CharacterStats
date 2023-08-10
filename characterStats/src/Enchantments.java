public class Enchantments
{
    String name;
    String description;
    String buff;
    int buffAmount;

    Enchantments(String name, String description, String buff, int buffAmount)
    {
        this.name = name;
        this.description = description;
        this.buff = buff;
        this.buffAmount = buffAmount;
    }

    void enchantItem(String buffType, int buffAmount)
    {
        switch(buffType){
            // detrimental
            case "poison" -> { this.buff = "poison"; this.buffAmount = 5; }
            case "burn" -> { this.buff = "burn"; this.buffAmount = 5; }
            case "blind" -> { this.buff = "blind"; this.buffAmount = 3; }
            case "stun" -> { this.buff = "stun"; this.buffAmount = 3; }
            case "berserk" -> { this.buff = "berserk"; this.buffAmount = 4; }
            case "sleep" -> { this.buff = "sleep"; this.buffAmount = 4; }

            // beneficial
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
