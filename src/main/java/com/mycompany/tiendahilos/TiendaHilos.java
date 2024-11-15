package com.mycompany.tiendahilos;

public class TiendaHilos {

    public static void main(String[] args) {
        Thread[] clientes=new Thread[5];
        Caja caja=new Caja();
        
        for(int i=0;i<5;i++){
            int productos=(int)((Math.random()*4)+1);
            clientes[i]=new Thread(new Cliente(("Cliente"+i),productos,caja));
        }
        
        for(Thread aux:clientes) aux.start();
        
    }
}
