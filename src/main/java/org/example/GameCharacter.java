package org.example;

class GameCharacter {
private int health = 100;


    int takeDamage(int rawAmount){
        int amount = rawAmount * 1;
        this.health -= amount;
        return amount;
    }



    int getHealth(){
        return health;
    }
}
