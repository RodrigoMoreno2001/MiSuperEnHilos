
package com.mycompany.tiendahilos;

import java.util.concurrent.Semaphore;


public class Caja {
   private String nombreCaja;
   private Semaphore sem;
   
   public Caja(String nombreCaja, Semaphore sem){
       this.nombreCaja=nombreCaja;
       this.sem=sem;
   }
    
   public void pasarPorCaja(Cliente cliente){
       
       System.out.println("Bienvenido "+ cliente.getNombreCliente()+ " a la caja "+nombreCaja);
       
       for(String aux:cliente.getProductos())System.out.println("Pasando por caja producto: "+aux);
       
   }
   
}
