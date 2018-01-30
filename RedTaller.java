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
    private ArrayList<Taller> talleres;
    private ArrayList<Vehiculo> coches;
    private ArrayList<Cliente> payasos;
    private ArrayList<RedTaller> redes;
    
    RedTaller(String nombre){
        this.nombre=nombre;
        talleres = new ArrayList<Taller>();
        coches = new ArrayList<Vehiculo>();
        payasos = new ArrayList<Cliente>();
        redes = new ArrayList<RedTaller>();
    }

    public static void main(String[] args) {
        
    }
    
    public Cliente crearCliente(int dni,String nom,String fecha,int tlf){
        Cliente culo =  new Cliente(dni,nom,fecha,tlf);
        culo.setRedtaller(this);
        return culo;
    }
    
}
