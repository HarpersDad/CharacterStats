// simple inventory class
public class Items
{
    // set item parameters
    String name;

    boolean canEquip;

    int cost;

    String buff;

    int buffAmount;

    String description;

    String equipType;

    // item constructor
    Items(String name, boolean canEquip, int cost, String buff, int buffAmount, String description, String equipType)
    {
        this.name = name;
        this.canEquip = canEquip;
        this.cost = cost;
        this.buff = buff;
        this.buffAmount = buffAmount;
        this.description = description;
        this.equipType = equipType;
    }
}
