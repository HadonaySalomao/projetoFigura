/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Usuario
 */
public class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String cor) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public Double area(){
        return (base*altura)/2;
    }
    @Override
    public String toString() {
        return  super.toString()+
                "\nBase:" + base + 
                "\nAltura:" + altura +
                "\nArea:"+area();
    }
    
    
}
