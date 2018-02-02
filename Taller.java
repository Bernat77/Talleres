/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redtaller;
import java.util.ArrayList;

/**
 *
 * @author dam1a14
 */
public class Taller {
    private int codi;
    private String nombre;
    private String direccion;
    private int telefono;
    private ArrayList<Vehiculo> coches;
    private RedTaller redtaller;

    public Taller(int codi, String nombre, String direccion, int telefono) {
        this.codi = codi;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        coches=new ArrayList<Vehiculo>();
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Vehiculo> getCoches() {
        return coches;
    }

    public RedTaller getRedtaller() {
        return redtaller;
    }

    public void setRedtaller(RedTaller redtaller) {
        this.redtaller = redtaller;
    }
    
    public void addVehiculo(Vehiculo coche){
        coches.add(coche);
        coche.setTaller(this);
    }
    
    public void removeVehiculo(Vehiculo coche){
        coches.remove(coche);
        coche.setTaller(null);
    }
    
    public void reportVehiculos(){
        System.out.println(nombre);
        for(int i = 0;i<coches.size();i++){
            System.out.println(coches.get(i).getMarca() +
                    " "+ coches.get(i).getModelo() + 
                    " "+ coches.get(i).getMatricula() +
                    " "+ coches.get(i).getCliente().getNombre());
        }    
    }
    
    public void tallerInfo(Taller taller){
        System.out.println("Taller: "+taller.getNombre()+" Código: "
                +taller.getCodi()+" Dirección: "+taller.getDireccion()
                +" Telf: "+taller.getTelefono());
    }
    
}
