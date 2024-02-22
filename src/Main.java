
public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр босса и задаем свойства
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setDefenseType("Armor");

        // Выводим информацию о боссе
        System.out.println("Boss Info:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getDefenseType());

        // Создаем героев с помощью метода createHeroes
        Hero[] heroes = createHeroes();

        // Выводим информацию о героях
        System.out.println("\nHeroes Info:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth());
            System.out.println("Damage: " + hero.getDamage());
            System.out.println("Superpower: " + hero.getSuperpower() + "\n");
        }
    }

    // Метод для создания трех героев
    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 20, "Flight");
        Hero hero2 = new Hero(120, 25);
        Hero hero3 = new Hero(80, 15, "Invisibility");

        // Возвращаем массив созданных героев
        return new Hero[]{hero1, hero2, hero3};
    }
}
