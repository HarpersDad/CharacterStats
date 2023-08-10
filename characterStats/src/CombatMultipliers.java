public class CombatMultipliers
{
    int criticalHit;
    int normalHit;
    int weakHit;
    int normalMiss;
    int criticalMiss;

    CombatMultipliers(int criticalHit, int normalHit, int weakHit, int normalMiss, int criticalMiss)
    {
        this.criticalHit = criticalHit;
        this.normalHit = normalHit;
        this.weakHit = weakHit;
        this.normalMiss = normalMiss;
        this.criticalMiss = criticalMiss;
    }
}
