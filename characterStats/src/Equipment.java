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
}
