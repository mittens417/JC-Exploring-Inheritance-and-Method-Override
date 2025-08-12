package org.example;

class ArmoredCharacter extends GameCharacter {

    @Override
    int takeDamage(int rawAmount){
        int amount = rawAmount/2;
        super.takeDamage(amount);
        return amount;
    }

}
