/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author thiago.silva14
 */
public class polimorfismo {
    public static void main(String[] args) {
      /*  calculadora calc = new calculadora();
        System.out.println(calc.somar(2,3,6));*/
      
      
      Gato gato = new Gato();
      Cachorro cachorro = new Cachorro();
              Pato pato = new Pato();
              
              gato.comunicar();
              cachorro.comunicar();
              pato.comunicar();
              
              
    }
}
