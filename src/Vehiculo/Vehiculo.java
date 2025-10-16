/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculo;

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
    
    public double calcularTotal(){
        return precioBase;
    }
    
    public String mostrarInfo(){
        return "Marca: " + marca + "\nModelo: " + modelo + "\nAño: " + anio + "\nPrecioBase: " + precioBase + "\n";
    }
    
}
