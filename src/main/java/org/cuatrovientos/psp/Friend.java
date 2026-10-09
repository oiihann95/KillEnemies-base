package org.cuatrovientos.psp;

public class Friend implements Character{
    public Friend(){

    }
    
    public boolean isEnemy() {
        return false;
    }

    public String kill() {
        return "No puedo matar a un amigo";
    }
}
