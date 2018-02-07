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

    public Vehiculo(int matricula, String marca, String modelo, int kilometraje, String color) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setTaller(Taller taller) {
        this.taller = taller;
    }

    public void setRedtaller(RedTaller redtaller) {
        this.redtaller = redtaller;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setReparandose(boolean reparandose) {
        this.reparandose = reparandose;
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

    public Cliente getCliente() {
        Cliente hola = cliente;
        return hola;
    }

    public Taller getTaller() {
        Taller hola = taller;
        return hola;
    }

    public RedTaller getRedtaller() {
        RedTaller hola = redtaller;
        return hola;
    }

    public String getColor() {
        return color;
    }

    public boolean isReparandose() {
        return reparandose;
    }

    public void vehiculoInfo() {
        System.out.print("Matricula: " + matricula
                + ", Marca: " + marca + ", Modelo: " + modelo + ", Propietario: ");
        if (cliente != null) {
            System.out.print(cliente.getNombre());
        } else {
            System.out.print("Nadie. ");
        }
        System.out.print(", Taller actual: ");
        if (taller != null) {
            System.out.print(taller.getNombre());
        } else {
            System.out.print("Ninguno");
        }
        System.out.print(", Estado:");
        if (reparandose == true) {
            System.out.println(" En reparaciones");
        } else {
            System.out.println(" Reparado");
        }
    }
}
