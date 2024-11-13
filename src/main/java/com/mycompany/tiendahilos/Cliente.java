
package com.mycompany.tiendahilos;

public class Cliente implements Runnable{
    private String nombreCliente;
    private final String[] posiblesProductos = { "Croquetas para perros", "Snacks de carne deshidratada", "Alimento húmedo enlatado", "Comida balanceada para cachorros", "Galletas para perro sabor pollo", "Alimento hipoalergénico", "Suplemento nutricional para perros", "Bocadillos naturales de pollo", "Comida vegana para perros", "Premios dentales", "Hueso relleno de carne", "Snacks de salmón", "Comida para perros mayores", "Premios sabor tocino", "Croquetas sin cereales", "Galletas de avena y miel", "Puré de verduras para perros", "Bocadillos de pavo", "Alimento orgánico para perros", "Snacks de hígado de pollo" };
    private String[] productos;
    private Caja[] cajas;
            
    public Cliente(String nombreCliente,int productos,Caja[] cajas){
        this.nombreCliente=nombreCliente;
        this.productos=new String[productos];       
        for(int i=0;i<productos;i++) this.productos[i]=posiblesProductos[(int) (Math.random()*posiblesProductos.length)];
        this.cajas=cajas;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String[] getProductos() {
        return productos;
    }

    public void setProductos(String[] productos) {
        this.productos = productos;
    }

    @Override
    public void run() {
        for(Caja aux:this.cajas){
            aux.pasarPorCaja(this);
        }
    }
    
    
    
}
