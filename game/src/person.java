public class person {
    public static void main(String[] args) {
        game Archer = new game(15, 30, 10);
        Archer.getCurrentStatus();
        Archer.name = "Archer";
        Archer.weapon = "Poseidon's bow";
        Archer.Moves = "darkness  Shoot";
        Archer.ShoutMyName();
        game berserker = new game(20, 15, 5);
        berserker.getCurrentStatus();
        berserker.name = "berserker";
        berserker.weapon = "Sun Axe";
        berserker.Moves = "Double Slash";
        berserker.ShoutMyName();
        game Magician = new game(10, 40, 30);
        Magician.getCurrentStatus();
        Magician.name = "Magician";
        Magician.weapon = "God's Staff";
        Magician.Moves = "God's Staff";
        Magician.ShoutMyName();
    }
}