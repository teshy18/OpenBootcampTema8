/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciostema8;

/**
 *
 * @author Sebastian
 */
public class EjerciciosTema8 {

    public static void main(String[] args) {
      Persona persona = new Persona();

      persona.setEdad(30);
      persona.setNombre("Sebastian");
      persona.setTelefono(536377);
      
      System.out.println("Edad: "+ persona.getEdad());
      System.out.println("Nombre: " + persona.getNombre());
      System.out.println("Telefono: "+ persona.getTelefono());
      
      
    }
}
