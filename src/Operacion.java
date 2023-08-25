/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ESTUDIANTE
 */
public class Operacion {
    private float Elemento1;
    private float Elemento2;

    public Operacion(float Elemento1, float Elemento2) {
        this.Elemento1 = Elemento1;
        this.Elemento2 = Elemento2;
    }
    public Operacion (){}
    

    public float getElemento1() {
        return Elemento1;
    }

    public float getElemento2() {
        return Elemento2;
    }

    public void setElemento1(float Elemento1) {
        this.Elemento1 = Elemento1;
    }

    public void setElemento2(float Elemento2) {
        this.Elemento2 = Elemento2;
    }
    public float sumar() {
      return this.Elemento1 + this.Elemento2;
    }
    
   public float restar() {
       return this.Elemento1 - this.Elemento2;
               }
   public float multiplicar () {
       return this.Elemento1 * this.Elemento2;
               }
   public  float dividir () {
       return this.Elemento1 /this.Elemento2;
   }
   
    }
    

