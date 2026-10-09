package org.cuatrovientos.psp;

import java.util.ArrayList;
import  java.util.Collection;
import java.util.Collections;
public class Main 
{
    public static void main( String[] args )
    {
        ArrayList<Character> characters = new ArrayList<Character>();
        characters.add(new Friend());
        characters.add(new Friend());
        characters.add(new Friend());
        characters.add(new Friend());
        characters.add(new Friend());
        characters.add(new Enemy());
        characters.add(new Enemy());
        characters.add(new Enemy());
        characters.add(new Enemy());
        characters.add(new Enemy());

        Collections.shuffle(characters);

        for (int i = 0; i < characters.size(); i++) {
            Character c = characters.get(i);
            if(c.isEnemy()){
                System.out.println("El personaje "+ (i+1) +" es un enemigo! !MATALO¡");
                System.out.println(c.kill());
            }else{
                System.out.println("El personaje "+ (i+1) +" es un amigo!");
            }
        }
    }
}
