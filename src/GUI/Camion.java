/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author USUARIO
 */
public class Camion extends Vehiculo {
    private int capacidadToneladas;
    private int ejes;
    private double costoMantenimiento;
    private boolean remolque;
    
    public Camion(){
        
    }

    public Camion(int capacidadToneladas, int ejes, double costoMantenimiento, boolean remolque) {
        this.capacidadToneladas = capacidadToneladas;
        this.ejes = ejes;
        this.costoMantenimiento = costoMantenimiento;
        this.remolque = remolque;
    }

    public Camion(int capacidadToneladas, int ejes, double costoMantenimiento, boolean remolque, String marca, String modelo, int anio, double precioBase) {
        super(marca, modelo, anio, precioBase);
        this.capacidadToneladas = capacidadToneladas;
        this.ejes = ejes;
        this.costoMantenimiento = costoMantenimiento;
        this.remolque = remolque;
    }
    
    public int getCapacidadToneladas() {
        return capacidadToneladas;
    }

    public void setCapacidadToneladas(int capacidadToneladas) {
        this.capacidadToneladas = capacidadToneladas;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public double getCostoMantenimiento() {
        return costoMantenimiento;
    }

    public void setCostoMantenimiento(double costoMantenimiento) {
        this.costoMantenimiento = costoMantenimiento;
    }

    public boolean isRemolque() {
        return remolque;
    }

    public void setRemolque(boolean remolque) {
        this.remolque = remolque;
    }
    
    @Override
    public double calcularTotal(){
        double total = getPrecioBase() + costoMantenimiento;
        if(isRemolque() && getCapacidadToneladas() > 10){
            return total = total + 1200 + 500;
        }
        if(isRemolque()){
            return total = total + 1200;
        }
        
        if(getCapacidadToneladas() > 10){
            return total = total + 500;
        }
        
        return total;
    }
    
    @Override
    public String mostrarInfo(){
        String info = super.mostrarInfo();
        return info + "Capacidad Toneladas: " + getCapacidadToneladas() + "\nEjes: " + ejes + "\nCosto Mantenimiento: " + getCostoMantenimiento() + "\nRemolque: " + (isRemolque() ? "Si" : "No") + "\n" + "\nTotal: " + calcularTotal();
    }
    
    
    
    
}
