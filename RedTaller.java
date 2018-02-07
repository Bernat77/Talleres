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

        RedTaller red1 = new RedTaller("Red Mallorca");

        Taller taller1 = red1.crearTaller(0110, "Taller del Chocu", "C/Selva de lepra nº5", 971892370);
        Taller taller2 = red1.crearTaller(0111, "Taller de Stalin", "C/San Petesburgo", 972342372);
        Cliente jesucristo = red1.crearCliente(100, "Jesucristo Fernández", "1/2/2020", 829383);
        Cliente pollachu = red1.crearCliente(1234, "Pollachu García", "3/2/1020", 2893334);
        Vehiculo cochedejesus = red1.crearVehiculo(200, "Tupu", "tamadre", 124, "azul");
        Vehiculo papamovil = red1.crearVehiculo(300, "Mercedes", "Benz", 2, "Negro satán");
        jesucristo.addVehiculo(cochedejesus);
        taller1.addVehiculo(cochedejesus);
        red1.reportVehiculos();
        red1.reportClientes();
        red1.reportTalleres();
        red1.infoVehiculo(200);
        red1.cambioDueño(cochedejesus, pollachu);
        red1.infoVehiculo(200);
        pollachu.addVehiculo(papamovil);
        taller2.addVehiculo(papamovil);
        pollachu.reportVehiculos();
        jesucristo.reportVehiculos();
        taller1.reportVehiculos();
        taller2.reportVehiculos();
        red1.cambioTaller(taller1, papamovil);
        taller1.reportVehiculos();

    }

    public Cliente crearCliente(int dni, String nom, String fecha, int tlf) {
        if (busquedaDni(dni) != null) {
            System.out.println("Este cliente ya existe");
            return null;
        }
        Cliente cliente = new Cliente(dni, nom, fecha, tlf);
        cliente.setRedtaller(this);
        clientes.add(cliente);
        return cliente;
    }

    public Vehiculo crearVehiculo(int matri, String marca, String modelo, int km, String color) {
        if (busquedaMatricula(matri) != null) {
            System.out.println("Este vehiculo ya existe");
            return null;
        }
        Vehiculo coche = new Vehiculo(matri, marca, modelo, km, color);
        coche.setRedtaller(this);
        coches.add(coche);
        return coche;
    }

    public Taller crearTaller(int codi, String nombre, String direc, int tlf) {
        if (busquedaCodigotaller(codi) != null) {
            System.out.println("Este taller ya existe");
            return null;
        }
        Taller taller = new Taller(codi, nombre, direc, tlf);
        taller.setRedtaller(this);
        talleres.add(taller);
        return taller;

    }

    public void reportClientes() {
        System.out.println("--------------Clientes de " + nombre + "--------------");
        for (int i = 0; i < clientes.size(); i++) {
            clientes.get(i).clienteInfo();
        }
    }

    public void reportVehiculos() {
        System.out.println("--------------Vehículos de " + nombre + "--------------");
        for (int i = 0; i < coches.size(); i++) {
            coches.get(i).vehiculoInfo();
        }
    }

    public void reportTalleres() {
        System.out.println("--------------Talleres de " + nombre + "--------------");
        for (int i = 0; i < talleres.size(); i++) {
            talleres.get(i).tallerInfo();
        }
    }

    public Cliente busquedaDni(int dni) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getDni() == dni) {
                return clientes.get(i);
            }
        }
        return null;
    }

    public Vehiculo busquedaMatricula(int matricula) {

        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i).getMatricula() == matricula) {
                return coches.get(i);
            }
        }
        return null;
    }

    public Taller busquedaCodigotaller(int codi) {

        for (int i = 0; i < talleres.size(); i++) {
            if (talleres.get(i).getCodi() == codi) {
                return talleres.get(i);
            }
        }
        return null;
    }

    public void infoCliente(int dni) {
        if (busquedaDni(dni) != null) {
            busquedaDni(dni).clienteInfo();
        } else {
            System.out.print("Este cliente no existe en nuestra base de datos.");
        }
    }

    public void infoVehiculo(int matricula) {
        if (busquedaMatricula(matricula) != null) {
            busquedaMatricula(matricula).vehiculoInfo();
        } else {
            System.out.print("Este vehículo no existe en nuestra base de datos.");
        }
    }

    public void cambioDueño(Vehiculo coche, Cliente nuevodueño) {
        if (coche.getCliente() == nuevodueño) {
            System.out.println("El dueño al que desea cambiar es el propietario actual");
        } else {
            coche.getCliente().removeVehiculo(coche);
            nuevodueño.addVehiculo(coche);
        }
    }

    public void cambioTaller(Taller taller, Vehiculo coche) {
        if (coche.getTaller() == taller) {
            System.out.println("El taller al que desea cambiar es el mismo taller donde se ubica actualmente este vehículo");
        } else {
            coche.getTaller().removeVehiculo(coche);
            taller.addVehiculo(coche);
        }
    }

}
