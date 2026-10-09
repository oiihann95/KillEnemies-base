package org.cuatrovientos.psp;

public class Enemy implements Character{
    public Enemy (){
        
    }

    public boolean isEnemy() {
        return  true;
    };

    public String kill(){
        return "Ahhhggg, me mataste, bastardo!";
    }
}
