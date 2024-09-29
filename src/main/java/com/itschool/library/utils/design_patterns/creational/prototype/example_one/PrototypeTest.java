package com.itschool.library.utils.design_patterns.creational.prototype.example_one;

public class PrototypeTest {

    public static void main(String[] args) {

        Enemy goblin = new Enemy("Goblin ", 100 , 15);

        Enemy goblinClone1 = (Enemy) goblin.clone();
        goblinClone1.display();

        Enemy goblinClone2 = (Enemy) goblin.clone();
        goblinClone2.display();

        goblinClone1.setName("Goblin Leader");
        goblinClone1.setHealth(300);
        goblinClone1.setAttack(50);
        goblinClone1.display();

        goblin.display();
    }
}
