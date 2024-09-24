package com.mycompany.personaexamen;

import paq.*;

/**
 *
 * @author luisa
 */
public class PersonaExamen {

    public static void main(String[] args) {
        
        //testeando la clase persona con el metodo calcularIMC
        int imcStatus;
        String pesoIdeal;
        
        //creando la primera persona
        Persona miPersona1 = new Persona();
        miPersona1.setNombre("Luisa");
        miPersona1.setPeso(65f);
        miPersona1.setAltura(1.80f);
        miPersona1.setEdad((byte) 50);
        miPersona1.setSexo('M');

        System.out.println(miPersona1);
        imcStatus = miPersona1.calcularIMC();
        pesoIdeal = pesoIdeal(imcStatus);
        System.out.println(pesoIdeal);
          
        //creando la segunda persona
        Persona miPersona2 = new Persona();
        miPersona2.setNombre("Mario");
        miPersona2.setPeso(100f);
        miPersona2.setAltura(1.75f);
        miPersona2.setEdad((byte) 70);
        miPersona2.setSexo('H');

        System.out.println(miPersona2);

        imcStatus = miPersona2.calcularIMC();
        pesoIdeal = pesoIdeal(imcStatus);
        System.out.println(pesoIdeal);

          //creando la tercera persona
        Persona miPersona3 = new Persona();
        miPersona3.setNombre("Maria");
        miPersona3.setPeso(45f);
        miPersona3.setAltura(1.62f);
        miPersona3.setEdad((byte) 40);
        miPersona3.setSexo('M');

        System.out.println(miPersona3);
        imcStatus = miPersona3.calcularIMC();
        pesoIdeal = pesoIdeal(imcStatus);
        System.out.println(pesoIdeal + "\n");
        
        //creando una carro
        
        Vehiculo miCarro = new Vehiculo();
        miCarro.setMarca("Mercedes Benz");
        miCarro.setModelo("CLE 300 e");
        miCarro.setAno(2024);
        
        System.out.println(miCarro);
        
        Itraducible[] miImplementacion = new Itraducible[4];
        miImplementacion[0] = miPersona1;
        miImplementacion[1] = miPersona2;
        miImplementacion[2] = miPersona3;
        miImplementacion[3] = miCarro;
        
        for(Itraducible implementacion : miImplementacion){
            
        System.out.println(implementacion.aIngles());
        }
        
      
    }
    //creando el metodo  tipo String para devolver el peso ideal
    
    public static String pesoIdeal(int imcStatus) {
        String result;
          if(imcStatus < 0) {
              result = "Esta por de bajo del peso ideal";
          } else if(imcStatus > 0) {
              result = "Esta por de encima del peso ideal";
          } else
          result = "Estas en tu peso ideal";
          return result;
    }
}
