package com.codegym.task.task29.task2909.human;

public class Soldier extends Human{

    protected boolean isSoldier;

    public void live() {
            this.fight();
    }

    public void fight() {
    }
    public Soldier(String name, int age) {
        super(name, age);
    }
}
