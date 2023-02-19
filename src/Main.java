public class Main {
    public static void main(String[] args) {

Boss boss = new Boss();
boss.setDefense("Magic");
boss.setAttack(500);
boss.setHeals(2000);
        System.out.println(boss.getAttack());
        System.out.println(boss.getDefense());
        System.out.println(boss.getHeals());

    }

}