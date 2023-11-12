/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.statickeyword;

/**
 *
 * @author USER
 */
public class Circule {
    static final float  PI =3.14f ;
    private int  radius;
    
    public  Circule(int radius  ) {
       
        SetR(radius);
    
}
    
  public void SetR(int radius ){
     this.radius=radius ;
 }  
    
 public float ComputerArea() {
     
     return PI*this.radius *this.radius ;
 }  
    
    
}
