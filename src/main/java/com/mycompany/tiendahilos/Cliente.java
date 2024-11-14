
package com.mycompany.tiendahilos;

import java.util.ArrayList;

public class Cliente implements Runnable{
    private String nombreCliente;
    private final String[] posiblesProductos = { "Croquetas para perros", "Snacks de carne deshidratada", "Alimento húmedo enlatado", "Comida balanceada para cachorros", "Galletas para perro sabor pollo", "Alimento hipoalergénico", "Suplemento nutricional para perros", "Bocadillos naturales de pollo", "Comida vegana para perros", "Premios dentales", "Hueso relleno de carne", "Snacks de salmón", "Comida para perros mayores", "Premios sabor tocino", "Croquetas sin cereales", "Galletas de avena y miel", "Puré de verduras para perros", "Bocadillos de pavo", "Alimento orgánico para perros", "Snacks de hígado de pollo" };
    private ArrayList<String> productos;
    private Caja caja;
            
    public Cliente(String nombreCliente,int productos,Caja caja){
        this.nombreCliente=nombreCliente;
        this.productos=new ArrayList<>();       
        for(int i=0;i<productos;i++) this.productos.add(posiblesProductos[(int) (Math.random()*posiblesProductos.length)]);
        this.caja=caja;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public ArrayList<String> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<String> productos) {
        this.productos = productos;
    }

    @Override
    public void run() {
        caja.pasarPorCaja(this);
    }   
}
