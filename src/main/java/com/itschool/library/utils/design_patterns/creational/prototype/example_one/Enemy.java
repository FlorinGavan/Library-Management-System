package com.itschool.library.utils.design_patterns.creational.prototype.example_one;

public class Enemy implements Prototype{

    private String name;
    private int health;
    private int attack;


    public Enemy(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

       public Enemy(Enemy enemy) {
        this.name = enemy.name;
        this.health = enemy.health;
        this.attack = enemy.attack;
    }
    @Override
    public Prototype clone() {
        return new Enemy(this);
    }
    public  void display(){
        System.out.println("Enemy "+ name +", Health: "+health+ ", Attack: "+attack);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
