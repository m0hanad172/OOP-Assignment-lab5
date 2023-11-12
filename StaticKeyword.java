/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.statickeyword;

/**
 *
 * @author USER
 */
public class StaticKeyword {

    public static void main(String[] args) {
        Circule c1=new Circule(5);
        Circule c2=new Circule(10);
        Circule c3=new Circule(15);
        
        Circule [] cir={c1,c2,c3};
        for(Circule i:cir){
            System.out.println(i.ComputerArea());
        }
        
    }
}
