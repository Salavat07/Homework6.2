public class Player {
    private int health;
    private long damage;
    private String superPower;
    private int defence;

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public String superPower() {
        return superPower;
    }

    public void superPower(String hitType) {
        this.superPower = hitType;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public long getDamage() {
        return damage;
    }

    public void setDamage(long damage) {
        this.damage = damage;
    }
}