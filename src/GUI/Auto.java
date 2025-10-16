/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author USUARIO
 */
public class Auto extends Vehiculo{
    private int puertas;
    private String tipoCombustible;
    private boolean aireAcondicionado;
    private double descuento;
    
    public Auto(){
        
    }

    public Auto(int puertas, String tipoCombustible, boolean aireAcondicionado, double descuento) {
        this.puertas = puertas;
        this.tipoCombustible = tipoCombustible;
        this.aireAcondicionado = aireAcondicionado;
        this.descuento = descuento;
    }

    public Auto(int puertas, String tipoCombustible, boolean aireAcondicionado, double descuento, String marca, String modelo, int anio, double precioBase) {
        super(marca, modelo, anio, precioBase);
        this.puertas = puertas;
        this.tipoCombustible = tipoCombustible;
        this.aireAcondicionado = aireAcondicionado;
        this.descuento = descuento;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        if(puertas < 0){
            this.puertas = 0;
        }
        else{
        this.puertas = puertas;
        }
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = getPrecioBase() * descuento / 100;
    }
    
    @Override
    public double calcularTotal(){
        double total = super.calcularTotal();
        if(isAireAcondicionado()){
            return total = (total + 800) - getDescuento();
        }
        
        return total = total - getDescuento();
        
    }
    @Override
    public String mostrarInfo(){
        String info = super.mostrarInfo();
        return info + "\nPuertas: " + puertas + "\nTipo Combustible: " + tipoCombustible + "\nAire Acondicionado: " + (isAireAcondicionado() ? "Si" : "No") + "\nDescuento: " + descuento + "\nTotal: " + calcularTotal() + "\n";
    }
    
    
    
}
