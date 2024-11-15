
package com.mycompany.tiendahilos;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Caja {
   private Semaphore sem=new Semaphore(2); 
   public void pasarPorCaja(Cliente cliente){
       try {
           sem.acquire();        
           long inicio=System.currentTimeMillis();
           long producto;
           System.out.println("Bienvenido "+ cliente.getNombreCliente()+ " a la caja ("+cliente.getProductos().size()+" productos)");

           for(String aux:cliente.getProductos()){
               producto=System.currentTimeMillis();
               Thread.sleep((int)(Math.random()*300));
               System.out.println(cliente.getNombreCliente()+" pasando por caja producto: "+aux+" "+(System.currentTimeMillis()-producto)+"ms");
           }
           System.out.println("\n\t--"+cliente.getNombreCliente()+" ha pasado por caja en: "+(System.currentTimeMillis()-inicio)+"ms --");
           sem.release();    
       } catch (InterruptedException ex) {
           Logger.getLogger(Caja.class.getName()).log(Level.SEVERE, null, ex);
       }

   }
   
}
