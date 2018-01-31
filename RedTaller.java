/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redtaller;

import java.util.ArrayList;

/**
 *
 * @author autor
 */
public class RedTaller {

    private String nombre;
    private ArrayList<Cliente> clientes;
    private ArrayList<Taller> talleres;
    private ArrayList<Vehiculo> coches;

    RedTaller(String nombre) {

        this.nombre = nombre;
        clientes = new ArrayList<Cliente>();
        coches = new ArrayList<Vehiculo>();
        talleres = new ArrayList<Taller>();

    }

    public static void main(String[] args) {
        
  
    }

    public Cliente crearCliente(int dni, String nom, String fecha, int tlf) {
        Cliente cliente = new Cliente(dni, nom, fecha, tlf);
        cliente.setRedtaller(this);
        clientes.add(cliente);
        return cliente;
    }

    public Vehiculo crearVehiculo(int matri, String marca, String modelo, int km, String color) {
        Vehiculo coche = new Vehiculo(matri, marca, modelo, km, color);
        coche.setRedtaller(this);
        coches.add(coche);
        return coche;
    }

    public Taller crearTaller(int codi, String nombre, String direc, int tlf) {
        Taller taller = new Taller(codi, nombre, direc, tlf);
        taller.setRedtaller(this);
        talleres.add(taller);
        return taller;
    }

    public void reportClientes() {
        for (int i = 0; i < clientes.size(); i++) {
            System.out.print(clientes.get(i).getNombre()
                    + " " + clientes.get(i).getDni());
        }
    }
    
    public void reportVehiculos() {
        for(int i = 0; i< coches.size();i++){
            System.out.print(coches.get(i).getMarca()
            +" "+coches.get(i).getModelo()+" "+coches.get(i).getMatricula()
            +" "+coches.get(i).getCliente().getNombre());
        }
    }
    
    public void reportTalleres() {
        for(int i = 0;i<talleres.size();i++){
            System.out.print(talleres.get(i).getNombre()
            +" "+talleres.get(i).getCodi()
            +" "+talleres.get(i).getTelefono());
        }
    }
    
    public void busquedadni(String dato,ArrayList array){
        
        
    }
    
    public  
    
    public void infoCliente(String dni){
        
    }

}
