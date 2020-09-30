package edu.facturacion;

import java.util.List;

public class Factura {
	private int numero;
    
	public Factura(int numero, List<Producto> productos) {
		super();
		this.numero = numero;
		this.productos = productos;
	}

	private List<Producto> productos;
   
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
   
    }
   
    public String toString() {
    	return "Los productos que están en la factura1 son" + ListaProductos;
    }
}
