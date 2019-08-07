public class Main {

    public static void main(String[] args) {
        Boss b1 = new Boss();
        b1.setDamage(69);
        b1.setHealth(99);
        b1.setDefence(54);

        Warrior w2 = new Warrior();
        w2.setDamage(50);
        w2.setHealth(70);
        w2.superPower("Sword");

        Magical m3 = new Magical();
        m3.setDamage(40);
        m3.setHealth(95);
        m3.superPower("Charming");

        Mental mt4 = new Mental();
        mt4.setDamage(80);
        mt4.setHealth(35);
        mt4.superPower("Telekinesis");
    }
}
