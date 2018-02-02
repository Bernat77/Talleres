/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redtaller;

/**
 *
 * @author dam1a14
 */
public class Vehiculo {
    
    private int matricula;
    private String marca;
    private String modelo;
    private int kilometraje;
    private Cliente cliente;
    private Taller taller;
    private RedTaller redtaller;
    private String color;
    private boolean reparandose;
    
    public Vehiculo(int matricula,String marca, String modelo, int kilometraje,String color){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.kilometraje=kilometraje;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente=cliente;
    }
    
    public void setTaller(Taller taller){
        this.taller=taller;
    }
    
    public void setRedtaller(RedTaller redtaller){
        this.redtaller=redtaller;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getMatricula() {
        return matricula;
    }
    
    public Cliente getCliente(){
        Cliente hola=cliente;
        return hola;
    }
    
    public Taller getTaller(){
        Taller hola = taller;
        return hola;
    }

    public RedTaller getRedtaller(){
        RedTaller hola = redtaller;
        return hola;
    }
    
    public void vehiculoInfo(Vehiculo coche){
        System.out.println("Matricula: "+coche.getMatricula()
            +" Marca: "+coche.getMarca()+" Propietario: "+coche.getCliente());
    }
    
}
