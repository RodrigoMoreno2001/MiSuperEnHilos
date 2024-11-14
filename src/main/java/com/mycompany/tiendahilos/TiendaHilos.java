package com.mycompany.tiendahilos;

public class TiendaHilos {

    public static void main(String[] args) {
        Thread[] clientes=new Thread[5];
        Caja caja=new Caja();
        for(int i=0;i<5;i++){
            clientes[i]=new Thread(new Cliente(("Cliente"+i),5,caja));
        }
        for(Thread aux:clientes) aux.start();
        
    }
}
