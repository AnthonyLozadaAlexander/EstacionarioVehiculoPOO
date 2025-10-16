/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author USUARIO
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private double precioBase;
    
    public Vehiculo(){
        
    }
    
    public Vehiculo(String marca, String modelo, int anio, double precioBase){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precioBase = precioBase;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        if(precioBase < 0){
            this.precioBase = 0;
        }
        else{
        this.precioBase = precioBase;
        }
    }
    
    public double calcularTotal(){
        return precioBase;
    }
    
    public String mostrarInfo(){
        return "Marca: " + marca + "\nModelo: " + modelo + "\nAño: " + anio + "\nPrecioBase: " + precioBase + "\n";
    }
    
}
